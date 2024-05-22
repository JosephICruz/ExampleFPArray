/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopfarray;

import java.util.Scanner;

/**
 *
 * @author josephcruz
 */
public class ReservaBicicleta {
    
    
     public static void main(String[] args) {

        // ejercicio : Reserva de estacionamienetos de bicicletas
        // Declaración e inicialización del array
        // false == libre   true == ocupado
        boolean[] estacionamiento = {false, false, false, false, false, false, false, false, false, false};

        // mostramos el  estacionamiento disponible 
        int opcion = 0;
        do {
            
            menu();

            System.out.print("Elija un opción:");
            opcion = capturarNumero();

            switch (opcion) {
                case 2:
                    System.out.print("Ingrese la ubicación del estacionamientos del 1 al 10:");
                    int estacion = capturarNumero();
                    if (reservarEstacionamiento(estacionamiento, estacion)) {
                        System.out.println("Estacionamiento reservado con exito");

                    }else{
                         System.out.println("fuera del estacionamiento");

                    }
                    break;
                case 1:
                    
                    mostrarEstadoEstacionamiento(estacionamiento);
                   
                    break;

                default:
                     System.out.println("dvbdfbdfb");
            }

        } while (opcion != 0);

    }

    // funcion que captura un número
    public static int capturarNumero() {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        return numero;

    }

    public static boolean reservarEstacionamiento(boolean[] estacionamiento, int ubicacion) {
        if (ubicacion < 1 || ubicacion > estacionamiento.length) {
            return false;

        }
        if (estacionamiento[ubicacion - 1] == false) {
            estacionamiento[ubicacion - 1] = true;
            return true;

        }

        return false;
    }
    
    public static void mostrarEstadoEstacionamiento(boolean[]estacionamiento) {
        System.out.println("Estado del estacionamiento");

        for (int i = 0; i < estacionamiento.length; i++) {
        
                if (estacionamiento[i]) {
                    System.out.print("X "); // ocupado
                } else {
                    System.out.print("O "); // libre
                }
            }
        System.out.println();
         
    }
    
    

    public static void menu() {

        System.out.println("1.- ver lugares disponibles");
        System.out.println("2.- seleccionar un estacionamientos");
        System.out.println("0.- salir");

    }

    
}
