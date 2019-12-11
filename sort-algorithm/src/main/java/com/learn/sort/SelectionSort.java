package com.learn.sort;

/**
 * 比较排序，将最小的放在前面。每次遍历未排序的数组，并记录最小索引，遍历完成后将最小值放到未排序数组第一位
 */
public class SelectionSort {
  public static int[] sort(int[] nums) {
    if (nums == null || nums.length <= 1) {
      return nums;
    }
    int[] sortedNums = nums.clone();
    int len = nums.length;
    for (int i = 0; i < len - 1; i++) {
      int minIdx = i;
      for (int j = i + 1; j <= len - 1; j++) {
        if (sortedNums[j] < sortedNums[minIdx]) {
          minIdx = j;
        }
      }

      if (minIdx != i) {
        sortedNums[i] ^= sortedNums[minIdx];
        sortedNums[minIdx] ^= sortedNums[i];
        sortedNums[i] ^= sortedNums[minIdx];
      }
    }
    return sortedNums;
  }
}
