import java.util.Scanner;

interface inter{
	//Both methods are by default public and abstract
	void input();
	void output(); 
}

public class Interface_ex1 {
	String name;
	int age;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		name = sc.next();
		System.out.println("Enter age: ");
		age = sc.nextInt();
	}
	void output() {
		System.out.print("Name: "+name+"\n Age: "+age);
	}

	public static void main(String[] args) {
		
		Interface_ex1 a = new Interface_ex1();
		
		a.input(); a.output();

	}

}
