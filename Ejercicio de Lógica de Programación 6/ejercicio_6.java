package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	
	public static void stringReverse(String string) {
        String invertido = "";
        for (int i = 0; i < string.length(); i++) {
            invertido += string.charAt(string.length() - i - 1);
        }
        System.out.println(invertido);
    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la palabra a revertir");
        String frase = sc.nextLine();
        stringReverse(frase);
        sc.close();
		

	}

}