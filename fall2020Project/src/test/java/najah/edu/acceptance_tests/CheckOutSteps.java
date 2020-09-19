package najah.edu.acceptance_tests;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import najah.edu.check;
import najah.edu.product;

public class CheckOutSteps {

		private ArrayList<product> a=new ArrayList<product>();
		private check c=new check();
		private product o;
	@Given("the price of a {string} is {int}")
	public void thepriceofbanana(String item,Integer p) {
		//if(item.equals("banana"))
		//bprice=p.intValue();
		//else
			//aprice=p.intValue();
		o=new product();
		o.setname(item);
		o.setprice(p);
		a.add(o);
		
		
	}

	@When("I checkout {int} {string}")
	public void icheckout(Integer itemcount,String s) {
		//if(s.equals("banana"))
//		c.count(itemcount,bprice);
//		else
		// c.count(itemcount,aprice);
			for(product d:a) {
				if(s.equals(d.getname())) {
					c.count(itemcount,d.getprice());
				}
			}
			
			
		
	}

	@Then("the total price should be {int}")
	public void thetotalprice(Integer t){
		a.clear();
		assertTrue(t.intValue()==c.totalprice());
		
	}



}
