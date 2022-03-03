package FirstTerm;

import java.util.Scanner;

public class Quiz5 {
	static int fib(int n) {
int a=0;
int b=1;
		return fib(n,a,b);
	}
	static int fib(int n,int a,int b) 
    {  
        if (n == 0) 
            return a; 
        if (n == 1) 
            return b; 
        return fib(n - 1, b, a + b); 
    } 

	
	
	public static int fibonacci(int n) {
		int a=0;
		int b=1;
		return fibonacci(n,a,b);
	}

	public static int fibonacci(int n,int a,int b) {
		if (n == 0)
			return a;
		if (n == 1)
			return b;
		int k = fibonacci(n - 1,a,b) + fibonacci(n - 2,a,b);
		return k;
	}

	static int sayac = 0;

	public static int NumberOfEvenDigits(int a) {
		if (a % 2 == 0) { // sanırım a nın sıfır olduğu durumdada sayacı 1 arttırıyor o yüzden return
							// sayac-1 yaptım
			sayac++;
		}
		if (a == 0) {
			return sayac - 1;
		}
		return NumberOfEvenDigits(a / 10);
	}

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner girdi = new Scanner(System.in);
		int a = girdi.nextInt();
		System.out.println(fibonacci(a));
		//System.out.println("number of even digits ");
		//System.out.println(NumberOfEvenDigits(a));
	}
}
