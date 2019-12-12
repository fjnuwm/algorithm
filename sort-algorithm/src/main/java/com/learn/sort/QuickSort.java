package com.learn.sort;

public class QuickSort {
  public static int[] sort(int[] nums) {
    if (nums == null || nums.length <= 1) {
      return nums;
    }
    int[] sortedNums = nums.clone();
    doSort(sortedNums, 0, nums.length - 1);
    return sortedNums;
  }

  private static void doSort(int[] nums, int low, int high) {
    if (low < high) {
      int baseIdx = partition(nums, low, high);
      doSort(nums, low, baseIdx - 1);
      doSort(nums, baseIdx + 1, high);
    }
  }

  private static int partition(int[] nums, int low, int high) {
    int baseNum = nums[low];
    while (low < high) {
      while (low < high && nums[high] >= baseNum) high--;
      nums[low] = nums[high];
      while (low < high && nums[low] <= baseNum) low++;
      nums[high] = nums[low];
    }
    nums[low] = baseNum;
    return low;
  }
}
