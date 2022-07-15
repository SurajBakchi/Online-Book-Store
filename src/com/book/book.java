package com.book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class book  { String BName,BAName,BPrice,Name,Phone,Pincode,Address;


public  void Buyer() throws NumberFormatException, IOException
{
System.out.println("****************************************************************************");	
System.out.println(" \t 1)");
System.out.println(" ----------");
System.out.println(" -        -");
System.out.println(" -        -");
System.out.println(" -        -");
System.out.println(" -        -");
System.out.println(" ----------");
System.out.println("\t English \r\t"+"\t RS.100 \r\t");
System.out.println("****************************************************************************");	

System.out.println(" \t 2)");
System.out.println(" ----------");
System.out.println(" -        -");
System.out.println(" -        -");
System.out.println(" -        -");
System.out.println(" -        -");
System.out.println(" ----------");
System.out.println("\t Hindi \r\t"+"\t RS.200 \r\t");
 System.out.println("****************************************************************************");	

System.out.println(" \t 3)");
System.out.println(" ----------");
System.out.println(" -        -");
System.out.println(" -        -");
System.out.println(" -        -");
System.out.println(" -        -");
System.out.println(" ----------");
System.out.println("\t Marathi \r\t"+"\t RS.300 \r\t");
System.out.println("****************************************************************************");	
	
System.out.println(" \t 4)");
System.out.println(" ----------");
System.out.println(" -        -");
System.out.println(" -        -");
System.out.println(" -        -");
System.out.println(" -        -");
System.out.println(" ----------");
System.out.println("\t Science \r\t"+"\t RS.400 \r\t");
System.out.println("****************************************************************************");	

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("\t\t\t Enter Your Choice ");
int b=Integer.parseInt(br.readLine());
	
	switch(b)
	{
	
	case 1: {
		    English();
           }break;
           
	case 2: {
		    Hindi();
           }break;
           
	case 3: {
		    Marathi();
           }break;
           
   case 4: {
           Science();
           }break;
         
           
	 default: {
		System.out.println(" Please select a valid  number ");
	         }break;
	}
	}

void English() throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\t\t\t Book Description");
		System.out.println(" \t\t Book Name = English \r\t"+" \t Book Author = A.B.shinde \r\t"+
	    "\t Book price = RS.100 \r\t");
		System.out.println("*******************************************************************");
		 System.out.println("\t\t 1) Buy \r\t"+"\t 2) Back \r\t");
		 System.out.println("\t\t\t Enter Your Choice ");
		
			int c=Integer.parseInt(br.readLine());
			switch(c)
			{
			
			case 1: {
                    Buy();					
	                }break;
	                
			case 2: {
				    Buyer();
	                }break;
			default :{
				System.out.println(" Please select a valid  number ");
			         }break;	
	}
	}
