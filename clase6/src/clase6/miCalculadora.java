package clase6;

public class miCalculadora {

	public static void main(String[] args) {
		
		Calculadora miCalculadora = new Calculadora();
        
        int numero1 = 150;
        int numero2 = 180;
        int numero3 = 90;
        int numero4 = 50;
        int numero5 = 80;
        int numero6 = 3;
        int numero7 = 4;
        int numero8 = 95;
        double resultado = (double) numero1 + numero2 / numero7;
        int resultado1 = (int) (numero3 - numero4) * numero5;
        
        System.out.println("La suma de " + numero1 + " y " + numero2 + " dividido por " + numero7 + " es: " + resultado);
        System.out.println("La resta de " + numero3 + " y " + numero4 + " multiplicado por " + numero5 + " es: " + resultado1);
        System.out.println("La multiplicacion entre " + numero5 + " y " + numero6 + " es: " + miCalculadora.multiplicacion(numero5, numero6));
        System.out.println("La division de " + numero7 + " y " + numero8 + " es: " + miCalculadora.division(numero7, numero8));
	}

}
