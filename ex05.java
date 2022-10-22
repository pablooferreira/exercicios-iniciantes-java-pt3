//Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor

package ex_trabalho;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero, ant, suc;

		System.out.println("Digite o valor do número: ");
		numero = sc.nextInt();
		
		suc = numero + 1;
		ant = numero - 1;
		
		System.out.printf("O antecessor é %d e o sucessor é %d\n", ant, suc);
		
		sc.close();

	}

}
