package Testcases;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter any String ");
		String s = scn.next();
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}

	}

}
