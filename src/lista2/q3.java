package lista2;

import java.util.Random;

public class q3 {

	public static void main(String[] args) {

		Random random = new Random();
		int array[] = new int[100];
		

		for (int i = 0; i < array.length; i++) {
			array[i]= random.nextInt(100);
			System.out.println(array[i]);
		}

		// inversa;

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}

	}

}
