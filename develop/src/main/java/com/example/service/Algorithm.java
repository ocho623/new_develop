package com.example.service;

import java.util.Random;

/**
 * @author tomoyukimurase
 *
 * バブルソートにより整列させた配列を返す
 * 
 */
public class Algorithm {
	public int[] bubbleSort(int[] args) {

		if (args == null || args.length == 0) {
			System.out.println("引数不正");
			return new int[0];
		}

		int[] sortedArgs = new int[args.length];
		for (int arg : args) {
			if(sortedArgs.length == 0) {
//				sortedArgs
			}

		}

		return sortedArgs;
	}

	/**
	 * @author tomoyukimurase
	 *
	 */
	public void main() {

		Random r = new Random();

		int[] array = new int[8];

		for (int i = 0; i < array.length; i++) {

			array[i] = r.nextInt(30);

		}
	}
}
