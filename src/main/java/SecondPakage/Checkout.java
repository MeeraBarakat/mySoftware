package SecondPakage;

public class Checkout {
	private int result=0;
	
	public void add(Integer NumOfGro,int Price)
	{
		result += (NumOfGro.intValue()*Price);
	}
	public int result()
	{
		return result;
	}
}
