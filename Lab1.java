
import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int isThirsty = 0;
		
		System.out.print("Hungry\n");
		System.out.print("Get in line\n");
		System.out.print("Buy lunch\n");
		
		System.out.print("Are you thirsty? Enter 1 for Yes, 0 for No: ");
		isThirsty = input.nextInt();
		
		if (isThirsty == 1)
			System.out.print("Buy Coke\n");
		
		System.out.print("Eat lunch\n");
		System.out.print("Return tray\n");
		System.out.print("Leave\n");
		
	}

}
