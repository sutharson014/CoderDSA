import java.util.Scanner;
public class Prob7 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("FirstName");
		String firstname=sc.next();
		System.out.println("LastName");
		String lastname=sc.next();
		System.out.println("Number of Time");
		int a=sc.nextInt();
				String fullname=firstname+lastname;
				for(int i=0;i<a;i++) {
					System.out.println(fullname);	
				}
	}

}
