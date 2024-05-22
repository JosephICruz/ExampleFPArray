package ejemplopfarray;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author josephcruz
 */
public class PiedraPapelTijera {

    // creando un  array de 1 dimension
    public static int[] ValoresDeJuego = {0, 1, 2};

    public static void main(String[] args) {

        int eleccionPC = randonPC();
        
        System.out.print("seleccion 0 = piedra, 1 = papel y  2 = tijera:");
        Scanner sc = new Scanner (System.in);
        String EleccionJugador = sc.nextLine(); // 1 = piedra  2 = papel  3 = tijera

        String resultadoJuego = comparar(EleccionJugador, eleccionPC);

        System.out.println(resultadoJuego);
        System.out.println("juegador:"+EleccionJugador+" PC:"+eleccionPC);

    }

    //Metodo random de la eleccion  de la pc 
    public static int randonPC() {
        int Pcran = (ValoresDeJuego[new Random().nextInt(ValoresDeJuego.length)]);
        return Pcran;
    }

    // metodo de camparar elecciones de los jugadores
    public static String comparar(String Jugador, int PC) {

        int convertriCadenaJugador = Integer.parseInt(Jugador);// convierte el  string en  entero 

        int[][] valores_datos = {{0, 2, 1}, // cada corchete es una dimensión
                                 {1, 0, 2},
                                 {2, 1, 0}
                                };

        int resltadosarray = valores_datos[convertriCadenaJugador][PC];

        switch (resltadosarray) {
            case 0:

                String respuesta0 = "es un  empate // vuelte a seleccionar ";

                return respuesta0;

            case 1:

                String respuesta1 = "Ganaste :: ERES MEDIO BUENO";

                return respuesta1;

            default:

                String respuesta2 = "te gano  la PC:: ERES BUEN PERDEDOR ";

                return respuesta2;

        }

    }

}
