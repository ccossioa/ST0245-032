

public class nevera
{
    private int codigo;
    private String descripcion;
    
    public nevera (int codigo, String descripcion){
        this.codigo=codigo;
        this.descripcion=descripcion;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public void setCodigo(int newCodigo){
        this.codigo=newCodigo;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public void setDescripcion(String newDescripcion){
        this.descripcion = newDescripcion;
    }
}    