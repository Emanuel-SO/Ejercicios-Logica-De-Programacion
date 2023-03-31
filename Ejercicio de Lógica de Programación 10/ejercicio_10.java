package ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

        System.out.println(writeTranslate(dictionaryAnimals));

	}//fin main
	
	public static String writeTranslate(HashMap<String, String> listOfWords) {

        // Variables, hashmap y ArrayList que utiliza la función
        Scanner scanner = new Scanner(System.in); // Permite el input en la terminal
        int hits = 0;
        String quest;
        String answer;

        ArrayList<String> dictionaryKeys = new ArrayList<>(listOfWords.keySet());

        System.out.println("\nA continuación se te mostrarán 5 palabras en español, tendrás que escribir la traducción al inglés.");

        // Funcionamiento
        for (int i = 0; i < 5; i++) {
            quest = dictionaryKeys.get((int) (Math.random() * dictionaryKeys.size()));
            System.out.println("\n" + quest);
            answer = scanner.next();
            if (listOfWords.get(quest).equalsIgnoreCase(answer)) {
                hits += 1;
            } else {
                System.out.println("La respuesta correcta es: " + listOfWords.get(quest));
            }
        }
        scanner.close();
        return "Obtuviste " + hits + " de 5 respuestas correctas";
        
	}//fin funcion

}//fin class ejercicio
