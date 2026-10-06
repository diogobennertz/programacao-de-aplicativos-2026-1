import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ExemploArrayList {
    public static void main(String[] args) {
        List<Integer> idades = new ArrayList<>();
        idades.add(22);
        idades.add(13);
        idades.add(22);
        idades.add(13);
        idades.add(22);
        idades.add(13);


        Collections.sort(idades);
        System.out.println(idades);
    }
}