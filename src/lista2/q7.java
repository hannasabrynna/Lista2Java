package lista2;

import java.util.Random;

public class q7 {
	public static void main(String[] args) {

		Random random = new Random();
		int array[] = new int[100];
		int maior = 0;
		int menor = 0;
		

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
			System.out.println(array[i]);
			
	
		}
		
		for(int i = 0;i<= array.length -1;i++){
	           

            if(array[i]>maior){
                maior= array[i];
            }
            if(array[i]<menor){ //como eu inicializo minha variavel com 0 ele sempre imprime o 0 como o menor valor.
               menor=array[i]; 
            }
             
        }
    System.out.println("o menor elemeto encontrado foi : " + menor);
    System.out.println("O maior elemento encontrado foi : " + maior);
    
	} 
}




