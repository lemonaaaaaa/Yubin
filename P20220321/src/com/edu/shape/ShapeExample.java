package com.edu.shape;

public class ShapeExample {
	public static void main(String[] args) {
		Shape s1 = new Ractangle();
		Shape s2 = new Circle();
		Shape s3 = new Triangle();

		if (s1 instanceof Ractangle) {
			Ractangle r1 = (Ractangle) s1;
			r1.setWidth(12.3);
			r1.setHeight(7.8);
			System.out.println(r1.getArea());
		}
		if (s2 instanceof Circle) {
			Circle r2 = (Circle) s2;
			r2.setRadius(5);
			System.out.println(r2.getArea());
		}
		if (s3 instanceof Triangle) {
			Triangle r3 = (Triangle) s3;
			r3.setBase(4);
			r3.setHeight(10);
			System.out.println(r3.getArea());
		}
	}

}
