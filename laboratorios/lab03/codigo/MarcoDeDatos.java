import java.io.*;
import java.util.ArrayList;
import java.util.*;
public class MarcoDeDatos
{
    ArrayList<Dato> coleccionDatos=new ArrayList<Dato>();
    public void imprimir(){
        System.out.println("¿Que tipo de consulta desea realizar?");
        System.out.println("Ingrese 1 para Consulta 1");
        System.out.println("Ingrese 2 para Consulta 2");
    }
    public void finalizado(){
        //Imprime una salida al usuario
        System.out.println();
        System.out.println("Hemos terminado, si quiere hacer otro tipo de consulta, ingrese:");
        System.out.println("1 para Consulta 1");
        System.out.println("2 para Consulta 2");
    }
    public void anadir(Dato nuevoDato){
        coleccionDatos.add(nuevoDato);
    }
    public void consulta1(){
        System.out.println("Ingrese el nombre de la materia");
        System.out.println("Ingrese el semestre");
        Scanner consola = new Scanner (System.in);
        String referencia1 = consola.nextLine();
        int referencia2 = consola.nextInt();
        for (int i = 0; i<coleccionDatos.size(); i++){
            if (((coleccionDatos.get(i).getNombreMateria()).equalsIgnoreCase(referencia1))&&((coleccionDatos.get(i).getSemestre())==(referencia2))){
                System.out.println("Nombre del estudiante: " + coleccionDatos.get(i).getNombre());
                System.out.println("Nota definitiva: " + coleccionDatos.get(i).getNotaDefinitiva());
                System.out.println();
            }
        }
    }
    public void consulta2(){
        System.out.println("Ingrese el nombre del estudiante");
        System.out.println("Ingrese el semestre");
        Scanner consola = new Scanner (System.in);
        String referencia1 = consola.nextLine();
        int referencia2 = consola.nextInt();
        for (int i = 0; i<coleccionDatos.size(); i++){
            if (((coleccionDatos.get(i).getNombreMateria()).equalsIgnoreCase(referencia1))&&((coleccionDatos.get(i).getSemestre())==(referencia2))){
                System.out.println("Nombre de la materia: " + coleccionDatos.get(i).getNombreMateria());
                System.out.println("Nota definitiva: " + coleccionDatos.get(i).getNotaDefinitiva());
                System.out.println();
            }
        }
    }
}
