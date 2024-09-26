import java.util.*;
public class GradesOfStudents {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter how many subject :");
		int num=sc.nextInt();
		
		int total=0;
		
		for(int i=0;i<num;i++) {
			System.out.println("Enter the marks :");
			int marks=sc.nextInt();
			
			total=total+marks;
		}
		System.out.println("Total Marks is :"+total);
		
		float per;
		String grade;
		
		per=(float)total/num;
		if(per>70)
			System.out.println("Grade A");
		
		else if(per>60)
			System.out.println("Grade B");
		
		else if(per>50)
			System.out.println("Grade C");
		
		else if(per>40)
			System.out.println("Fail");
		}

}
