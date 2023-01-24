package com.codex;

import java.util.*;

public class Solution {
public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {
  int count = 0;
  Set<Integer> toRemove = new HashSet<>();
  Map<Integer, Set<int[]>> map = new HashMap<>();
  for (int i = 0; i < artifacts.length; i++) {
    int[] artifact = artifacts[i];
    int r1 = artifact[0];
    int c1 = artifact[1];
    int r2 = artifact[2];
    int c2 = artifact[3];
    for (int r = r1; r <= r2; r++) {
      for (int c = c1; c <= c2; c++) {
        int index = r * n + c;
        if (!map.containsKey(index)) map.put(index, new HashSet<>());
        map.get(index).add(artifact);
      }
    }
  }
  for (int[] digpos : dig) {
    int r = digpos[0];
    int c = digpos[1];
    int index = r * n + c;
    if (!map.containsKey(index)) continue;
    Set<int[]> set = map.get(index);
    for (int[] artifact : set) {
      toRemove.add(Arrays.hashCode(artifact));
    }
  }
  return toRemove.size();
}



//知道删几个索引,但是不知道哪几个  
//用hashcode可以知道这个索引是不是被删除了 
int[] remove(int[] arr, int[] indices){
  Set<Integer> set = new HashSet<>();
  for (int i : indices) {
    set.add(i);
        }
  }
  List<Integer> list = new ArrayList<>();
  for (int i = 0; i < arr.length; i++) {
    if (!set.contains(i)) {
      list.add(arr[i]);
    }
  }
  int[] res = new int[list.size()];
  for (int i = 0; i < res.length; i++) {
    res[i] = list.get(i);
  }
  return res;
}


//知道被删除的哪几个, 但是不知道用哪几个索引
class MinHeap {
  int[] heap;
  int size;

  public MinHeap(int[] array) {
    heap = array;
    size = heap.length;
    buildHeap();
  }

  public void buildHeap() {
    for (int i = size / 2; i >= 0; i--) {
      heapify(i);
        }
    }

  public void heapify(int i) {
    int left = i * 2 + 1;
    int right = i * 2 + 2;
    int min = i;
    if (left < size && heap[left] < heap[min]) min = left;
    if (right < size && heap[right] < heap[min]) min = right;
    if (min != i) {
      swap(min, i);
      heapify(min);
    }
  }

  public int poll() {
    int res = heap[0];
    swap(0, size - 1);
    size--;
    heapify(0);
    return res;
  }
  
  public int peek() {
    return heap[0];
  }

  public int offer(int val) {
    heap[size++] = val;
    int i = size - 1;
    while (i > 0) {
      int parent = (i - 1) / 2;
      if (heap[i] < heap[parent]) {
        swap(i, parent);
        i = parent;
      } else {
        break;
      }
    }
    return 0;
  }

  public int replace(int val) {
    int res = heap[0];
    heap[0] = val;
    heapify(0);
    return res;
  }

  public int getSize() {
    return size;
  }

  public void swap(int i, int j) {
    int temp = heap[i];
    heap[i] = heap[j];
    heap[j] = temp;
  }
}





    
}