package clase6;

public class Calculadora {

	public static void main(String[] args) {
		
	}
		public int suma(int numero1, int numero2) {
	        return numero1 + numero2;
	    }

	    public int resta(int numero3, int numero4) {
	        return numero3 - numero4;
	    }

	    public int multiplicacion(int numero5, int numero6) {
	        return numero5 * numero6;
	      
	    }

	    public double division(double numero7, double numero8) {
	        if (numero8 == 0) {
	            throw new ArithmeticException("No se puede dividir entre cero.");
	        }
	        return numero7 / numero8;
		}

}
