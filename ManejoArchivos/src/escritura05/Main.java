/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.util.Scanner;

/**
 *
 * @author jdavi
 */
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal;
        boolean bandera = true;
        while (bandera) {

            System.out.println("Ingrese su nombre:");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su cedula:");
            String cedula = entrada.nextLine();
            System.out.println("Ingrese la marca de su vehiculo:");
            String marca = entrada.nextLine();
            System.out.println("Ingrese su placa:");
            String placa = entrada.nextLine();
            placa = placa.toUpperCase();

            cadenaFinal = String.format("%s %s %s %s\n",
                    nombre, cedula, marca, placa);
            String letra = placa.substring(0, 1);

            CrearArchivo.registrarArhivoPlacas1(cadenaFinal, letra);
            // CrearArchivo.registrarArhivoPlacas2(cadenaFinal, letra);

            System.out.println("Escriba 'C' para continuar creando archivos");
            System.out.println("Escriba 'N' para salir");
            String salida = entrada.nextLine();
            salida = salida.toUpperCase();

            if (salida.equals("N")) {
                bandera = false;
            }
        }
    }
}
