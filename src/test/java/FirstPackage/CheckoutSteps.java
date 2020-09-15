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
@Given ("the price of a {string} is {int}")
public void thePriceOf(String Grocery,Integer GroceryPrice)
{    
if (Grocery.equals("banana"))
	FirstPrise=GroceryPrice;
else SecondPrise=GroceryPrice;
}

@When("I checkout {int} {string}")
public void Icheckout(Integer NumOfGrocery,String Grocery)
{
	if (Grocery.equals("banana"))
	check.add(NumOfGrocery,FirstPrise);
	else check.add(NumOfGrocery,SecondPrise);
}

@Then("the total price should be {int}")
public void totalPrice(Integer TheTotal)
{
	assertEquals(TheTotal.intValue(),check.result());
}

}