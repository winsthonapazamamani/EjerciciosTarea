//Suma de dígitos
import java.util.Scanner;
public class SumaDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número para sumar sus dígitos: ");

        int numero = scanner.nextInt();

        scanner.close();

        int suma = sumarDigitos(numero);

        System.out.println("La suma de los dígitos de " + numero + " es: " + suma);
    }

    private static int sumarDigitos(int n) {

        int suma = 0;

        while (n != 0) {

            int digito = n % 10;

            suma += digito;

            n /= 10;
        }

        return suma;
    }
}
