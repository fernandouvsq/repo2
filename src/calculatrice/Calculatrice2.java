

package calculatrice;

import java.util.Scanner;

public class Calculatrice2 {
	public static void main(String[] args) {
		System.out.println("Combien des operations a faire");
		Scanner teclado = new Scanner(System.in);
		int n = Integer.parseInt(teclado.nextLine());
		int res[] = new int[n];

		System.out.println("Entrez un valeur");
		Scanner teclado1 = new Scanner(System.in);
		int n1 = Integer.parseInt(teclado1.nextLine());
		System.out.println("Entrez un valeur");
		Scanner teclado2 = new Scanner(System.in);
		int n2 = Integer.parseInt(teclado2.nextLine());
		System.out.println("Entrez un symbol pour operer");
		Scanner teclado3 = new Scanner(System.in);
		String n3 = teclado3.nextLine();

		if (n1 < n2) {
			int nnn = n1;
			n1 = n2;
			n2 = nnn;
		}

		switch (n3) {
		case "+":
			res[0] = n1 + n2;
			break;
		case "-":
			res[0] = n1 - n2;
			break;
		case "/":
			res[0] = n1 / n2;
			break;
		case "*":
			res[0] = n1 * n2;
			break;
		default:
		}

		for (int a = 1; a < n; a++) {

			System.out.println("Entrez un valeur");
			Scanner teclado22 = new Scanner(System.in);
			int n22 = Integer.parseInt(teclado22.nextLine());
			System.out.println("Entrez un symbol pour operer");
			Scanner teclado33 = new Scanner(System.in);
			String n33 = teclado33.nextLine();

			if (res[a - 1] < n22) {
				int nnn = res[a - 1];
				res[a - 1] = n22;
				n22 = nnn;
			}

			switch (n33) {
			case "+":
				res[a] = res[a - 1] + n22;
				break;
			case "-":
				res[a] = res[a - 1] - n22;
				break;
			case "/":
				res[a] = res[a - 1] / n22;
				break;
			case "*":
				res[a] = res[a - 1] * n22;
				break;
			default:

			}
		}

		for (int aa = 0; aa <= n - 1; aa++) {
			System.out.println("Index:" + (aa+1) + "-Valeur:" + res[aa]);

		}
	}
}

