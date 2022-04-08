import java.util.Scanner;

public class Marks {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the marks of A,B,C");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	
	int totalScore=a+b+c;
	double average=(a+b+c)/2;
	System.out.println("the total Score is    " +totalScore);
	System.out.println("----------------------------------");
	System.out.println("the average Score is   " +average);

}
}
