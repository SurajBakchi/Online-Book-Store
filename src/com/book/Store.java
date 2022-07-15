package com.book;
import java.io.*;



 class store {	
	public static void main(String[] args) throws NumberFormatException, IOException {
		book b1=new book();
	
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("===================================================================");
		System.out.println(" *********************Welcome To Online Book Store*****************");
		System.out.println("===================================================================");
		
		System.out.println(" \t\t \t 1) Buyer \r\t "+" \t\t 2) Seller \r\t ");
		System.out.println("\t\t\t Enter Your Choice ");
		int a=Integer.parseInt(br.readLine());
		switch(a)
		{
		
		case 1: {
			   b1. Buyer();
                }break;
                
		case 2: {
			   b1. Seller();
                }break;
		default :{
			System.out.println(" Please select a valid  number ");
		         }break;	
	}
		
		

		
	}
}

