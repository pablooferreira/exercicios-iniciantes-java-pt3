//Informar um saldo e imprimir o salto com reajuste de 1%

package ex_trabalho;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double saldo, reajuste;
		
		System.out.println("Informe seu saldo: ");
		saldo = sc.nextDouble();
		
		reajuste = saldo * 1.01;
		
		System.out.printf("O saldo com reajuste é %.2f\n", reajuste);
		
		
		sc.close();
	}

}
