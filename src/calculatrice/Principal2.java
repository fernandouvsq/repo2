package calculatrice;

import java.util.Scanner;

public class Principal2 {
//UN SEUL CHIFFRE ET SANS SPACES
	public static void main(String[] args) {
		String listtxt[];
		String cadenaSinEspacios = "";
		System.out.println("Ingresar operaciones a procesar");
		Scanner teclado = new Scanner(System.in);
		String n = teclado.nextLine();
		int largotxt = n.length();
		System.out.println("largo del texto:" + largotxt);
		listtxt = new String[largotxt];

		for (int a = 0; a < largotxt; a++) {

			if (n.charAt(a) != ' ') {
				cadenaSinEspacios = cadenaSinEspacios + n.charAt(a);
				listtxt[a] = String.valueOf(n.charAt(a));
			}
		}
		largotxt = cadenaSinEspacios.length();
		listtxt = new String[largotxt];
		for (int aa = 0; aa < largotxt; aa++) {
			listtxt[aa] = String.valueOf(n.charAt(aa));

		}
		System.out.println("sinespacios" + cadenaSinEspacios);
		int inicio[] = new int[largotxt];
		int fin[] = new int[largotxt];

		for (int b = 0; b < largotxt; b++) {
			if (b == 0) {
				inicio[b] = 0;
				fin[b] = 0;
			} else {
				if (b >= 2 && b % 2 == 0) {
					inicio[b] = b - 2;
					if (b < largotxt - 2)
						fin[b] = b + 2;
				} else {

					inicio[b] = b - 1;

				}

			}
			System.out.println("El numero:" + listtxt[b] + ",Nodo :[" + b + "], ant=" + inicio[b]);
		}
		System.out.println(cadenaSinEspacios);

		// mostrar al reves RPN
		String cadenanumeros = "";
		String cadenasignnos = "";
		for (int g = 0; g < largotxt; g = g + 2) {
			System.out.println(g);

			cadenanumeros = cadenanumeros + listtxt[g];
		}
		System.out.println(cadenanumeros);

		for (int g = largotxt - 2; g > 0; g = g - 2) {
			System.out.println(g);
			cadenasignnos = cadenasignnos + listtxt[g];
		}
		System.out.println(cadenasignnos);

		String cadenafinal = "Frase Postfixe:" + cadenanumeros + " " + cadenasignnos;
		System.out.println(cadenafinal);

	}

}
