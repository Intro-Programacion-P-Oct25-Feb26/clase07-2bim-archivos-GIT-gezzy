/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura04;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author jdavi
 */
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<ArrayList<String>> datos = new ArrayList<>();
        boolean bandera = true;
        while (bandera) {

            ArrayList<String> usuario = new ArrayList<>();

            System.out.println("Ingrese su nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su cedula");
            String cedula = entrada.nextLine();
            System.out.println("Ingrese su email/correo electronico");
            String correo = entrada.nextLine();
            usuario.add(nombre);
            usuario.add(cedula);
            usuario.add(correo);
            datos.add(usuario);

            System.out.println("Escriba 'C' para continuar creando archivos");
            System.out.println("Escriba 'N' para salir");
            String salida = entrada.nextLine();
            salida = salida.toUpperCase();

            if (salida.equals("N")) {
                bandera = false;
            }
        }
        CrearArchivoDatos.registrarArhivoCedulas(datos);
    }
}
