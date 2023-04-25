package exercises;

import java.util.Locale;
import java.util.Scanner;

public class URI_1143_for_le_numero_positivo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= 5; i++) {
			int quad = i * i;
			int cubo = i * i * i;
			System.out.println(i + " " + quad + " " + cubo);
		}
		
		sc.close();

	}

}