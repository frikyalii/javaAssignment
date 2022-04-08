import java.util.Scanner;

public class Login {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	
		int count=0;
		while(count<=3) {
			System.out.println("please Enter your name");
			String name=sc.next();
			System.out.println("please Enter your password");
			String password=sc.next();
			if(password.equals("asad")&&name.equals("asad"))
			{
				System.out.println("Welcome" +name);
				break;
			}
			else
			{
				count++;
				System.out.println("Contact Admin");
				break;
			}
		}
	
	}

}