void Hindi() throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\t\t\t Book Description");
		System.out.println(" \t\t Book Name = Hindi \r\t"+" \t Book Author = M.D.Pate \r\t"+
	    "\t Book price = RS.200 \r\t");
		System.out.println("*******************************************************************");
		System.out.println("\t\t 1) Buy \r\t"+"\t 2) Back \r\t");
		System.out.println("\t\t\t Enter Your Choice ");
		int b=Integer.parseInt(br.readLine());
		switch(b)
		{
		
		case 1: {
			    Buy();
               }break;
               
		case 2: {
			     Buyer();
               }break;
		default :{
			System.out.println(" Please select a valid  number ");
		         }break;	
	}
	}
	
	     void Marathi() throws NumberFormatException, IOException
	{  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\t\t\t Book Description");
		System.out.println(" \t\t Book Name = Marathi \r\t"+" \t Book Author = U.R.kale \r\t"+
	    "\t Book price = RS.300 \r\t");
		System.out.println("*******************************************************************");
		System.out.println("\t\t 1) Buy \r\t"+"\t 2) Back \r\t");
		System.out.println("\t\t\t Enter Your Choice ");
		int b=Integer.parseInt(br.readLine());
		switch(b)
		{
		
		case 1: {
			    Buy();
               }break;
               
		case 2: {
			    Buyer();
               }break;
		default :{
			System.out.println(" Please select a valid  number ");
		         }break;	
	}
	}
	
	 void Science() throws NumberFormatException, IOException
	{   
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\t\t\t Book Description");
		System.out.println(" \t\t Book Name = Science \r\t"+" \t Book Author = S.S.WAGH \r\t"+
	    "\t Book price = RS.400 \r\t");
		System.out.println("*******************************************************************");
		System.out.println("\t\t 1) Buy \r\t"+"\t 2) Back \r\t");
		System.out.println("\t\t\t Enter Your Choice ");
	
		int b=Integer.parseInt(br.readLine());
		switch(b)
		{
		
		case 1: {
			    Buy();
               }break;
               
		case 2: {
			    Buyer();
               }break;
		default :{
			System.out.println(" Please select a valid  number ");
		         }break;	
	}
	
		
	
	}
	
	  void Buy() throws NumberFormatException, IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
	System.out.println(" Enter your Name");	
	
	 Name =br.readLine();
	
	System.out.println(" Enter your Phone No");	
    Phone =br.readLine();

	System.out.println(" Enter your Pincode");	
	  Pincode=br.readLine();
	
	System.out.println(" Enter your Address");	
   Address =br.readLine();
	System.out.println("*******************************************************************");
   System.out.println("\t\t 1) Conform \r\t"+"\t 2) Review \r\t");
	System.out.println("\t\t\t Enter Your Choice ");

	int e=Integer.parseInt(br.readLine());
	switch(e)
	{
	
	case 1: {
		    System.out.println(" Thank You");
           }break;
           
	case 2: {
		    Buyreview();
           }break;
	default :{
		System.out.println(" Please select a valid  number ");
	         }break;	
   
	}
	}
	
	 public void Seller() throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Enter Book Name");	
		
		 BName =br.readLine();
		
		System.out.println(" Enter Book Author Name");	
         BAName=br.readLine();

		System.out.println(" Enter Book Price");	
         BPrice=br.readLine();

		System.out.println("*******************************************************************");
       System.out.println("\t\t 1) Submit \r\t"+"\t 2) Review \r\t");
		System.out.println("\t\t\t Enter Your Choice ");
	
		int g=Integer.parseInt(br.readLine());
		switch(g)
		{
		
		case 1: {
			    System.out.println(" Submited Successful !!!");
               }break;
               
		case 2: {
			    Breview();
               }break;
		default :{
			System.out.println(" Please select a valid  number ");
		         }break;	
       
		}	
	}
	
	 void Breview() throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    System.out.println(" Information Review ");
		System.out.println("  Book Name ="+BName);
		
		System.out.println("  Author Name ="+BAName);
		
		System.out.println("  Book Price ="+BPrice);
		System.out.println("*******************************************************************");
		System.out.println("\t 1) Submit \r\t"+"\t 2) Review \r\t");
		System.out.println("\t\t\t Enter Your Choice ");
		
		int h=Integer.parseInt(br.readLine());
		switch(h)
		{
		
		case 1: {
			    System.out.println(" Submited Successful !!!");
               }break;
               
		case 2: {
			    Breview();
               }break;
		default :{
			System.out.println(" Please select a valid  number ");
		         }break;	
       
		}	
	}
	 void Buyreview() throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    System.out.println(" Order Information");
		System.out.println("  Name ="+Name);	
		System.out.println("  Phone No ="+Phone);	
		System.out.println("  Pincode ="+Pincode);	
		System.out.println("  Address ="+Address);	
		System.out.println("*******************************************************************");
       System.out.println("\t\t 1) Conform \r\t"+"\t 2) Review \r\t");
		System.out.println("\t\t\t Enter Your Choice ");
	
		int j=Integer.parseInt(br.readLine());
		switch(j)
		{
		
		case 1: {
			    System.out.println(" Order Conformed !!!");
               }break;
               
		case 2: {
			    Buyreview();
               }break;
		default :{
			System.out.println(" Please select a valid  number ");
		         }break;	
       
		}	
	}
}	

