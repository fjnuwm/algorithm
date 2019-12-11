package com.learn.sort;

/**
 * 插入排序，将第一个元素当成有序数组，从第二个开始与有序数组里的数据比较并插入到合适的位置
 */
public class InsertionSort {
  public static int[] sort(int[] nums) {
    if (nums == null && nums.length <= 1) {
      return nums;
    }

    int[] sortedNums = nums.clone();
    int len = nums.length;
    for (int i = 1; i <= len - 1; i++) {
      for (int j = i; j > 0; j--) {
        if (sortedNums[j] < sortedNums[j - 1]) {
          sortedNums[j - 1] ^= sortedNums[j];
          sortedNums[j] ^= sortedNums[j - 1];
          sortedNums[j - 1] ^= sortedNums[j];
        }
      }
    }
    return sortedNums;
  }
}
