package empresa.de.vuelos.con.matrices;

import java.util.Scanner;

/**
 *
 * @author benja
 */
public class EmpresaDeVuelosConMatrices {

    public static void main(String[] args) {

        //Creamos la matriz vuelos
        int vuelos[][] = new int[6][3];
        Scanner entrada = new Scanner(System.in);

        //Cargamos la matriz
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese la cantidad de asientos para el destion: " + i + " horario: " + j);
                vuelos[i][j] = entrada.nextInt();
            }
        }

        //Venta de asientos
        Scanner entrada2 = new Scanner(System.in);
        String bandera = "";
        int destino, horario, asientos;

        while (!bandera.equalsIgnoreCase("finish")) {
            System.out.println("Ingrese el N° de destino: ");
            destino = entrada.nextInt();
            System.out.println("Ingrese el horario de vuelo: ");
            horario = entrada.nextInt();
            System.out.println("Ingrese la cantidad de asientos: ");
            asientos = entrada.nextInt();

            if (destino >= 0 && destino <= 5) {
                if (horario >= 0 && horario <= 2) {
                    if (vuelos[destino][horario] >= asientos) {
                        System.out.println("Su reserva fue realizada con exito.");
                        vuelos[destino][horario] = vuelos[destino][horario] - asientos;
                    } else {
                        System.out.println("No hay asientos disponibles.");
                    }

                    System.out.println("¿Desea continuar reservando?. Ingrese finish para terminar o cualquier valor para seguir");
                    bandera = entrada2.next();
                } else {
                    System.out.println("Horario no existente. Ingrese entre 0 y 2.");
                }
            } else {
                System.out.println("Destino no existente. Ingrese en 0 y 5.");
            }

        }
    }

}
