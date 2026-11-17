import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class InterfaceMap{
    public static void main(String[] args){
        Map<Integer, String> mapNames = new HashMap<Integer, String>();

        mapNames.put(1, "UNIVESP");
        mapNames.put(2, "USP");
        mapNames.put(3, "UFMG");
        mapNames.put(4, "UFRJ");

        Set set = mapNames.entrySet();
        Iterator iterator = set.iterator();

        while(iterator.hasNext()){
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("A chave é: " + mentry.getKey() + " e o Valor é: ");
            System.out.println(mentry.getValue());
        }
    }
}