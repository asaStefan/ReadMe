package com.bupt.link.array;

import java.util.Currency;

public class ClimbingStairs {
	public static void main(String[] args) {
		System.out.println(climbStairs(4));
		System.out.println(climbStairs2(4));
	}
	//f(n)=f(n-1)+f(n-2);f(1)=1;f(2)=2;
	//动态规划
	//method1 : 递归
	  public static int climbStairs(int n) {
		  if(n==1 || n==2){
			  return n==1?1:2;
		  }
		 /* if(n==2){
			  return 2;
		  }*/
		  return climbStairs(n-1)+climbStairs(n-2);
	  }
	 //迭代
	  public static int climbStairs2(int n) {
		  if(n==1 || n==2){
			  return n==1?1:2;
		  }
		  int pre=1,sum=0,cur=2;
		  for(int i =2;i<n;i++){
			  sum = pre + cur;
			  pre = cur;
			  cur = sum;
		  }
		  return cur;
	  }
}
