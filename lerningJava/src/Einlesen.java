import java.util.Scanner;


public class Einlesen {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Bitte geben sie etwas ein:");
		String something = in.nextLine();
		System.out.println(something);
		in.close();
	}

}
