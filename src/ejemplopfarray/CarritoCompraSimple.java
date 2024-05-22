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
public class CarritoCompraSimple {
    
    public static void main(String[] args) {
        // Declaración e inicialización del array de productos
        String[] productos = new String[10];
        double[] precios = new double[10];
        int numProductos = 0;

        // Menú principal
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("1. Agregar producto");
            System.out.println("2. Ver carrito de compras");
            System.out.println("3. Calcular total");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Agregar producto
                    scanner.nextLine(); // Consumir la línea en blanco
                    System.out.print("Introduce el nombre del producto: ");
                    String producto = scanner.nextLine();
                    System.out.print("Introduce el precio del producto: ");
                    double precio = scanner.nextDouble();
                    productos[numProductos] = producto;
                    precios[numProductos] = precio;
                    numProductos++;
                    System.out.println("Producto agregado al carrito.");
                    break;

                case 2:
                    // Ver carrito de compras
                    if (numProductos == 0) {
                        System.out.println("El carrito de compras está vacío.");
                    } else {
                        System.out.println("Carrito de compras:");
                        for (int i = 0; i < numProductos; i++) {
                            System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i]);
                        }
                    }
                    break;

                case 3:
                    // Calcular total
                    double total = 0;
                    for (int i = 0; i < numProductos; i++) {
                        total += precios[i];
                    }
                    System.out.println("Total a pagar: $" + total);
                    break;

                case 4:
                    // Salir
                    System.out.println("¡Gracias por utilizar el carrito de compras!");
                    break;

                default:
                    System.out.println("Opción no válida. Introduce otra opción.");
                    break;
            }
        }
    }
    
    
}
