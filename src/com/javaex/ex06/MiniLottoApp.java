package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class MiniLottoApp {
	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<Integer>();
		/*
		while(true) {
			int a = (int)(Math.random()*45)+1;
			lotto.add(a);
			if(lotto.size() ==45) {
				break;
			}
		}
		
		System.out.println("=========");
		int[] result = new int[39];
		int b = 0;
		for(int i = 0; i <result.length; i++) {
			result[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(result[j] == result[i]) {
					i--;
				}
			}
		}
		for(int i = 0; i<39; i++) {
			lotto.remove(result[i]);
		}
		
		for(Integer i : lotto) {
			System.out.println(i.toString());
		}
		*/
		while(lotto.size()<6) {
			int num =(int)(Math.random()*45)+1;
			lotto.add(num);
		}
		for(int i : lotto) {
			System.out.print(i+" ");		
			}
	}
}
