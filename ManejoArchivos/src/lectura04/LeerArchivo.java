/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura04;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jdavi
 */
public class LeerArchivo {

    public static void obtenerPromedio() {
        try {
            Scanner lector = new Scanner(new File("data/datosDos.txt"));
            double suma = 0;
            int contadorNotas = 0;
            double promedio;
            while (lector.hasNext()) {
                String registro = lector.nextLine();
                List<String> datos = Arrays.asList(registro.split("\\|"));
                List<String> datosRegistro = new ArrayList<>(datos);
                contadorNotas = contadorNotas + 1;
                suma = suma + Double.parseDouble(datosRegistro.get(3));
            }
            promedio = suma / contadorNotas;
            System.out.printf("El promedio de calificaciones es: %.2f\n", promedio);
            lector.close();
        } catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        }
    }
}
