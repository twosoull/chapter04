package com.javaex.ex01;

public class ListApp {

	public static void main(String[] args) {
		// 사각형 사각형끼리
		// 원 원끼리
		// 삼각형 삼각형 끼리

		// 사각형 관리
		RectList rList = new RectList();

		Rectangle r01 = new Rectangle(3, 9);
		Rectangle r02 = new Rectangle(10, 10);

		rList.add(r01);
		rList.add(r02);

		Rectangle r100 = rList.get(0);
		r100.draw();
		System.out.println(rList.size());
		System.out.println("==============================");
		// 원 관리
		CircleList cList = new CircleList();

		Circle c01 = new Circle(5);
		Circle c02 = new Circle(10);

		cList.add(c01);
		cList.add(c02);

		Circle c100 = cList.get(0);
		c100.draw();
		System.out.println(cList.size());
		System.out.println("=================================");
		// 삼각형관리
		//배열을 관리할 리스트 클래스 인스턴스화하기
		TriangleList tList = new TriangleList();
		//리스트에 넣을 객체생성
		Triangle t01 = new Triangle(5,6);
		Triangle t02 = new Triangle(10,10);
		
		//리스트의 메소드를 이용해서 리스트안에 있는 멤버변수 배열에 객체넣기
		
		tList.add(t01);
		tList.add(t02);
		
		//잘 들어갔는지 리스트 메소드를 이용해서 꺼내와 다른 객체에 담기
		
		Triangle t001 = tList.get(0);
		//잘 들어가고 나왔는지 확인 
		System.out.println(t001); //이렇게 확인하면 t001 즉 triangle의 데이터타입 안에 메소드 toString이 사용됌
		t001.draw();// triangle 데이터 타입이기에 그안에 메소드를 실행
		
		//마지막으로 배열의 크기를 알아본다
		System.out.println(tList.size());
		
		
		
		
		
	}
}
