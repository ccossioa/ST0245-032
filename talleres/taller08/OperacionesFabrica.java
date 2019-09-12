
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class OperacionesFabrica
{
    
    public void fabrica(Stack <nevera> neveras, Queue <Solicitud> solicitudes){
        while(!solicitudes.isEmpty()){
            Solicitud x = solicitudes.remove();
            System.out.println(x.getnombreTienda());
            for (int i = 0; i<=x.getcantidadDeNeveras(); i++){
                nevera y = neveras.pop();
                System.out.println("Codigo: " + y.getCodigo());
                System.out.println("Descripcion: " + y.getDescripcion());
            }
            System.out.println();
        }
    }
}
