package com.example.util;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String test = "　１ ,２? ３##　　　４５    ６　　＆７!!!８　９  ";
		String test2 = "１,２,３";
		
		List<String> tests = Arrays.asList(test.strip().replaceAll("[?#!＆,]", "%").replaceAll("[%]{2,}", "%").replaceAll(" ", "　").replaceAll("[　]{2,}", "　").split("　"));
		List<String> tests2 = Arrays.asList(test2.split(","));
		System.out.println(tests.toString());
	}

}
