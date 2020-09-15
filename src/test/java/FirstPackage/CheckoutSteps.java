package FirstPackage;

import static org.junit.Assert.assertEquals;

import SecondPakage.Checkout;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps {
	private int FirstPrise=0;
	private int SecondPrise=0;
	private Checkout check=new Checkout();
	private String first;
	private int i=0;
@Given ("the price of a {string} is {int}")
public void thePriceOf(String Grocery,Integer GroceryPrice)
{      if(i==0)
	{  
	    first=Grocery;
	    i++;
	}
if (Grocery.equals(first))
	FirstPrise=GroceryPrice;
else SecondPrise=GroceryPrice;
}

@When("I checkout {int} {string}")
public void Icheckout(Integer NumOfGrocery,String Grocery)
{
	if (Grocery.equals(first))
	check.add(NumOfGrocery,FirstPrise);
	else check.add(NumOfGrocery,SecondPrise);
}

@Then("the total price should be {int}")
public void totalPrice(Integer TheTotal)
{
	assertEquals(TheTotal.intValue(),check.result());
}

}