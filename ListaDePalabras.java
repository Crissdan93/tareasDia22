package ejercicios;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDePalabras {
    public static void main(String[] args) {
        List<String> listaPalabras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una lista de palabras (ingrese 'fin' para finalizar):");

        String palabra;
        boolean repetida = false;

        do {
            palabra = scanner.nextLine();

            if (!palabra.equalsIgnoreCase("fin")) {
                if (listaPalabras.contains(palabra)) {
                    repetida = true;
                    System.out.println("La palabra '" + palabra + "' está repetida en la lista.");
                } else {
                    listaPalabras.add(palabra);
                }
            }

        } while (!palabra.equalsIgnoreCase("fin"));

        if (repetida) {
            listaPalabras.remove(palabra);
        }

        System.out.println("La lista de palabras ingresada es:");
        for (String palabraLista : listaPalabras) {
            System.out.println("- " + palabraLista);
        }

        scanner.close();
    }
}

		
	