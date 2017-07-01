package com.jav;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Demo {
	public int solution(int n){
		List<Integer> list = new ArrayList<Integer>();
		while (n > 0) {
		    list.add(n%10);
		    n = n / 10;
		}
		//System.out.println(list);
		Collections.sort(list);
		//System.out.println(list);
		double sum=0;
		for(int i=list.size();i>0;i--){
			sum=sum+list.get(i-1)*Math.pow(10, i-1);
			//System.out.println(sum);
		}
		
		return (int) sum;
		
	}
	
	public static void main(String args[]){
		Demo d= new Demo();
		System.out.println("Enter a number");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(d.solution(n));
	}

}