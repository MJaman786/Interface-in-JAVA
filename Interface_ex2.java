interface inter1{
	int rice = 5;
	int sugar = 3;
	void purchase();
	void price();
}

public class Interface_ex2 implements inter1 {
	public void purchase() {
		System.out.println("= Raj purchase "+rice+"kg rice in 40rs.");
		System.out.println("= Also he buy "+sugar+"kgs of sugar in 20rs.");
	}	
	
	public void price() {
		int x = 40+20;
		System.out.println("= Total ammount of payment is: "+x);
	}
	
	
	public static void main(String[] args) {
		
		inter1 i = new Interface_ex2();
		
		i.purchase();
		i.price();

	}

}
/* ===============output===================
(((((((((For every one kg = 10rs.)))))))))
= Enter Ammount of rice to buy: 20
= Enter Ammount of sugar to buy: 40
= Total ammount of payment is: 600
*/

