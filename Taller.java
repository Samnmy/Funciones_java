import java.util.Scanner;

public class Taller {

    // Funciones
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static int menorDeDos(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int contarCaracteres(String cadena) {
        return cadena.length();
    }

    public static double calcularPotencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENU DE FUNCIONES ---");
            System.out.println("1. Calcular area de un rectangulo");
            System.out.println("2. Convertir Celsius a Fahrenheit");
            System.out.println("3. Encontrar el menor de dos numeros");
            System.out.println("4. Contar caracteres en una cadena");
            System.out.println("5. Calcular potencia de un numero");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura: ");
                    double altura = scanner.nextDouble();
                    System.out.println("Area: " + calcularAreaRectangulo(base, altura));
                    break;

                case 2:
                    System.out.print("Ingrese grados Celsius: ");
                    double celsius = scanner.nextDouble();
                    System.out.println("Fahrenheit: " + celsiusAFahrenheit(celsius));
                    break;

                case 3:
                    System.out.print("Ingrese el primer numero: ");
                    int n1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    int n2 = scanner.nextInt();
                    System.out.println("El menor es: " + menorDeDos(n1, n2));
                    break;

                case 4:
                    System.out.print("Ingrese una cadena de texto: ");
                    String cadena = scanner.nextLine();
                    System.out.println("Cantidad de caracteres: " + contarCaracteres(cadena));
                    break;

                case 5:
                    System.out.print("Ingrese la base: ");
                    double b = scanner.nextDouble();
                    System.out.print("Ingrese el exponente: ");
                    int exp = scanner.nextInt();
                    System.out.println("Resultado: " + calcularPotencia(b, exp));
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no válida. Intente de nuevo.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}