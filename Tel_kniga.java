import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Tel_kniga {
    public static void newNumber(String key, int value,
            Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void printBook(Map<String, ArrayList<Integer>> map) {
        for (var item : map.entrySet()) {
            String phones = "";
            for (int el : item.getValue()) {
                phones = phones + el + ",";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        newNumber("Sheinkman", 07470133242, bookPhone);
        newNumber("Sheinkman", 698231839, bookPhone);
        newNumber("Trukshin", 371220125, bookPhone);
        newNumber("Abolevich", 371295304, bookPhone);
        newNumber("Trukshin", 371224243, bookPhone);
        printBook(bookPhone);
    }
}