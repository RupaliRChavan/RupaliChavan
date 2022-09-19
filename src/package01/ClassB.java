package package01;

public class ClassB 
{
    public static void main(String[] args)
    {
    	System.out.println(ClassA.a);     //public
    	//System.out.println(ClassA.b);   //private.....access only within class
    	System.out.println(ClassA.c);     //protected
    	System.out.println(ClassA.d);    //default
    	ClassA.abc();
    	//ClassA.xyz();                   //private.....
    	ClassA.mno();
    	ClassA.pqr();
    	ClassA s=new ClassA();
    	System.out.println(s.m);
    	//System.out.println(s.n);        //private.....
    	System.out.println(s.o);
    	System.out.println(s.p);
    	
    }
}
