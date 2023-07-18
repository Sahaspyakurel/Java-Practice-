import java.util.Scanner;
	public class Scholarship{
		public 	static void main(String[] args) {
		Scanner as = new Scanner(System.in);
		System.out.println("Enter the percentage that you have scored");
		float per = as.nextFloat();
		int total_fee = 100000;
		if (per < 60) {
			int total_payable_amount = total_fee - 5000;
			System.out.println("You have scored :" + per + " % and the total payable amount is : 	"+ total_payable_amount);
		} else if (per < 75 && per > 60) {
			int total_payable_amount = total_fee - 10000;
			System.out.println("You have scored :" + per + " % and the total payable amount is : "+ total_payable_amount);
		} else if (per < 100 && per > 75) {
			int total_payable_amount = total_fee - 20000;
			System.out.println("You have scored :" + per + " % and the total payable amount is : 	"+ total_payable_amount);
		} else {
			System.out.println("Invalid entry, please provide vaild percentage .");
		}
		as.close();
		}
	}