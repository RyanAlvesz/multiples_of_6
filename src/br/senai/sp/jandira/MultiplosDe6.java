package br.senai.sp.jandira;

import java.util.Scanner;

public class MultiplosDe6 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int valor1, valor2, maior, menor;

		System.out.println("**************************");
		System.out.println("      Multiplos de 6");
		System.out.println("**************************");
		System.out.println("");

		System.out.println("Insira o primeiro valor");
		valor1 = teclado.nextInt();

		System.out.println("Insira o segundo valor");
		valor2 = teclado.nextInt();
		System.out.println("");

		if (valor1 > valor2) {
			maior = valor1;
			menor = valor2;
		} else {
			maior = valor2;
			menor = valor1;
		}

		while (menor < maior) {
			if (menor % 6 == 0) {
				System.out.println(menor);
			}

			menor++;

		}

	}

}
