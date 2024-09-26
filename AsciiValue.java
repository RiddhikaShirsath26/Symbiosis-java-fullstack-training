import java.util.*;
public class AsciiValue {

	public void ASCII() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character to given ASCII Value :");
		char C=sc.next().charAt(0);
		int asciiValue=C;
		System.out.println("ASCII Value of"+C+"is :"+asciiValue);
		
	}
	public static void main(String[] args) {
		AsciiValue a=new AsciiValue();
		a.ASCII();
	}

}
