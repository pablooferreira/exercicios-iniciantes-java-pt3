//Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado.

package ex_trabalho;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario, salariominimo, equivalente;

		System.out.println("Digite o valor do seu salário: ");
		salario = sc.nextDouble();
		
		salariominimo = 788;
		
		if (salario < salariominimo) {
			System.out.println("Seu salário é menor que UM salário minimo!");
			}
		else {
			equivalente = salario / salariominimo;
			System.out.printf("Seu salário equivale à %.2f salários mínimos", equivalente);
			}
		
		sc.close();

	}

}
