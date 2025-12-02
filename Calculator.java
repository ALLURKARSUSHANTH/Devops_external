import java.util.Scanner;
public class Calculator{
	public static void  main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your first number: ");
		double a = sc.nextDouble();
		System.out.println("Pick an operation: +,-,*,/");
		String op = sc.next();
		System.out.println("Enter your second number: ");
		double b = sc.nextDouble();
		double c = 0;
		switch(op){
		case  "+" : c= (double)a+b;
		System.out.println("The result is: "+c);
		break;
		case  "-" : c= (double)a-b;
		System.out.println("The result is: "+c);
		break;
		case  "*" : c= (double)a*b;
		System.out.println("The result is: "+c);
		break;
		case  "/" : if(b!=0){
					c= (double)a/b;
				  }
				  else{
					  System.out.println("Error: Division by zero");
				  }
		default : System.out.println("Invalid operation!");
}
		System.out.println("The result is: "+c);
		sc.close();
}
}
