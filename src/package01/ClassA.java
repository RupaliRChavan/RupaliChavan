package package01;

public class ClassA 
{
      public static int a=10;               //static variable
      private static int b=20;
      protected static int c=30;
            static int d=40;
      public int m=100;                     //non static variable
      private int n=200;
      protected int o=300;
                int p=400;
      
       public static void abc()
       {
    	   System.out.println("public-static method of classA");
       }
       private static void xyz()
       {
    	   System.out.println("private-static method of classA");
       }
       protected static void mno()
      {
   	   System.out.println("protected-static method of classA");
      }
       static void pqr()
       {
    	   System.out.println("default-static method of classA");
       }
      public static void main(String[] args)
      {
    	  System.out.println(a);
    	  System.out.println(b);
    	  System.out.println(c);
    	  System.out.println(d);
    	  abc();
    	  xyz();
    	  mno();
    	  pqr();
    	  ClassA a=new ClassA();
    	  System.out.println(a.m);
    	  System.out.println(a.n);
    	  System.out.println(a.o);
    	  System.out.println(a.p);
      }
}
