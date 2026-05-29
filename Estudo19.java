import java.util.ArrayList;
import java.util.List;

public class Estudo19 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Gustavo");
        list.add("Lorena");
        list.add("Julia");
        list.add("Caio");
        list.add("Lucas");

        System.out.println("------------------------");

        list.remove("Lucas");

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("------------------------");

        String busca = "Gustavo";

        if (list.contains(busca)) {
            System.out.println(busca);
        }
        System.out.println("------------------------");

        for (String x : list) {
            if (x.length() >= 5) {
                System.out.println(x);
            }
        }
    }
}
