

public class Solicitud
{
    private String nombreTienda;
    private int cantidadDeNeveras;
    
    public Solicitud (String nombreTienda, int cantidadDeNeveras){
        this.nombreTienda=nombreTienda;
        this.cantidadDeNeveras=cantidadDeNeveras;
    }   
    public String getnombreTienda(){
        return this.nombreTienda;
    }
    public void setnombreTienda(String newNombreTienda){
        this.nombreTienda=newNombreTienda;
    }
    public int getcantidadDeNeveras(){
        return this.cantidadDeNeveras;
    }
    public void setcantidadDeNeveras(int newCantidad){
        this.cantidadDeNeveras = newCantidad;
    }
}
