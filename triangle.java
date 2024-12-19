import java.util.Scanner;
public class prob2 {
public static void main(String [] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a Values");
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
	if(a+b+c==180) {
		System.out.println("Triangle can be formed");
		
	}
	else {
	System.out.println("Triangle cannot be formed");
	}
}
