import java.io.*;
import java.util.Scanner;
public class LeerArchivo
{
    public static MarcoDeDatos leer() throws 
    FileNotFoundException {
        Scanner consola = new Scanner(System.in);
        MarcoDeDatos coleccion = new MarcoDeDatos();
        String comando = "Si";
        while(comando.equalsIgnoreCase("Si")){
            System.out.println("Ingrese el nombre del archivo a buscar");
            String buscar = consola.nextLine();
            
            Scanner input = new Scanner(new File(buscar));
            String text = input.nextLine();
            while(input.hasNextLine()){
                text = input.nextLine();
                text = text.replace("\"","");
                String x[] = text.split(",");
                System.out.println("");
                String nombre = x[0];
                int semestre = Integer.parseInt(x[3]);
                String nombreMateria = x[10];
                int notaDefinitiva = Integer.parseInt(x[13]);
                Dato nuevoDato = new Dato (nombre, semestre, nombreMateria, notaDefinitiva);
                coleccion.anadir(nuevoDato);
            }
            System.out.println("Desea leer otro archivo? Ingrese Si o No ");
            comando = consola.nextLine();
        }
        return coleccion;
    }
}


