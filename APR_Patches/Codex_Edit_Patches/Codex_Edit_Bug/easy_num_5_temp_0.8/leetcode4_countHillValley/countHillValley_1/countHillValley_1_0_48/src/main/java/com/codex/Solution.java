package com.codex;

import java.util.*;

public class Solution {
package p1.p2;

import java.util.List;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.TextView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListAdapter;
import android.widget.ListView;

public class IndexScroller {
    
    private float mIndexbarWidth;
    private float mIndexbarMargin;
    private float mPreviewPadding;
    private float mDensity;
    private float mScaledDensity;
    private float mAlphaRate;
    private int mState = STATE_SHOWN;
    private int mListViewWidth;
    private int mListViewHeight;
    private int mCurrentSection = -1;
    private boolean mIsIndexing = false;
    private ListView mListView = null;
    private SectionIndexer mIndexer = null;
    private String[] mSections = null;
    private Rect mIndexbarRect;

    private static final int STATE_HIDDEN = 0;
    private static final int STATE_SHOWING = 1;
    private static final int STATE_SHOWN = 2;
    private static final int STATE_HIDING = 3;
        
    public IndexScroller(Context context, ListView lv) {
		mDensity = context.getResources().getDisplayMetrics().density;
		mScaledDensity = context.getResources().getDisplayMetrics().scaledDensity;
		mListView = lv;
		setAdapter(mListView.getAdapter());
		
		mIndexbarWidth = 20 * mDensity;
		mIndexbarMargin = 10 * mDensity;
		mPreviewPadding = 5 * mDensity;
    }

    public void draw(Canvas canvas) {
		if (mState == STATE_HIDDEN)
			return;
		
		// mAlphaRate determines the rate of opacity
		Paint indexbarPaint = new Paint();
		indexbarPaint.setColor(Color.BLACK);
		indexbarPaint.setAlpha((int) (64 * mAlphaRate));
		indexbarPaint.setAntiAlias(true);
		canvas.drawRoundRect(mIndexbarRect, 5 * mDensity, 5 * mDensity, indexbarPaint);
		
		if (mSections != null && mSections.length > 0) {
			// Preview is shown when mCurrentSection is set
			if (mCurrentSection >= 0) {
				Paint previewPaint = new Paint();
				previewPaint.setColor(Color.BLACK);
				previewPaint.setAlpha(96);
				previewPaint.setAntiAlias(true);
				previewPaint.setShadowLayer(3, 0, 0, Color.argb(64, 0, 0, 0));
				
				Paint previewTextPaint = new Paint();
				previewTextPaint.setColor(Color.WHITE);
				previewTextPaint.setAntiAlias(true);
				previewTextPaint.setTextSize(50 * mScaledDensity);
				
				float previewTextWidth = previewTextPaint.measureText(mSections[mCurrentSection]);
				float previewSize = 2 * mPreviewPadding + previewTextPaint.descent() - previewTextPaint.ascent();
				RectF previewRect = new RectF((mListViewWidth - previewSize) / 2
						, (mListViewHeight - previewSize) / 2
						, (mListViewWidth - previewSize) / 2 + previewSize
						, (mListViewHeight - previewSize) / 2 + previewSize);
				
				canvas.drawRoundRect(previewRect, 5 * mDensity, 5 * mDensity, previewPaint);
				canvas.drawText(mSections[mCurrentSection], previewRect.left + (previewSize - previewTextWidth) / 2 - 1
						, previewRect.top + mPreviewPadding - previewTextPaint.ascent() + 1, previewTextPaint);
			}
			
			Paint indexPaint = new Paint();
			indexPaint.setColor(Color.WHITE);
			indexPaint.setAlpha((int) (255 * mAlphaRate));
			indexPaint.setAntiAlias(true);
			indexPaint.setTextSize(12 * mScaledDensity);
			
			float sectionHeight = (mIndexbarRect.height() - 2 * mIndexbarMargin) / mSections.length;
			float paddingTop = (sectionHeight - (indexPaint.descent() - indexPaint.ascent())) / 2;
			for (int i = 0; i < mSections.length; i++) {
				float paddingLeft = (mIndexbarWidth - indexPaint.measureText(mSections[i])) / 2;
				canvas.drawText(mSections[i], mIndexbarRect.left + paddingLeft
						, mIndexbarRect.top + mIndexbarMargin + sectionHeight * i + paddingTop - indexPaint.ascent(), indexPaint);
			}
		}
	}
    
    
    
}