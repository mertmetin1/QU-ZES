package FirstTerm;

import java.util.Scanner;

public class Quiz4 {
	public static void ÖZGE(String kelime,char harf) {
		String yenikelime=kelime.toLowerCase();
		char yeniharf=Character.toLowerCase(harf);
		for (int i = 0; i < kelime.length(); i++) {
			if (yenikelime.charAt(i) != yeniharf) {
				System.out.print(yenikelime.charAt(i));
			}
			}
	}
	public static int faktöriyel(int a) {
		int fak;

		for (fak = 1; a > 1; a--) {
			fak *= a;
		}
		return fak;
	}
	public static int kombinasyon(int n, int r) {
		return faktöriyel(n) / (faktöriyel(n - r) * faktöriyel(r));
	}
	public static void main(String args[]) {
		System.out.println("sayı gir");
		Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();
		for (int i = 0; i < sayi; i++) {
			for (int j = 0; j < sayi - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(kombinasyon(i, j) + " ");
			}
			System.out.println();
		}
		
		/*   
		 System.out.println("kelime gir");
		Scanner girdi = new Scanner(System.in);
		String kelime = girdi.next();
		System.out.println(" harf gir");
		char harf = girdi.next().charAt(0);
		ÖZGE(kelime,harf);
		 */
	}
}
