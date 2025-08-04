import java.util.Scanner;

public class promedio {

    public static double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    public static boolean estaAprobado(double promedio) {
        return promedio >= 61;
    }

    public static void mostrarResumen(String[] nombres, double[] promedios, String[] estados) {
        System.out.println("\nResumen de estudiantes:");
        System.out.println("------------------------");
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("Nombre: %-10s Promedio: %6.2f     Estado: %s\n", nombres[i], promedios[i], estados[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes vas a ingresar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        // Arreglos para guardar datos
        String[] nombres = new String[cantidad];
        double[] promedios = new double[cantidad];
        String[] estados = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Nombre del estudiante: ");
            String nombre = scanner.nextLine();

            double[] notas = new double[3];
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese la nota " + (j + 1) + ": ");
                notas[j] = scanner.nextDouble();
            }
            scanner.nextLine();

            double promedio = calcularPromedio(notas);
            boolean aprobado = estaAprobado(promedio);
            String estado = aprobado ? "Aprobado" : "Reprobado";

            // Guardar en arreglos
            nombres[i] = nombre;
            promedios[i] = promedio;
            estados[i] = estado;
        }

        // Mostrar resumen
        mostrarResumen(nombres, promedios, estados);

        scanner.close();
    }
}
