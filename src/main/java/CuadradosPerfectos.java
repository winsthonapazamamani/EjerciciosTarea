//Cuadrados perfectos
public class CuadradosPerfectos {
    public static void main(String[] args) {

        System.out.println("Cuadrados Perfectos hasta 100:");

        for (int i = 1; i <= 10; i++) {

            int cuadrado = i * i;


            if (cuadrado <= 100) {

                System.out.println(cuadrado);
            }
        }
    }
}
