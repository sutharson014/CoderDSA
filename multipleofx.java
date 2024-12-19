import java.util.Scanner;
public class Prob6 {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Value");
		int x = sc.nextInt();
		for(int i=1;i*x<=1000;i++) {
			
			System.out.println(i*x);
		}
	}

}
