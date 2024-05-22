
package ejemplopfarray;

import java.util.Scanner;

/**
 *
 * @author josephcruz
 */
public class ReservaCine {
    
    
    
    public static void main(String[] args) {
        // Declaración e inicialización del array bidimensional para los asientos del cine
        boolean[][] asientos = {
                                {true, true, false, true, true},
                                {true, false, true, false, true},
                                {true, true, true, true, true},
                                {false, true, true, true, false},
                                {true, false, true, false, true}
                              };

        mostrarEstadoAsientos(asientos);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese la fila (1-5) o -1 para salir: ");
            int fila = scanner.nextInt();

            if (fila == -1) {
                System.out.println("Saliendo del programa...");
                break;
            }

            System.out.print("Ingrese la columna (1-5): ");
            int columna = scanner.nextInt();

            if (reservarAsiento(asientos, fila, columna)) {
                System.out.println("¡Asiento reservado con éxito!");
            } else {
                System.out.println("El asiento solicitado está ocupado o no es válido. Intente nuevamente.");
            }

            mostrarEstadoAsientos(asientos);
        }

        scanner.close();
    }

    public static void mostrarEstadoAsientos(boolean[][] asientos) {
        System.out.println("Estado de los Asientos:");

        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if (asientos[i][j]) {
                    System.out.print("O ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }

    public static boolean reservarAsiento(boolean[][] asientos, int fila, int columna) {
        if (fila < 1 || fila > asientos.length || columna < 1 || columna > asientos[0].length) {
            return false;
        }

        if (asientos[fila - 1][columna - 1]) {
            asientos[fila - 1][columna - 1] = false;
            return true;
        }

        return false;
    }
    
}
