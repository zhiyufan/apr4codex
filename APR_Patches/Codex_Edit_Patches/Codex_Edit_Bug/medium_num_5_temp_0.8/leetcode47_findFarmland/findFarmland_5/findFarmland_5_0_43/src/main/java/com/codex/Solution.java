package com.codex;

import java.util.*;

public class Solution {
    public static int[][] findFarmland(int[][] land) {
        
        if (land == null || land.length < 1) return new int[][]{};
        Queue<Integer[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[land.length][land[0].length];
        List<int[]> ls = new ArrayList<>();
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[i].length; j++) {
                if (visited[i][j]) continue;
                int minI = land.length;
                int minJ = land[0].length;
                int maxI = 0;
                int maxJ = 0;
                queue.offer(new Integer[]{i, j});
                while (!queue.isEmpty()) {
                    Integer[] curr = queue.poll();
                    if (land[curr[0]][curr[1]] != 1 || visited[curr[0]][curr[1]]) continue;
                    visited[curr[0]][curr[1]] = true;
                    minI = Math.min(minI, curr[0]);
                    minJ = Math.min(minJ, curr[1]);
                    maxI = Math.max(maxI, curr[0]);
                    maxJ = Math.max(maxJ, curr[1]);
                    if (curr[0] - 1 >= 0 && !visited[curr[0] - 1][curr[1]]) {
                        queue.offer(new Integer[]{curr[0] - 1, curr[1]});
                    }
                    if (curr[1] - 1 >= 0 && !visited[curr[0]][curr[1] - 1]) {
                        queue.offer(new Integer[]{curr[0], curr[1] - 1});
                    }
                    if (curr[0] + 1 < land.length && !visited[curr[0] + 1][curr[1]]) {
                        queue.offer(new Integer[]{curr[0] + 1, curr[1]});
                    }
                    if (curr[1] + 1 < land[curr[0]].length && !visited[curr[0]][curr[1] + 1]) {
                        queue.offer(new Integer[]{curr[0], curr[1] + 1});
                    }
                }
                if (maxI - minI > 0 || maxJ - minJ > 0) {
                    ls.add(new int[]{minI, minJ, maxI, maxJ});
                }
            }
        }
        return ls.toArray(new int[0][0]);
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
		actionBar.setCustomView(R.layout.actionbar_layout);
		actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.main_background));
        actionBar.show();
		actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayUseLogoEnabled(true);

		setContentView(R.layout.activity_main);
		initView();
		initClickListener();
	}
	
	private void initClickListener() {
		mRelativeLayout_main.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_PICK,android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
				startActivityForResult(intent, 1);
			}
		});
		
		mButton_submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (mImageUri != null) {
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							try {
								Log.i(TAG, "onClick...");
								RequestParams params = new RequestParams();
								File file = new File(mImageUri.getPath());
								params.put("image", file);
								HttpUtils.post(MyConstants.BASE_URL+MyConstants.PATH_UPLOAD, params, new AsyncHttpResponseHandler() {
									
									@Override
									public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
										// TODO Auto-generated method stub
										Log.i(TAG, "onSuccess..." + statusCode);
										Gson gson = new GsonBuilder().create();
										Result result = gson.fromJson(new String(responseBody), Result.class);
										int[][] findland = result.getFindland();
										Log.i(TAG, "findland:"+findland.length);
									}
									
									@Override
									public void onFailure(int statusCode, Header[] headers,
											byte[] responseBody, Throwable error) {
										// TODO Auto-generated method stub
										Log.i(TAG, "onFailure..." + statusCode);
									}
								});
							} catch (Exception e) {
								// TODO: handle exception
								e.printStackTrace();
							}
						}
					}).start();
				}
			}
		});
	}
	
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		if (resultCode == Activity.RESULT_OK && requestCode == 1) {
			mImageUri = data.getData();
			Log.i(TAG, "mImageUri:" + mImageUri);
			Cursor cursor = getContentResolver().query(mImageUri, null, null, null, null);
			if (cursor != null && cursor.moveToFirst()) {
				String imagePath = cursor.getString(cursor.getColumnIndex("_data"));
				Log.i(TAG, "imagePath:"+imagePath);
				Bitmap bitmap = BitmapFactory.decodeFile(imagePath);
				mImageView_image.setImageBitmap(bitmap);
			}
		}
	}

	private void initView() {
		mRelativeLayout_main = (RelativeLayout) findViewById(R.id.main_relativelayout);
		mImageView_image = (ImageView) findViewById(R.id.main_imageview);
		mButton_submit = (Button) findViewById(R.id.main_button_submit);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		menu.add(0, 0, 0, "检索");
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(this, SearchActivity.class);
		startActivity(intent);
		return true;
	}



    
}