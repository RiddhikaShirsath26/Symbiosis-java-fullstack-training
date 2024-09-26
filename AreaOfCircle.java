import java.util.*;
public class AreaOfCircle {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of Radius of circle :");
		int radius=sc.nextInt();
		double pi=3.14,area,Circumference;
		
		area=pi*radius*radius;
		System.out.println("Area of Circle is: "+area);

		
		Circumference=2*pi*radius;
		System.out.println("Circumference of Circle is: "+Circumference);
	}

}
