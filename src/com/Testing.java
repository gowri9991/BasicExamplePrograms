package com;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class Testing {
String name;
	public Testing(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
public Testing() {
		// TODO Auto-generated constructor stub
	}
static int a;
 int b;
 static int count=0;
void cal(int m, int n){
	a+=m;
	b+=n;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Testing t1= new Testing();
		Testing t2=new Testing();
		t1.a=0;
		t1.b=0;
		t1.cal(1, 2);
		//t2.a=0;
		//t1.b=0;
		t2.cal(2, 3);
		System.out.println(t1.a+" "+t1.b+t2.a+" "+t2.b);
		System.out.println("nifty" instanceof Object);
		System.out.println("banana".compareTo("apple"));
		String msg="Hello";
		msg+="world";
		System.out.println(msg);*/
		if(count<5){
			count++;
			
			main(null);
		}
		else
			return;
		try{
			System.out.println("a");
			badMethod();
			System.out.println("b");
		}
		catch(Exception e){
			System.out.println("c");
		}
		finally{
			System.out.println("d");
		}
		List<Boolean> boo=new ArrayList<>();
		boo.add(true); boo.add(Boolean.parseBoolean("FalSe")); boo.add(Boolean.TRUE);
		System.out.println(boo.size());
		System.out.println(boo.get(1) instanceof Boolean);
		//System.out.println(msg.substring(6,12));
		/*Testing s1=new Testing("John");
		Testing s2=new Testing("Raj");
		Testing s3= s2;
		 s2=new Testing("Anita");
		s2=s1;*/
		//ArrayList<Integer> a=new ArrayList<Integer>();
		
//System.out.println("hi"+ s1.name+ " "+s2.name+" "+s3.name);
/*String a= "John";
String b=a;
System.out.println(" "+a.equals(b));
System.out.println(" "+ a==b);
System.out.println(Runtime.getRuntime().availableProcessors());  
Runtime r=Runtime.getRuntime();  
System.out.println("Total Memory: "+r.totalMemory());  
System.out.println("Free Memory: "+r.freeMemory()); */
		System.out.println(String.format("id=%08.2f", 423.147));
		/*String x="a";
		Runnable r= ()->System.out.println(x);
		x="b";
		r.run();*/
		String S= "gowri@gmail.com";
		//String regex="^([a-zA-Z0-9_\.\-]+)@([a-zA-Z0-9_\.\-]+)\.([a-zA-Z]{1,2}$";
	    String regex= "^(.+)@(.+)$";
	       // Pattern p=Pattern.compile(regex);
	        //Matcher m= p.m(S);
	       // System.out.println( S.matches(regex));
	       // return m.matches();
	}
	public static void badMethod() throws Exception{
		throw new Exception();
	}
}
