import java.util.Scanner;

interface inter2{
	int r1 = 10;
	int s1 = 10;
	
	void purchase();
	void price();
}

public class Interface_ex3 implements inter2 {
	int rice;
	int sugar;
	
	Scanner sc = new Scanner(System.in);
	
	public void purchase() {
		System.out.println("(((((((((For every one kg = 10rs.)))))))))");
		System.out.print("= Enter Ammount of rice to buy: ");
		rice = sc.nextInt();
		System.out.print("= Enter Ammount of sugar to buy: ");
		sugar = sc.nextInt();
	}	
	
	public void price() {
		int x = r1*rice + s1*sugar;
		
		System.out.println("= Total ammount of payment is: "+x);
	}
	
	
	public static void main(String[] args) {
		
		inter2 i = new Interface_ex3();
		
		i.purchase();
		i.price();

	}

}
