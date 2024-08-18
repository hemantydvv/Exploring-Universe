import java.util.Scanner;

public class Triangle {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
        //Taking input from the user...
		System.out.println("Enter 1st side of triangle: ");
		int s1 = sc.nextInt();
		System.out.println("Enter 2nd side of triangle: ");
		int s2 = sc.nextInt();
		System.out.println("Enter 3rd side of triangle: ");
		int s3 = sc.nextInt();
        //checking for the types of the triangle....
		if (s1 == s2 ) {
			if (s2 == s3) {
				System.out.println("Equilateral");
			}
			else {
				System.out.println("Isosceles");
			}
		}
		else if (s2==s3 || s1==s3) {
			System.out.println("Isosceles");
		}
        // Exception for invalid input ..... using basic knowledge of triangles...
		else if (s1+s2<=s3 || s2+s3<=s1 || s1+s3<=s2) {
			System.out.println("Invalid triangle");
		}
		else {
			System.out.println("Scalene");
		}
		}
}
