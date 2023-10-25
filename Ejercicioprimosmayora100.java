package javazzz;
/*
import java.util.Scanner;

public class zzz {

 public static void main(String[] args) {
	 
	   Scanner scanner = new Scanner(System.in);
	   
	   int noesprimo = 0;
	   int a = 0;
	 
	 while(noesprimo > 0 && a > 100) {
			
         System.out.print("Ingrese numeros, el programa se detendra cuando sea mayor a 100 y primo: ");
			a = scanner.nextInt();
			
			if (a < 0) {
				System.out.print("El numero tiene que ser minimo 1");
				return;
			}
			
			for (int x = a - 1 ; x > 1; x--) {
		    	 if (a % x == 0 ) {
		    		 noesprimo = 1;
		       }
		    	 else {
		    		 noesprimo = 0;
		    	 }
	        }
     }
 }
}
