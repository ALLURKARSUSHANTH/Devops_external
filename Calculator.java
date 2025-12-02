import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your first number: ");
		double a = sc.nextDouble();
		System.out.println("Pick an operation: +,-,*,/");
		String op = sc.next();
		System.out.println("Enter your second number: ");
		double b = sc.nextDouble();
		switch(op){
		case 1: "+";
		 return a+b;
		case 2: "-";
		 return a-b;
		case 3 :  "*";
		 return a*b;
		case 4 :"/";
		 if(a==0||b==0) {return "Cannot divide by zero";}
			  else{ return a/b;}
		case "default" : return "Invalid Input";
}
}
}
