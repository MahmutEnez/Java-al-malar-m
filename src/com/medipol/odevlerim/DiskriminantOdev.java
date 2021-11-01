package com.medipol.odevlerim;

import java.util.Scanner;

public class DiskriminantOdev {

	public static void main(String[] args) {
	
		 Scanner scan = new Scanner(System.in); 
	        System.out.println("(ax²+bx+c) ikinci dereceden bir denklemdir.Denklemdeki sabitleri aþaðýya giriniz. "); 
	        
	        System.out.print("a deðerini giriniz : "); 
	        double a = scan.nextInt(); 
	        System.out.print("b deðerini giriniz : "); 
	        double b = scan.nextInt(); 
	        System.out.print("c deðerini giriniz : "); 
	        double c = scan.nextInt(); 
	        
	        double delta = (b * b) - (4 * a * c); 
	        
	        if (delta > 0){ 
	            double x1 = ((-1 * b) - Math.sqrt(delta)) / (2 * a); 
	            double x2 = ((-1 * b) + Math.sqrt(delta)) / (2 * a); 
	            System.out.println("x1= " + x1 + " x2= " + x2); 
	        } 
	        else if (delta < 0){
	            System.out.println("Denklemin Gerçel Kök'ü Yoktur."); 
	        } 
	        else if (delta == 0){ 
	            double x = (-1 * b) / (2 * a);
	            System.out.println("Çakýþýk Kök'ü var x1= x2= " + x); 
	}
	}
	}

