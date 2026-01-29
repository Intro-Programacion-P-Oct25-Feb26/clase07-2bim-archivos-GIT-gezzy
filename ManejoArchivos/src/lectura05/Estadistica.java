/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura05;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jdavi
 */
public class Estadistica {

    public static void obtenerPromedio() {
        try {
            Scanner lector = new Scanner(new File("data/sucursales.txt"));
            double suma = 0;
            int contadorEmpleados = 0;
            double promedio;
            lector.nextLine();
            while (lector.hasNext()) {
                String registro = lector.nextLine();
                List<String> datos = Arrays.asList(registro.split("\\|"));
                List<String> datosRegistro = new ArrayList<>(datos);
                suma = suma + Double.parseDouble(datosRegistro.get(2));
                contadorEmpleados = contadorEmpleados + 1;
            }
            promedio = suma / contadorEmpleados;
            System.out.printf("El promedio de empleados por empresa "
                    + "es de: %.2f empleados\n", promedio);
            lector.close();
        } catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        }
    }
        public static void obtenerPromedioException() {
        try {
            Scanner lector = new Scanner(new File("data/sucursales.txt"));
            double suma = 0;
            int contadorEmpleados = 0;
            double promedio;
            lector.nextLine();
            while (lector.hasNext()) {
                String registro = lector.nextLine();
                List<String> datos = Arrays.asList(registro.split("\\|"));
                List<String> datosRegistro = new ArrayList<>(datos);
                if (datosRegistro.get(2).equals("empleados")) {
                    throw new Exception("Error de Conversion");
                }
                suma = suma + Double.parseDouble(datosRegistro.get(2));
                contadorEmpleados = contadorEmpleados + 1;
            }
            promedio = suma / contadorEmpleados;
            System.out.printf("El promedio de empleados por empresa "
                    + "es de: %.2f empleados\n", promedio);
            lector.close();
        } catch (NumberFormatException e) {
            System.out.printf("(NumberFormatException) Ocurrió una "
                    + "excepción %s\n", e);
        } catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        }
    }
}
