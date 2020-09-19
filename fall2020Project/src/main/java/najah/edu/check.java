package najah.edu;

public class check {
	private int total=0;
	public void count(Integer itemcount, int price) {
		// TODO Auto-generated method stub
		total+=itemcount.intValue()*price;
	}
	public int totalprice() {
		// TODO Auto-generated method stub
		return total;
	}

}
