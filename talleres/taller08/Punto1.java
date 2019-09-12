import java.util.*;
public class Punto1 
{
    public static int cal(String x)
    {
        Stack<Integer> nums=new Stack<>();
        Stack<String> sig=new Stack<>();
        String[] arr=x.split(" ");
        for(String t:arr)
        {
            if(t.equals("+")) sig.push(t);
            if(t.equals("-"))sig.push(t);
            if(t.equals("*"))sig.push(t);
            if(t.equals("/")) sig.push(t);
            else
            {
                try{nums.push(Integer.parseInt(t));}
                catch(Exception e){}
            }
        }
        return calAux(nums,sig);
    }
    private static int calAux(Stack<Integer> x,Stack<String> y)
    {
        if(y.isEmpty()&&x.isEmpty()) return 0;
        if(y.isEmpty()&&!x.isEmpty()) return x.pop();
        if(!y.isEmpty()&&x.isEmpty()) return 0;
        else
        {
            String s=y.pop();
            if(s.equals("+")) return x.pop()+calAux(x,y);
            else if(s.equals("-")) return x.pop()-calAux(x,y);
            else if(s.equals("*")) return x.pop()*calAux(x,y);
            else return x.pop()/calAux(x,y);
        }
    }
}

