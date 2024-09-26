import java.util.*;
public class AreaOfRectangle {
	public void Rectangle() {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the length of a rectangle :");
	int length=sc.nextInt();
	
	System.out.println("Enter the Width of a rectangle :");
	int width=sc.nextInt();
	
	int Rectangle_Area=length*width;
	System.out.println("Area of Rectangle is :"+Rectangle_Area);
	}
	
	public static void main(String[] args) {
		AreaOfRectangle a=new AreaOfRectangle();
		a.Rectangle();
		

	}

}
