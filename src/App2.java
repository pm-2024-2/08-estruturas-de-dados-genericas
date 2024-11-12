import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class App2 {
    public static void main(String[] args) {
        List sobrenome = List.of("Almeida", "Bastilhos", "Raubach");

        // ArrayList => Lista baseada em Arrays
        // <> Parâmetro de Tipo => diamond operator
        List<String> nomes = new ArrayList<>();
        nomes.add("Vitor");   // 0
        nomes.add("André");   // 1
        nomes.add("Adriana"); // 2
        // nomes.add(123);
        // nomes.add(9.3);
        // nomes.add(true);
        System.out.println(nomes);
        System.out.println(nomes.size()); // 3
        System.out.println(nomes.get(1)); // André
    }
}
