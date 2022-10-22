//1Programa para ler a idade da pessoa e mostrar a idade em dias.
package ex_trabalho;

import java.util.Scanner;
public class ex01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade, meses, dias, total;
		
		System.out.println("Quantos anos, meses e dias tem?  ");
		idade = sc.nextInt();
		meses = sc.nextInt();
		dias = sc.nextInt();

		total = (idade * 365) + (meses * 30) + dias;

		System.out.println("Você tem " + total + " dias de idade!");
		
		sc.close();

	}

}
