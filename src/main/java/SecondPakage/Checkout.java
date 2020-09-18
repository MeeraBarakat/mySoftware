package SecondPakage;

public class Checkout {
	private int result=0;
	
	public void add(Integer NumbOfGro,int Price)
	{
		result += (NumbOfGro.intValue()*Price);
	}
	public int result()
	{
		return result;
	}
}
