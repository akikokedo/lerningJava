import java.util.Random;
import java.util.Scanner;


public class Zahlenratespiel {
	
	public static void main(String[] args) {
		int zufallszahl = new Random().nextInt(10);
		boolean ende = false;
		Scanner scanner = new Scanner(System.in);
		while(!ende){
			
			System.out.println("Bitte geben sie eine Zahl ein:");
			int something = scanner.nextInt();
			
			if(something == zufallszahl){
				ende = true;
				System.out.println("richtig :3");
			}else{
				if(something < zufallszahl){
					System.out.println("zu klein :P");
				}else{
					System.out.println("zu gro§ :/");
				}
			}
		}
		scanner.close();

	}

}
