package com.javaex.ex08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {
	//HashMap사용하기
	
	public static void main(String[] args) {
		Map<String,Point> pMap = new HashMap<String,Point>();
		
		Point p01 = new Point(1,1);
		Point p02 = new Point(2,2);
		Point p03 = new Point(3,3);
		Point p04 = new Point(4,4);
		
		pMap.put("박명수",p01);
		pMap.put("유재석",p02);
		pMap.put("정준하",p03);
		pMap.put("이효리",p04);
		
		System.out.println(pMap.toString());
		System.out.println(pMap.get("유재석").getX());
		System.out.println(pMap.get("박명수"));
		
		Point p05 = new Point(5,5);
		pMap.put("박명수",p05);
		
		System.out.println(pMap.toString());
		
		//Map에서 key값은 Set으로 관리되고 있다.
		System.out.println("=============");
		System.out.println("keySet"+pMap.keySet()); //keySet()은 모든 키를 보여준다.
		Set<String> keys = pMap.keySet(); // ketSet은 set으로 운영되기때문에  set타입에  그 값을 줄수있다.
		for(String key : keys) {//key라는 변수에 세트에 담은 키 값들을 하나씩 옮겨준다
			System.out.println(pMap.get(key).getX());
			//get(키)를 넣어주면 들어있는 객체를 꺼내와지는데  그 객체의 메소드를 사용할 수 있게된다.
		}
	}
}	

