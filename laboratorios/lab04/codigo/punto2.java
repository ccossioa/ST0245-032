
import java.util.ArrayList;
public class punto2
{
    public void insertar (Nodo nodo, int dato){
        if (dato < nodo.dato && nodo.izquierdo == null){
            nodo.izquierdo = new Nodo (dato);
        }
        else if(dato < nodo.dato){
            insertar(nodo.izquierdo, dato);
        }
        else if (dato > nodo.dato && nodo.derecho == null){
            nodo.derecho = new Nodo (dato);
        }
        else if(dato > nodo.dato){
            insertar (nodo.derecho, dato);
        }
    }
    public Nodo root;
    public void construirArbol (int[] preOrden){
        root = new Nodo (preOrden[0]);
        for (int i = 0; i < preOrden.length; i++){
            insertar(root, preOrden[i]);
        }
    }
    public void preOrden (Nodo nodo){
        if (nodo != null){
           System.out.println(nodo.dato);
           preOrden(nodo.izquierdo);
           preOrden(nodo.derecho);
        }
    }
    public void postOrden(Nodo nodo){
        if (nodo != null){
            System.out.println(nodo.dato);
            postOrden(nodo.izquierdo);
            postOrden(nodo.derecho);
        }
    }
    public void solucion (int [] entrada){
        construirArbol(entrada);
        postOrden (root);
    }
    
}
