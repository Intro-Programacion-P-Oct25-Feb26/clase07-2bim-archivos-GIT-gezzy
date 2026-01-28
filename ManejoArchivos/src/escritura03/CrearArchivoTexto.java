package escritura03;

// Uso de la clase Formatter para escribir datos en un archivo de texto.
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Formatter;

public class CrearArchivoTexto {

    // agrega registros al archivo
    public static void agregarRegistros(String valor) {
        try {
            FileOutputStream fos = new FileOutputStream("data/salidaDatosPersonales002.txt", true); // true = append
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Formatter salida = new Formatter(osw);
            
            salida.format("%s", valor);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);

        }

    } // fin método agregarRegistros
    
} // fin de la clase CrearArchivoTexto

/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 
 *************************************************************************/
