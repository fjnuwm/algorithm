package com.learn.sort;

import java.util.Arrays;
import java.util.Random;

public class SortUseDemo {
  private static Random random = new Random();
  private static int bound = 100000;

  private static int[] genNums(int length) {
    if (length <= 0) {
      return null;
    }
    int[] nums = new int[length];
    for (int i = 0; i < length - 1; i++) {
      nums[i] = random.nextInt(bound);
    }
    return nums;
  }

  public static void main(String[] args) {
    int[] nums = genNums(10);
    System.out.println(Arrays.toString(nums));

    System.out.println("冒泡排序:" + Arrays.toString(BubbleSort.sort(nums)));

    System.out.println("选择排序:" + Arrays.toString(SelectionSort.sort(nums)));

    System.out.println("插入排序:" + Arrays.toString(InsertionSort.sort(nums)));

    System.out.println("希尔排序:" + Arrays.toString(ShellSort.sort(nums)));
  }
}
