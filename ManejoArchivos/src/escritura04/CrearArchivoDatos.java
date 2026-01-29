/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura04;

import java.util.ArrayList;
import java.util.Formatter;

/**
 *
 * @author jdavi
 */
public class CrearArchivoDatos {

    public static void registrarArhivoCedulas(ArrayList<ArrayList<String>> archivo) {
        try {
            for (int i = 0; i < archivo.size(); i++) {
                String ruta = String.format("data/%s.txt", archivo.get(i).get(1));
                Formatter salida = new Formatter(ruta);
                salida.format("%s", archivo.get(i));
                salida.close();
            }
        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);

        }
    }
}
