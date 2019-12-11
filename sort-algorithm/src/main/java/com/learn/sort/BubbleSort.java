package com.learn.sort;

/**
 * 冒泡排序，遍历未排序的数组，两两比较，大的放在最后面
 */
public class BubbleSort {
  public static int[] sort(int[] nums) {
    if (nums == null || nums.length <= 1) {
      return nums;
    }
    int[] sortedNums = nums.clone();

    int len = nums.length;
    for (int i = 0; i < len - 1; i++) {
      for (int j = 0; j < len - 1 - i; j++) {
        if (sortedNums[j] > sortedNums[j+1]) {
          sortedNums[j] ^= sortedNums[j+1];
          sortedNums[j+1] ^= sortedNums[j];
          sortedNums[j] ^= sortedNums[j+1];
        }
      }
    }
    return sortedNums;
  }
}
