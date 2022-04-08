import java.util.Scanner;

public class Subject {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter subject One Marks");
		int subjectOne=sc.nextInt();
		System.out.println("Eneter subject Two Marks");
		int subjectTwo=sc.nextInt();
		System.out.println("Eneter subject Three Marks");
		int subjectThree=sc.nextInt();
		double result=(subjectOne+subjectTwo+subjectThree)/3;
		System.out.println(result);
		if(subjectOne>60 && subjectTwo>60 &&subjectThree>60)
		{
			System.out.println("Congratulation your are passed");
		}
		else if(subjectOne>60 && subjectTwo>60 ||subjectThree>60 || subjectOne>60 || subjectTwo>60 &&subjectThree>60)
		{
			System.out.println("Congratulation your are promted");
		}
		else if(subjectOne<60 || subjectTwo<60 || subjectThree<60)
		{
			System.out.println("  oops your are failed");
		}
		
		
		
	}

}
