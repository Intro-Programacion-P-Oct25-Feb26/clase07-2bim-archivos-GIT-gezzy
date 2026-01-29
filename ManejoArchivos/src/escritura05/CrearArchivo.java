/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Formatter;

/**
 *
 * @author jdavi
 */
public class CrearArchivo {

    public static void registrarArhivoPlacas1(String dato, String placa) {
        try {
            if (!placa.equals("L") && !placa.equals("G") && !placa.equals("P")) {
                placa = "Varios";
            }
            String ruta = String.format("data/%s.txt", placa);
            FileOutputStream fos = new FileOutputStream(ruta, true); // true = append
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Formatter salida = new Formatter(osw);

            salida.format("%s", dato);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        }
    }

    public static void registrarArhivoPlacas2(String dato, String placa) {
        try {
            if (placa.equals("L")) {
                String ruta = String.format("data/%s.txt", placa);
                FileOutputStream fos = new FileOutputStream(ruta, true); // true = append
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                Formatter salida = new Formatter(osw);

                salida.format("%s", dato);
                salida.close();
            } else if (placa.equals("G")) {
                String ruta = String.format("data/%s.txt", placa);
                FileOutputStream fos = new FileOutputStream(ruta, true); // true = append
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                Formatter salida = new Formatter(osw);

                salida.format("%s", dato);
                salida.close();
            } else if (placa.equals("P")) {
                String ruta = String.format("data/%s.txt", placa);
                FileOutputStream fos = new FileOutputStream(ruta, true); // true = append
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                Formatter salida = new Formatter(osw);

                salida.format("%s", dato);
                salida.close();
            } else {
                placa = "Varios";
                String ruta = String.format("data/%s.txt", placa);
                FileOutputStream fos = new FileOutputStream(ruta, true); // true = append
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                Formatter salida = new Formatter(osw);

                salida.format("%s", dato);
                salida.close();
            }

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        }
    }
}
