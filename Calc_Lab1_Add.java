import java.util.Scanner;
public class Calc_Lab1_Add {

	public static void main(String args[])
	{
		float a,b,res;
		char choice,ch;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("1: ADD TWO Numbers\n");
			System.out.print("2:Exit\n");
			System.out.print("Enter your choice");
			choice = sc.next().charAt(0);
			switch(choice)
			{
			case '1' : System.out.print("Enter TWO Numbers");
						a = sc.nextFloat();
						b = sc.nextFloat();
						res = a+b;
						System.out.print("Result = " + res);
						break;
						
			case '2': System.exit(0);
						break;
						
			default: System.out.print("Invalid Choice");
						break;
			}
			System.out.print("\n...........................................\n");
			
		}while(choice!=2);
	}
	
}

