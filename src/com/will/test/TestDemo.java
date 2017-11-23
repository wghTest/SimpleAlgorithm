package com.will.test;


import com.will.utils.SortUtil;

public class TestDemo {

	public static void main(String[] args) {
		int[] param = {49,38,65,97,76,13,27,49,78,34,12,64,1,8};
		int[] result = SortUtil.sort(param);
		
		for (int i = 0;i < result.length;i ++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
		System.out.println("**********************************");
		result = SortUtil.sortBySelect(param);
		
		for (int i = 0;i < result.length;i ++) {
			System.out.print(result[i] + " ");
		}
	}

}
