package package02;

import package01.ClassA;

public class ClassC extends ClassA    //inheritance
{
	 public static void main(String[] args)
	    {
	    	System.out.println(ClassA.a);     //public
	    	//System.out.println(ClassA.b);   //private.....access only within class
	    	System.out.println(ClassA.c);     //protected
	    	//System.out.println(ClassA.d);    //default.....access only within package
	    	ClassA.abc();
	    	//ClassA.xyz();                   //private
	    	ClassA.mno();
	    	//ClassA.pqr();
	    	ClassC t=new ClassC();
	    	System.out.println(t.m);
	    	//System.out.println(t.n);        //private.....
	    	System.out.println(t.o);
	    	//System.out.println(t.p);        //default.....
	    }
}
