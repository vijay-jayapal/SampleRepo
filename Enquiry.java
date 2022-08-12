//Run Time Polymorphism
class Bank
{
	void interestRate()
	{
		System.out.println("The Interest rate depends on the bank policy");
		
	}
}
class Sbi extends Bank
{
	@Override
	void interestRate()
	{
		System.out.println("SBI Interest rate is: 5.6");
	}
}
class Icici extends Bank
{
	@Override
	void interestRate()
	{
		System.out.println("Icici Interest rate is: 6.2");
	}
}
class Hdfc extends Bank
{
	@Override
	void interestRate()
	{
		System.out.println("Hdfc interest rate is: 6.8");
	}
}
class Enquiry
{
	public static void main(String[] args)
	{
		Bank b;
		b=new Sbi();
		b.interestRate();
		b=new Hdfc();
		b.interestRate();
		
		Bank c=new Icici();
		c.interestRate();
	}
}