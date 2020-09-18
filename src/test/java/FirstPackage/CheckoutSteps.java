package FirstPackage;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import SecondPakage.Checkout;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps {
	private Checkout check=new Checkout();
	ArrayList <myGro> myAL=new ArrayList();
@Given ("the price of a {string} is {int}")
public void thePriceOf(String Grocery,Integer GroceryPrice)
{
		myGro fresh=new myGro();
		fresh.setName(Grocery);
		fresh.setPrice(GroceryPrice);
		myAL.add(fresh);
}

@When("I checkout {int} {string}")
public void Icheckout(Integer NumbOfGrocery,String Grocery)
{
	int price = 0;
	for(int i=0;i<myAL.size();i++)
	{
		myGro m=myAL.get(i);
		if(m.getName().equals(Grocery))
		{
			price=m.getPrice();
		}
	}
	check.add(NumbOfGrocery,price);
}

@Then("the total price should be {int}")
public void totalPrice(Integer TheTotal)
{
	assertEquals(TheTotal.intValue(),check.result());
	myAL.isEmpty();
}


}



class myGro{
	private String GroName;
	private int GroPrice;
	
	public int getPrice() {
		return GroPrice;
	}
	
	public String getName() {
		return GroName;
	}
	
	public void setPrice(int P) {
		GroPrice=P;
	}
	
	public void setName(String N) {
		GroName=N;
	}
}

