package funzionephieulero;

public class Main {
	public static void main (String args[]) {
		for (int i = 2; i < 100; i++) System.out.println(i + " - phi: " + phi(i, 2, 1));
	}
	
	public static int mcd (int a, int b) { //Ricorsione per MASSIMO COMUNE DIVISORE
		if (a == 0) return b;
		if (b == 0) return a;
		if (b > a) return mcd(b % a, a); //b>a
		else return mcd(b, a % b);
	}

	public static int phi(int n, int numeroControllo, int risultato) { 
		if (mcd(numeroControllo, n) == 1) {
			numeroControllo++;
			risultato++;
			return phi(n, numeroControllo, risultato);
		}
		else if (numeroControllo < n) {
			numeroControllo++;
			return phi(n, numeroControllo, risultato);
		}
		return risultato;
	}
}
