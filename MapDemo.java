import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
    public static void main() {
        Map<Integer, Integer> hp = new LinkedHashMap<>();
        hp.put(101, 78);
        hp.put(102, 80);
        hp.put(103, 75);
        hp.put(104, 63);
        hp.put(105, 48);
        for (Map.Entry<Integer, Integer> i : hp.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
        hp.remove(103);
        if (hp.containsKey(101)) {
            System.out.println("Marks of Roll No is" + " " + hp.get(101));
        } else {
            System.out.println("Student not found");
        }
        hp.put(101, 20);
        for (Map.Entry<Integer, Integer> i : hp.entrySet()) {
            System.out.println("MArks of Roll No" + " " + i.getKey() + " is" + i.getValue());
        }

    }

}
