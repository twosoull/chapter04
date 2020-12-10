package com.javaex.ex04;

import java.util.LinkedList;
import java.util.List;

public class ListApp {

	public static void main(String[] args) {
		//ArrayList + 사각형 
	//	ArrayList<Rectangle> rList = new ArrayList<Rectangle>();
		
		List<Rectangle> rList = new LinkedList<Rectangle>();
		//add()
		Rectangle r01 = new Rectangle(3,3);
		Rectangle r02 = new Rectangle(4,5);
		rList.add(r01);
		rList.add(r02);
		
		//get()
		Rectangle r = rList.get(0);
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
		r.draw();
		System.out.println(rList.toString());
		
		System.out.println(rList.size());
		
		//get과 사이즈를 이용해서 전체출력
		//rList.get(0)은 add()를 통해 주입한 Rectangle 객체와
		//<Rectangle>로 타입형을 만들어줬으니 캐스팅없이 그냥 출력한다
		for(int i = 0 ; i<rList.size(); i++) {
			rList.get(i).draw();
		}
		//순서 정해서 넣기
		System.out.println("==========");
		Rectangle r03 = new Rectangle(100,100);
//		rList.add(r03); //추가한뒤에 확인하면 차례대로 뒤에 들어간다
		rList.add(0,r03); //추가한뒤에 확인하면 앞에 붙인 번호로 들어간다
		
		for(int i = 0 ; i<rList.size(); i++) {
			rList.get(i).draw();
		}
		
		
		//삭제
		System.out.println("==========");
		rList.remove(0);
		for(int i = 0 ; i<rList.size(); i++) {
			rList.get(i).draw();
		}
		
		System.out.println("==========");
		rList.remove(r02); //주소 값으로 던져주기
		for(int i = 0 ; i<rList.size(); i++) {
			rList.get(i).draw();
		}
		////////////////////////////////////////////////
		System.out.println("=======원===========");
	//	ArrayList<Circle> cList = new ArrayList<Circle>();
		LinkedList<Circle> cList = new LinkedList<Circle>();
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(500);
		
		cList.add(c01);
		cList.add(c02);
//		cList.add(r01); 서클만 올수있음 사각형 x
		for(int i = 0 ; i<cList.size(); i++) {
			cList.get(i).draw();
		}
		
		System.out.println(rList.toString());
	}
}
