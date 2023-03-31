package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        HashMap<String, String> dictionaryAnimals = new HashMap<>();

        dictionaryAnimals.put("Rata", "Rat");
        dictionaryAnimals.put("Rana", "Frog");
        dictionaryAnimals.put("Pavo", "Turkey");
        dictionaryAnimals.put("Perro", "Dog");
        dictionaryAnimals.put("Pato", "Duck");
        dictionaryAnimals.put("Oveja", "Sheep");
        dictionaryAnimals.put("Oso", "Bear");
        dictionaryAnimals.put("Murciélago", "Bat");
        dictionaryAnimals.put("Búho", "Owl");
        dictionaryAnimals.put("Abeja", "Bee");
        dictionaryAnimals.put("Araña", "Spider");
        dictionaryAnimals.put("Ardilla", "Squirrel");
        dictionaryAnimals.put("Jaguar", "Jaguar");
        dictionaryAnimals.put("León", "Lion");
        dictionaryAnimals.put("Avispa", "Wasp");
        dictionaryAnimals.put("Gallina", "Hen");
        dictionaryAnimals.put("Serpiente", "Snake");
        dictionaryAnimals.put("Tiburón", "Shark");
        dictionaryAnimals.put("Gato", "Cat");
        dictionaryAnimals.put("Tortuga", "turtle");

        System.out.println("De la siguiente lista, escribe la palabra de la que quieras ver la traducción\n");

        dictionaryAnimals.forEach((key, value) -> System.out.print(key + " "));
        System.out.println(" ");
        String answer = scanner.next();
        answer = answer.substring(0, 1).toUpperCase() + answer.substring(1);

        if (dictionaryAnimals.containsKey(answer)) {
            System.out.println("La traducción de español de " + answer + " a inglés es " + dictionaryAnimals.get(answer));
        } else {
            System.out.println("La palabra no se encuentra en el diccionario");
        }

        scanner.close();

	}

}
