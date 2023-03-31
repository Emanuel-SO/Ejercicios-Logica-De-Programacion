package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input = new Scanner(System.in);

	        System.out.println("Ingresa el día (lunes a viernes)");
	        String diaSemana = input.nextLine();
	        int diaCheck = checkPattern.checkDia(diaSemana);

	        System.out.println("Ingresa la hora en un formato de 24 horas");
	        String hour = input.nextLine();
	        int hourCheck = checkPattern.checkHours(hour);

	        System.out.println("Ingresa los minutos");
	        String minutes = input.nextLine();
	        int minutesCheck = checkPattern.checkMinutes(minutes);

	        int result = Weekend.minutesToWeekend(diaCheck, hourCheck, minutesCheck);

	        System.out.println("Faltan " + result + " minutos para el fin de semana");

	        input.close();
	}
	
	public class Regex {

	    String hourPattern = "([0-2]?[0-4])";
	    String minutesPattern = "([0-5]?[0-9]|[0-6]?[0])";

	    String diaPattern = "\\b(lunes|martes|miercoles|jueves|viernes)\\b";
	}
	
	public class checkPattern {
		
		
	   

	   
		
	    static Scanner sc = new Scanner(System.in);

	    public static int checkDia(String dia) {
	    	String diaPattern = "\\b(lunes|martes|miercoles|jueves|viernes)\\b";
	        boolean diaCheck = dia.matches(diaPattern);
	        while (!(diaCheck)) {
	            System.out.println("El formato de día no es el correcto. Ingresa el día (lunes a viernes)");
	            dia = sc.next();
	            diaCheck = dia.matches(diaPattern);
	        }

	        switch (dia) {
	            case "lunes" -> {
	                return 0;
	            }
	            case "martes" -> {
	                return 1;
	            }
	            case "miercoles" -> {
	                return 2;
	            }
	            case "jueves" -> {
	                return 3;
	            }
	            case "viernes" -> {
	                return 4;
	            }
	        }

	        return 5;
	    }

	    public static int checkHours(String hour) {
	    	String hourPattern = "(([0-1]?[0-9])|([2][0-4]))";
	        boolean hourCheck = hour.matches(hourPattern);

	        while (!(hourCheck)) {
	            System.out.println("El formato de hora no es el correcto. Ingresa la hora en un formato de 24 horas.");
	            hour = sc.next();
	            hourCheck = hour.matches(hourPattern);

	        }
	        return Integer.parseInt(hour);
	    }

	    public static int checkMinutes(String minutes) {
	    	 String minutesPattern = "([0-5]?[0-9]|[0-6]?[0])";
	        boolean minutesCheck = minutes.matches(minutesPattern);

	        while (!(minutesCheck)) {
	            System.out.println("El formato de minutos no es el correcto. Ingresa los minutos en un formato de 60 minutos.");
	            minutes = sc.next();
	            minutesCheck = minutes.matches(minutesPattern);

	        }
	        return Integer.parseInt(minutes);
	    }

	}
	
	
	
	public class Weekend {

	    public static int minutesToWeekend(int dia, int hour, int minutes) {

	        final int minutesFinDeSemana = (4 * 1440) + 780;
	        int totalMinutes = (hour * 60) + (dia * 1440) + minutes;

	        return minutesFinDeSemana - totalMinutes;

	    }
	}
	
	
	
	

}
