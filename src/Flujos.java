/***PROGRAMA DE FLUJOS
 * AUTOR: DAVID MCCONNELL VICENTE
 * FECHA: 26/02/2019
 * CURSO: DM1B
 */

import java.io.*;
import java.util.Scanner;

public class Flujos {
	
	public static char v[] = new char[100];
	
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
			int x = 0, i = 0;
			
			while((x == 0) && (i < cad.length()) && (cad.length()>0)) {
				if(cad.charAt(i)==' ') {
					x = i;
				}
				else {
					i++;
				}
			}
			
			if(x!=0) {
				cad = cad.substring(0, x);
			}
			
			/*if(cad.indexOf(' ')!=0) {
				cad = cad.substring(0, cad.indexOf(" "));
			}*/
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
