package lista2;

import java.util.Random;

public class q8 {

	public static void main(String[] args) {

		Random random = new Random();
		int array[] = new int[100];
		int contador=0;
		int soma=0;
		float media=0;
		

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
			//System.out.println(array[i]);
			
			soma= soma + array[i];
			contador++;
		}
		
		media= soma / contador; 
		System.out.println("a media foi:" + media);	 	
		
	}
}
