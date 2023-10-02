package pruebaTecnicaTeatro;

import java.util.Scanner;

public class ReservaAsientos {

	public static void main(String[] args) {

		char asientos[][] = new char[10][10];
		boolean bandera = false;
		Scanner scan = new Scanner(System.in);
		int fila= 0, asiento=0;
		String respuesta;
		String verMapa;

		for (int f = 0; f < 10; f++) {
			for (int c = 0; c < 10; c++) {
				asientos[f][c] = 'L';
			}
		}

		System.out.println("---------Bienvenidos al sistema de reservas-----------");

		while (bandera = true) {
			System.out.println("Desea ver los asientos disponibles? S: si, cualquier otra letra: No");
			verMapa = scan.next();
			
			if (verMapa.equalsIgnoreCase("S")) {
				
				dibujarMapa(asientos);
				
			}
			
			boolean comprobacion = false;
			
			while(comprobacion){
				
			
			System.out.println("Ingrese fila y de asiento a reservar");
			System.out.println("La fila tiene que ser entre 0 y 9");
			fila = scan.nextInt();

			System.out.println("La asiento tiene que ser entre 0 y 9");
			asiento = scan.nextInt();
			
			if (fila<=9 && fila<=0) {
				if (asiento<=9 && asiento >=0) {
					comprobacion = true;
				}
				else {
			System.out.println("El número de asiento no es válido");
			}
			}
			else {
				System.out.println("El número de fila no es válido");
			}
			}

			if (asientos[fila][asiento] == 'L') {
				asientos[fila][asiento] = 'X';
				System.out.println("El asiento fue reservado correctamente");

			} else {
				System.out.println("El asiento esta ocupado");
			}

			System.out.println("Quiere reservar otro asiento? S es igual a Si cualquier tecla para no");
			respuesta=scan.next();
			
			if(respuesta.equalsIgnoreCase("S")) {
				bandera = true;
			}

		}
	}

	static void dibujarMapa(char asientos[][]) {
		for (int f = 0; f < 10; f++) {
			System.out.print(f + "");
			for (int c = 0; c < 10; c++) {
				System.out.print("[" + asientos[f][c] + "]");
			}
			System.out.println("");
		}
	}
}
