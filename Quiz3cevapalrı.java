package FirstTerm;

import java.util.Scanner;

public class Quiz3cevapalrı {

	public static void main(String[] args) {

	/*	System.out.println("ilk n sayıyı  yazdırmak için n sayısını girin");
		Scanner girdi = new Scanner(System.in);
		int n, n1 = 0, n2 = 1, n3, sayac = 1;
		n = girdi.nextInt();
		System.out.print(n1 + " " + n2);
		do {
			sayac++;
			n3 = n1 += n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);

		} while (n != sayac + 1);
		{
			System.out.println("   ");
			System.out.println(" fibonacci serisinin ilk " + n + " basamaği");
		}
*/
		/*
		System.out.println("lütfen büyüme oranını hesaplamak istedğiniz yüzdeleri 0 olana kadar girin");
		Scanner girdi = new Scanner(System.in);
		double yıllıkbüyümeoranı,sayac=0,ortalama,çarp=1;
		do { 
			yıllıkbüyümeoranı=girdi.nextDouble();
			sayac++;
			ortalama=(1+(yıllıkbüyümeoranı/100.0));
			çarp*=ortalama;
			
		}while(yıllıkbüyümeoranı!=0);
		{
			double sonuç=((Math.pow(çarp,1/(sayac-1)))-1)*100;
			System.out.println("yıllık büyüme ortalamaınız "+sonuç);
		}
*/  
		
		 System.out.print("e^x ifadesi için bir x değeri gir :");
		Scanner girdi = new Scanner(System.in);
		double x = girdi.nextDouble();
		int k = 2147483647;
		double sayi = 1;
		for (int i = k; 0 < i; i--) {
			sayi = 1 + ((x * sayi) / i);
		}
		System.out.println(sayi);

		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// method
}// class