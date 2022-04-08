import java.util.Scanner;

public class incomeTax {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the slab");
		double i=sc.nextInt();
		double d=income(i);
		System.out.println("when income is" +i+ " then tax is " +d);
		
	}
		public static double income(double i)
		{
			double tax=0;
			if((i>0)&&(i<=180000))
				tax=0;
			else if((i>180001)&&(i<=300000))
				tax=i*0.10;
			else if((i>300001)&&(i<=500000))
				tax=i*0.20;
			else if((i>500001)&&(i<=1000000))
				tax=i*0.30;
			else
				System.out.println("overed income");
			return tax;
		}
	

}
