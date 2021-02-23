package epam.hometask1;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		int a,b;
		a=Sc.nextInt();
		b=Sc.nextInt();
		add(a,b);sub(a,b);mul(a,b);div(a,b);

	}
	public static void add(int a,int b)
	{
		System.out.println("Addition "+(a+b));

	}
	public static void sub(int a,int b)
	{
		System.out.println("Subtraction "+(a-b));

	}
	public static void mul(int a,int b)
	{
		System.out.println("Multiplication "+a*b);

	}
	public static void div(int a,int b)
	{
		if(b!=0)
		System.out.println("Division "+a/b);
		else
			System.out.println("Invalid Input");

	}
}
