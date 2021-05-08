package com;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectEquals {

	public ObjectEquals() {
		// TODO Auto-generated constructor stub
	}
	

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1=new Employee(1,"a",30);
Employee e2=e1;
System.out.println(e1.equals(e2)+" "+e1.hashCode()+" "+e2.hashCode());
int a[]= {1,2,4,2,3,5,76,34,34,1};
ArrayList<Integer> al= new ArrayList<>();
HashMap<Integer,Integer> hm=new HashMap<>();
for(int j=0;j<a.length;j++){
for(int i=j+1;i<a.length;i++){
	if(a[i]==a[j]&& !al.contains(a[i])){
		al.add(a[i]);
	}	
}
	}
System.out.println(al);
 
	
	int b[]= {3,4,1,2,3,5,3,7};
	HashMap<Integer,Integer> count= new HashMap<>();
	int counter=0;
	for(int i=0;i<b.length-1;i=i+2){
		int sum= b[i]+b[i+1];
		
		if(count.containsKey(sum))
		{
		counter=count.get(sum)+1;
		count.put(sum, counter);
		}
		else
			count.put(sum, 1);
	}
	System.out.println(count);
	for(Map.Entry<Integer,Integer> entry: count.entrySet()){
		if(entry.getValue()>1)
			System.out.println(entry.getKey());
	}
	}
}
