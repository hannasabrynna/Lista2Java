package lista2;

import java.util.Random;

public class q5 {

	public static void main(String[] args) {

		Random random = new Random();

		int array[] = new int[100];

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
			
			
			if (array[i] % 2 != 0){
				System.out.println("o numero: " + array[i] + ", é impar.");
			}	

		}

	}
}