//Factorial de un número
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número para calcular su factorial: ");
        int numero = scanner.nextInt();
        scanner.close();
        long factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }

    private static long calcularFactorial(int n) {

        if (n < 0) {
            System.out.println("El factorial no está definido para números negativos.");
            return -1;
        }

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
