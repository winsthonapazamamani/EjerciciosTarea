//Genera la tabla del 5 hasta el producto de 5x10.
public class Multiplicar5 {
    public static void main(String[] args) {
        System.out.println("Tabla del 5:");
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            int resultado = 5 * multiplicador;
            System.out.println("5 x " + multiplicador + " = " + resultado);
        }
    }
}
