import java.util.Scanner;

public class Codigo5 {
	//se agrega metodo main para ejecutar metodos y prints
	public static void main(String[] args) {
		// se importa packete de scanner, se agrega el system.in
	    Scanner s = new Scanner(System.in);
	    // se unifican comillas
	    System.out.print ("Introduzca un número: " ) ;
	    //se modifica el tipo de entrada a un numero entero
	    int ni = s.nextInt();
	    int c = ni;
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (ni > 0) {
		  int digito = (int)(ni % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
			//se agrega la division para que no sea un ciclo infinito
			 ni /= 10;
	      } else {
			noAfo++;
		  
		  ni /= 10;
	    }
	    if (afo > noAfo) {
	    	//se corrige sintaxis del println
	      System.out.println("El " + c + " es un número afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    
	  }
	}
		
	  
	}