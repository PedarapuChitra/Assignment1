import java.util.Scanner;  
public class sumofintegers 
{  
public static void main(String[] args)   
{     
int n, i=1, sum = 0;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter n value= ");  
n= sc.nextInt();  
while(i <= n)  
{  
sum = sum + i;  
i++;  
}  
System.out.println("Sum is= " + sum);  
}  
}  
