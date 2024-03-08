import java.util.Scanner;

public class TestSwitvh{

public static void main(String[] args)

{
 
 double res;
 
 Scanner scan = new Scanner(System.in);
 
 System.out.println("Enter The First Number");
 
 double num1 = scan.nextDouble();
 
 System.out.println("Enter The Second Number");
  
 double num2 = scan.nextDouble();
 
System.out.println("Enter The Operation On The Numbers"); 

String opr = scan.next();

switch(opr)

{

case "+":

res =  num1 + num2;

System.out.println("The result is : " + res);

break;
 
case "-":

res =  num1 + num2;

System.out.println("The result is : " + res);

break;

case "*":

res =  num1 + num2;

System.out.println("The result is : " + res);

break;

case "/":

res =  num1 + num2;

System.out.println("The result is : " + res);

break; 

default:

System.out.println(" The operator Entered Is Invalid!!! " );

break;

}

}

} 

