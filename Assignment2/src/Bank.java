class BankAccount{
	public int fixDiposit(int rupees)
	{
		return rupees;
	}
	public int  cashCredit(int rupees)
	{
		return rupees;
	}
}
class  totalBankBalance extends BankAccount
{
	
	public int total()
	{
		return fixDiposit(500)+cashCredit(500);
	}

	
}



public class Bank {
	public static void main(String[] args)
	{
		totalBankBalance b=new totalBankBalance();
		System.out.println(b.total());
		
	}

}
