//Suma de números impares
public class Sumaimpares {
    public static void main(String[] args) {
        int sumaImpares = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sumaImpares += i;
            }
        }
        System.out.println("La suma de los números impares del 1 al 100 es: " + sumaImpares);
}
}