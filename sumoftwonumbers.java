import java.util.Scanner;  
public class sumoftwonumbers 
{  
public static void main(String args[])  
{  
int a, b, sum;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the first number: ");  
a = sc.nextInt();  
System.out.print("Enter the second number: ");  
b = sc.nextInt();  
sum = sum(a,b);  
System.out.println("The sum of two numbers x and y is: " + sum);  
}  
public static int sum(int x, int y)  
{  
int sum = x + y;  
return sum;  
}  
}  
