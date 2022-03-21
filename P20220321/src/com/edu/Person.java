package com.edu;

public class Person extends Object { //extends Object 클래스 생략된상태
//field
   private String name;
   private int age;
   private double height;
   private double weight;

//constructor
//overloading.(중복선언)
   public Person() { //private로 선언하면 펄슨 클래스 이외에서는 조회 불가

   }

   public Person(String name) {
      this.name = name;

   }

   public Person(String name, int age, double height, double seight) {
      super();
      this.name = name;
      this.age = age;
      this.height = height;
      this.weight = seight;
   }

   // method.
   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public double getHeight() {
      return height;
   }

   public void setHeight(double height) {
      this.height = height;
   }

   public double getWeight() {
      return weight;
   }

   public void setWeight(double weight) {
      this.weight = weight;
   }
}