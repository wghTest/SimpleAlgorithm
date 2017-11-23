package com.will.utils;

public class SortUtil {
	
	/**
	 * 自己写的排序--从小到大
	 * 找到比min还小的就和第一个数（未排好的）的交换
	 * @param param
	 * @return
	 */
	public static int[] sort(int[] param) {
		for (int i = 0;i < param.length;i ++) {
			int min = param[i];
			for (int j = i;j < param.length - 1;j ++) {
				if (min > param[j+1]) {
					min = param[j+1];
					param[j+1] = param[i];
					param[i] = min;
				}
			}
		}
		return param;
	}
	
	/**
	 * 选择排序--从小到大
	 * 每一遍找到最小的和第一个数（未排好的）交换
	 * @param param
	 * @return
	 */
	public static int[] sortBySelect(int[] param) {
		for (int i = 0;i < param.length;i ++) {
			int min = param[i];
			int index = i;
			for (int j = i + 1;j < param.length;j ++) {
				if (min > param[j]) {
					min = param[j];
					index = j;
				}
			}
			param[index] = param[i];
			param[i] = min;
		}
		return param;
	}
	
	/**
	 * 冒泡排序--从小到大
	 * 每一遍找到最小的和第一个数（未排好的）交换
	 * @param param
	 * @return
	 */
	public static int[] sortByBubbling(int[] param) {
		for (int i = 0;i < param.length;i ++) {
			for (int j = 0;j <param.length - i - 1;j ++) {
				if (param[j] > param[j + 1]) {
					int temp = param[j];
					param[j] = param[j + 1];
					param[j + 1] = temp;
				}
			}
		}
		return param;
	}
}
