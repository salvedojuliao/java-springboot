package exercises;

import java.util.Locale;
import java.util.Scanner;

public class verifica_se_e_par {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		if (number % 2 == 0 || number == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}
}
