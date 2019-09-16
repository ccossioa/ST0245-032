
import java.util.*;
public class Punto2
{
    public static void textCompilator(String mess){
        LinkedList list = new LinkedList();
        String aux = "";
        for(int i = 0; i < mess.length()-1; i++){ 
            if ((mess.charAt(i)=='[')||(mess.charAt(i)==']')){
                int j = i + 1;
                int k = 0;
                while((j<mess.length())&&!(mess.charAt(j) == '[' || mess.charAt(j) == ']')){
                    aux = aux + mess.charAt(j);
                    j++;
                    k++;
                }
                if(mess.charAt(i) == '[') list.addFirst(aux);
                if(mess.charAt(i) == ']') list.addLast(aux);
                aux = "";
                i = i + k;
            }
            else {
                list.addLast(mess.charAt(i));
            }            
        }
        for(int i = 0; i < list.size(); i++) System.out.print(list.get(i));
    }
    public static void prueba(){
        textCompilator("[[a[[d[f[[g[g[h[h[dgd[fgsfa[f");
    }  
    
   
