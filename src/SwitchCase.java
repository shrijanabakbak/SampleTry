import java.util.Scanner;
public class SwitchCase{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your preffered day:");
		int dayOfWeek= sc.nextInt();
		sc.close();
		String schedule;

		switch (dayOfWeek) {
			case 1:
				schedule="Monday: Gym in the morning";
				break;
			case 2:
				schedule="Tuesday: Class after work";
				break;
			case 3:
				schedule="Wednesday: Meetings all day";
				break;
			case 4:
				schedule="Thusday: Work from home";
				break;
			case 5:
				schedule="Friday: Game night after work";
				break;
			case 6:
				schedule="Saturday: Free!";
				break;
			case 7:
				schedule="Sunday: Free!";
				break;
			default:
				schedule="Invalid input";
		}
		
		System.out.println("Your schedule today is "+ schedule);
	}
}
