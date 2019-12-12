package com.learn.sort;

public class MergeSort {
  public static int[] sort(int[] nums) {
    if (nums == null || nums.length <= 1) {
      return nums;
    }
    int[] sortedNums = nums.clone();
    doSort(sortedNums, 0, sortedNums.length - 1);
    return sortedNums;
  }

  private static void doSort(int[] nums, int left, int right) {
    if (left >= right) {
      return;
    }
    int mid = (left + right) / 2;
    doSort(nums, left, mid);
    doSort(nums, mid + 1, right);
    merge(nums, left, mid, right);
  }

  private static void merge(int[] nums, int left, int mid, int right) {
    int[] tempNums = new int[nums.length];
    int i = left;
    int j = mid + 1;
    int tempIdx = 0;
    while (i <= mid && j <= right) {
      if (nums[i] <= nums[j]) {
        tempNums[tempIdx++] = nums[i++];
      } else {
        tempNums[tempIdx++] = nums[j++];
      }
    }

    for (; i <= mid; i++) {
      tempNums[tempIdx++] = nums[i];
    }

    for (; j <= right; j++) {
      tempNums[tempIdx++] = nums[j];
    }

    tempIdx = 0;
    while (left <= right) {
      nums[left++] = tempNums[tempIdx++];
    }
  }
}
