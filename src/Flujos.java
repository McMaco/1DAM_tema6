/***PROGRAMA DE FLUJOS
 * AUTOR: DAVID MCCONNELL VICENTE
 * FECHA: 26/02/2019
 * CURSO: DM1B
 */

import java.io.*;
import java.util.Scanner;

public class Flujos {
	
	public static void miPrint(String cad) {
		PrintWriter p = new PrintWriter(System.out);
		p.write(cad);
		p.flush();
	}
	
	public static String miLectura() {
		
		String cad = "";
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			cad = br.readLine(); 
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		return cad;
	}
	
	public static void main(String [] args) {
		
		Scanner t = new Scanner(System.in);
		System.out.println("Introduzca una palabra");
		String cad = t.next();
		System.out.println("Con Scanner: "+ cad);
		System.out.println();
		System.out.println("Introduzca otra palabra");
		cad = miLectura();
		System.out.print("Sin escaner: ");
		miPrint(cad);
	}
}
