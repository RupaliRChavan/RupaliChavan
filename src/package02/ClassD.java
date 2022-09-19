package package02;

import package01.ClassA;

public class ClassD 
{
		 public static void main(String[] args)
		    {
		    	System.out.println(ClassA.a);     //public
		    	//System.out.println(ClassA.b);   //private.....access only within class
		    	//System.out.println(ClassA.c);     //protected
		    	//System.out.println(ClassA.d);    //default.....access only within package
		    	ClassA.abc();
		    	//ClassA.xyz();                   //private
		    	//ClassA.mno();
		    	//ClassA.pqr();
		    	ClassA l=new ClassA();
		    	System.out.println(l.m);
		    	//System.out.println(l.n);
		    	//System.out.println(l.o);
		    	//System.out.println(l.p);
		    }
	}
