package day10_constructors;
//example 2 
public class Constructor2 {

	int x,y;
	Constructor2()
	{   x=1;
	    y=1;
		System.out.println("no argument constructor");
	 System.out.println("no argument constructor call");
	}
	Constructor2(int a)
	{    x=a;
		System.out.println("with argument constructor");
	 
		System.out.println("argument constructor call");	
	}
	Constructor2(int a,int b)
	{
	  x=a;
	  y=b;
	System.out.println("with two  argument constructor");
		System.out.println("with two argument constructor call");
	}
	
	public static void main(String[] args) {
		 
		//line 23 we created class reference
		Constructor2 p;
		//calling constructor at line 25
		  new Constructor2();//line 5 wil be called 
		 
		  Constructor2 r= new Constructor2(10);
		Constructor2 r1= new Constructor2(20);
		


	}

}
