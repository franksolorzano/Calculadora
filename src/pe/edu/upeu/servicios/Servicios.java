package pe.edu.upeu.servicios;
import android.annotation.SuppressLint;
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
		Double numre = Math.cos(num);
		return numre;
	}
	public Double tan(Double num){
		Double numre = Math.tan(num);
		return numre;
	}
	public Double logaritmo(Double num){
		Double numre = Math.log10(num);
		return numre;
	}
	public Double cubo(Double num){
		Double numre = Math.cbrt(num);
		return numre;
	}
	
	public Double elevadocubo(Double num){
		Double numre = Math.pow(num, 3);
		return numre;
	}
	public Double elevadocuadrado(Double num){
		Double numre = Math.pow(num, 2);
		return numre;
	}
	public Double elevadoexponente(Double num, Double nume){
		Double numre = Math.pow(num, nume);
		return numre;
	}
	public Double elevadoDiesexp(Double num){
		Double numre = Math.pow(10, num);
		return numre;
	}
		public int factorial(int num ){
		int fact = 1; // this  will be the result
        for (int i = 1; i <= num; i++) {
            fact = fact*i;
        }
        return fact;
	}
//	public Double cuadrado(Double num){
//		Double numre = Math.s
//		return numre;
//	}
	public Double potencian(double m, double n){
		Double numre = Math.pow(m,n);
		return numre;
	}
//	public Double unoEntreX(Double num){
//		Double numre = Math.
//		return numre;
//	}
	
	
	
}
