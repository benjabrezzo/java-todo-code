package com.mycompany.asientosanfiteatro;

import java.util.Scanner;

/**
 *
 * @author benja
 */
public class AsientosAnfiteatro {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        boolean bandera = false;
        int fila = 0, asiento = 0;
        String respuesta;
        String verMapa;
        
        char asientos [][] = new char[10][10];
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                asientos[i][j] = 'L';
            }
        }       
        
        System.out.println("--------------BIENVENIDO AL SISTEMA DE RESERVAS--------------");
        
        while(!bandera){
            System.out.print("¿Desea ver los asientos disponibles?(s/n): ");
            verMapa = scan.next();
            
            if(verMapa.equalsIgnoreCase("s")){
                mostrarAsientos(asientos);
            }
            
            
            //Reserva
            boolean estaOK = false;
            
            while(!estaOK){
                System.out.println("Ingrese fila y asiento a reservar");
                System.out.print("Fila (entre 1 y 10): ");
                fila = scan.nextInt() - 1;
                System.out.print("Asiento (entre 1 y 10): ");
                asiento = scan.nextInt() - 1;
                if(fila<=10 && fila>0){
                    if(asiento<=10 && fila>0){
                        estaOK = true;
                    } else {
                        System.out.println("El número de asiento no es válido");
                    }
                } else{
                    System.out.println("El número de fila no es válido.");
                }
            }
            if(asientos[fila][asiento] == 'L'){
                asientos[fila][asiento] = 'X';
                System.out.println("El asiento fue reservado correctamente.");
            } else {
                System.out.println("El aseinto está ocupado. Eliga otro.");
            }
            System.out.print("Desea seguir reservado asientos?(S/N): ");
            respuesta = scan.next();
            
            if(respuesta.equalsIgnoreCase("N")){
                bandera = true;
            }
        }        
    }
    
    
    static public void mostrarAsientos(char[][] asientos){
        for(int i=0; i<10; i++){
            System.out.print((i+1) +" ");
            for(int j=0; j<10; j++){
                System.out.print("["+asientos[i][j]+"] ");
            }
            System.out.println("");
        } 
    }   
}


