package pe.edu.upeu.servicios;
import java.math.*;
public class Servicios {

	public Double raiz(Double numero){
		Double numRaiz = Math.pow(numero,0.5);
		
		return numRaiz;
		
	}
	public Double seno(Double num){
		Double numre = Math.sin(num);
		return numre;
	}
	public Double coseno(Double num){
		return Math.cos(num);
	}
	public Double tan(Double num){
		return Math.tan(num);
	}
	public Double logaritmo(Double num){
		return Math.log10(num);
	}
	public int factorial(int num ){
		int fact = 1; // this  will be the result
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
	}
	
	public Double potencian(Double num, int potencia){
		return Math.pow(num, potencia);
	}
	
	
	
	
}
