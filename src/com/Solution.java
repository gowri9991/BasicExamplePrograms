package com;

public class Solution {
	public static String run(int N, int M) {
		/*
		* Write your code below; return type and arguments should be according to the problem's requirements
		*/
		
		String sequence = "";
		StringBuilder sb1 = new 
                StringBuilder("");
	for(int i=N;i<=M;i++){
		if(i%3==0 && i%5==0)
			sb1.append("FizzBuzz");
			else{
				if(i%3==0)
			sb1.append("Fizz");
			else if(i%5==0)
			sb1.append("Buzz");
			else
			sb1.append(i);
			 }
		if(i!=M)
		sb1.append(",");
	}
	
	sequence=sb1.toString();
		
		
		return sequence;
	}
	public static void main(String args[])
	{
		String op=run(5,15);
		System.out.println(op +"hi");
	}
}
