package classes;

import java.util.Scanner;

public class Funcoes_Sintaxe {

	public static void main(String[] args) {
		/* Fazer um programa para ler três números
		inteiros e mostrar na tela o maior dele */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		
		sc.close();

	}
	
	
	public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
        	aux = x;
        }
        else if (y > z) {
        	aux = y;
        }
        else {
        	aux = z;
        }
        return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}