
import java.util.*;
public class Dato
{
    private String nombre;
    private int semestre;
    private String nombreMateria;
    private int notaDefinitiva;
    public Dato(String nombre, int semestre, String nombreMateria, int notaDefinitiva){
        this.nombre = nombre;
        this.semestre = semestre;
        this.nombreMateria = nombreMateria;
        this.notaDefinitiva = notaDefinitiva;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }
        public int getSemestre(){
        return semestre;
    }
    public void setSemestre(int newSemestre){
        this.semestre = newSemestre;
    }    
    public String getNombreMateria(){
        return nombreMateria;
    }
    public void setNombreMateria(String newNombreMateria){
        this.nombreMateria = newNombreMateria;
    }
    public int getNotaDefinitiva(){
        return notaDefinitiva;
    }
    public void setNotaDefinitiva(int newNotaDefinitiva){
        this.notaDefinitiva = newNotaDefinitiva;
    }
}
