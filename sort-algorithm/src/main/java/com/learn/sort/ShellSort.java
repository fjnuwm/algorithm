package com.learn.sort;

/**
 * 希尔排序，通过将数组划分成片段做插入排序
 */
public class ShellSort {
  public static int[] sort(int[] nums) {
    if (nums == null || nums.length <= 1) {
      return nums;
    }
    int[] sortedNums = nums.clone();
    int len = nums.length;
    for (int gap = len / 2; gap > 0; gap /= 2) {
      for (int i = gap; i < len; i++) {
        int j = i;
        while ((j = j - gap) >= 0) {
          if (sortedNums[j] > sortedNums[j + gap]) {
            sortedNums[j + gap] ^= sortedNums[j];
            sortedNums[j] ^= sortedNums[j + gap];
            sortedNums[j + gap] ^= sortedNums[j];
          }
        }
      }
    }

    return sortedNums;
  }
}