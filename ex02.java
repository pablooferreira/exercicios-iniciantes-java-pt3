//fazer um programa que imprime a media aritmetica dos numeros 8, 9  e 7. a media dos numeros 4, 5 e 6. a soma das duas medias e a media das medias

package ex_trabalho;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int media1, media2;
		double mediasoma, mediamedia;
		
		media1 = (7 + 8 + 9) / 3;
		media2 = (4 + 5 + 6) / 3;
		mediasoma = media1 + media2;
		mediamedia = media1 / media2;

		System.out.printf("A soma das médias é %.2f e a média da média é %.2f\n", mediasoma, mediamedia);

		
		sc.close();

	}

}
