package lista2;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float nota1;

		System.out.println("digite aqui a primeira nota:");
		nota1 = sc.nextFloat();

		float nota2;

		System.out.println("digite aqui a segunda nota:");
		nota2 = sc.nextFloat();

		float nota3;

		System.out.println("digite aqui a terceira nota:");
		nota3 = sc.nextFloat();

		float nota4;

		System.out.println("digite aqui a quarta nota:");
		nota4 = sc.nextFloat();

		float nota5;

		System.out.println("digite aqui a quinta nota:");
		nota5 = sc.nextFloat();

		float media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

		System.out.println("sua media final é:" + media);

	}
}
