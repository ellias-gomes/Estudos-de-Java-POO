import java.util.Set;
import java.util.HashSet;

public class Conjuntos{
    static void main(String[] args){
        Set<String> cargos = new HashSet<>();
            cargos.add("Gerente");
            cargos.add("Diretor");
            cargos.add("Presidente");
            cargos.add("Secretária");
            cargos.add("Funcionário");
            cargos.add("Diretor");

        System.out.println(cargos);
    }
}