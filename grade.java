import java.util.Scanner;
class Prob3 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Mark");
		int mark=scan.nextInt();
		if(90<=mark) {
			System.out.println("Grade A");
		}
		else if(80<=mark) {
			System.out.println("Grade B");
		}
		else if(60<=mark) {
			System.out.println("Grade C");
		}
		else if(35<=mark) {
			System.out.println("Grade D");
		}
		else if(35>mark) {
			System.out.println("Fail");
		}
	}

}
