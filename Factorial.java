import java.util.*;
public class Factorial {
	public void Factorial() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number to find factorial :");
		int num=sc.nextInt();
		int fact=1;
		
		while(num>0) {
			fact=fact*num;
			num--;
		}
		
		System.out.println("Factorial is :"+fact);
	}

	public static void main(String[] args) {
		Factorial f=new Factorial();
		f.Factorial();

	}

}
