package com.euler.project;

import java.awt.Font;


	
//	public class TestOverload {
//		  public static void print(Float a, double b) {
//		     System.out.println("1"); }
//		  public static void print(double a, double b) {
//		     System.out.println("2"); }
//		  public static void print(float a, int b) {
//		     System.out.println("3"); }
//		  public static void print(int a, float b) {
//		     System.out.println("4"); }
//		  public static void print(double a, int b) {
//		     System.out.println("5"); }

//		  public static void main(String args[]) {
//			  int x = -1; x = x << 16;
//			  System.out.println(x);
//			  x = -1; x = x >>> 32;
//			  System.out.println(x);
//			  byte c = -1; c =(byte) ( c >>> 5 );
//			  System.out.println(c);
//			  int d = -1; d = d >>> 5;
//			  System.out.println(d);
//			  int e = -1; e = e >> 5;
//			  System.out.println(e);
			  
			  
			  class TestOverload extends java.awt.Canvas {
				  String str = "Hello World";
				  public void paint(java.awt.Graphics g) {
				  java.awt.FontMetrics fm = g.getFontMetrics();
				  g.setColor(java.awt.Color.black);
				  java.awt.Dimension d = getSize();
				  //g.drawText( str, d.width, d.height, Font.CENTERED );

				  }
				 }
//		  }
//		}


