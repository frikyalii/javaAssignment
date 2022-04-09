
class Employee
{
	public int incentive(int incentive)
	{
		return incentive;
		
	}
	public int overtime(int overtime)
	{
		return overtime;
		
	}
}

class Manager extends Employee
{
	

	
 public int incentive(int incen)
 {
	 
	
	return incen;
	
 }
 public int salary()
 {
	int sal=5000;
	return incentive(5000)+sal;
 }

}
class Labour extends Employee
{
	 public int salary()
	 {
		int sal=8000;
		return overtime(5000)+sal;
	 }
}




public class Organization{
	public static void main(String[] args)
	{
		Manager m=new Manager();
		Labour l=new Labour();
		System.out.println(m.salary());
		System.out.println(l.salary());

		
		
	}

}
