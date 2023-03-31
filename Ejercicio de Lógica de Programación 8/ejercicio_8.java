package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
        int[] nums = new int[10];

        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        checkPrime(nums);

        sc.close();
	}//fin main
	
	 public static void checkPrime(int[] nums) {

	        int[] orderArray = new int[10];
	        int conter = 0;
	        int numPrime = 0;
	        int numNonPrime = nums.length - 1;

	        for (int num : nums) {

	            for (int j = 2; j <= num; j++) {
	                if (num % j == 0) {
	                    conter++;
	                }
	            }
	            if (conter == 1) {

	                orderArray[numPrime] = num;
	                numPrime++;
	            } else {
	                orderArray[numNonPrime] = num;
	                numNonPrime--;
	            }
	            conter = 0;
	        }
	        System.out.println("Los números primos se han colocado al principio del array:");
	        System.out.println(Arrays.toString(orderArray));
	    }
}
