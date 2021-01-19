package helloworld;

public class Calculator {
	static void add() 
	{
		int a=1;
		int b=2;
		int c=a+b;
		System.out.println(c);
	}
	static void mul() 
	{
		int a=1;
		int b=2;
		int c=a*b;
		System.out.println(c);
	}
	static void sub() 
	{
		int a=1;
		int b=2;
		int c=b-a;
		System.out.println(c);
	}
	static void div() 
	{
		int a=1;
		int b=2;
		int c=b/a;
		System.out.println(c);
	}

	public static void main(String[] args)
	{
		int option=5;
		switch(option)
		{
		case 1:add();
		break;
		case 2:mul();
		break;
		case 3:sub();
		break;
		case 4:div();
		break;
		default:System.out.println("invalid input");
		break;
		}

	}

}
