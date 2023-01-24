package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {
        

        Set<Long> visited = new HashSet<>();
        Queue<Long> q = new LinkedList<>();
        int numMoves = 0;
        q.offer(1L);
        while (!q.isEmpty()) {
            int qSize = q.size();
            for (int i = 0; i < qSize; i++) {
                long cur = q.poll();
                if (cur == target) {
                    return numMoves;
                }
                if (!visited.contains(cur + 1) && (cur + 1) <= target) {
                    visited.add(cur + 1);
                    q.offer(cur + 1);
                }
                if (numMoves < maxDoubles && !visited.contains(cur * 2) && (cur * 2) <= target) {
                    visited.add(cur * 2);
                    q.offer(cur * 2);
                }
            }
            numMoves++;
        }
        return -1;
    }

public class Sorting {
	
	public static Point temp[] = new Point[1000];
	
	public static void merge(Point a[],int start,int mid,int end) {
		int i = start,j = mid+1,k = start;
		for(int p = start;p<=end;p++) {
			if(i<=mid && j<=end) {
				if(a[i].x<a[j].x) {
					temp[k++] = a[i++];
				}else if(a[i].x>a[j].x) {
					temp[k++] = a[j++];
				}else {
					if(a[i].y<a[j].y) {
						temp[k++] = a[i++];
					}else {
						temp[k++] = a[j++];
					}
				}
			}else if(i<=mid) {
				temp[k++] = a[i++];
			}else if(j<=end) {
				temp[k++] = a[j++];
			}
		}
		for(int p = start;p<=end;p++) {
			a[p] = temp[p];
		}
	}
	
	public static void mergeSort(Point a[],int start,int end) {
		if(start<end) {
			int mid = (start+end)/2;
			mergeSort(a,start,mid);
			mergeSort(a,mid+1,end);
			merge(a,start,mid,end);
		}
	}
	
	public static int getOrientation(Point p1,Point p2,Point p3) {
		long val = ((p2.y-p1.y)*(p3.x-p2.x))-((p2.x-p1.x)*(p3.y-p2.y));
		if(val==0) {
			return 0;
		}
		if(val>0) {
			return 1;
		}
		return 2;
	}
	
	public static void quickSort(Point a[],int start,int end) {
		if(start<end) {
			Point p = a[end];
			int i = start-1;
			for(int j=start;j<end;j++) {
				if(a[j].x==p.x) {
					if(a[j].y<p.y) {
						swap(a,++i,j);
					}
				}else if(a[j].x<p.x) {
					swap(a,++i,j);
				}
			}
			swap(a,++i,end);
			quickSort(a,start,i-1);
			quickSort(a,i+1,end);
		}
	}
	
	public static void swap(Point a[],int i,int j) {
		Point temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
}
}