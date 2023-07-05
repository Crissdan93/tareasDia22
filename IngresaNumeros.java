package ejercicios;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IngresaNumeros {
	
	public static void main(String[]args ) {
		
		Scanner scanner = new Scanner(System.in);
		int[ ] numeros = new int[5];
		
		
		System.out.print("ingrese 5 numeros");
		
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = scanner.nextInt();
			
		}
		
		System.out.println("Numeros ordenados ");
		Arrays.sort(numeros);
		
		
		for(int i = 0;i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		scanner.close();
		
		
	}

}
