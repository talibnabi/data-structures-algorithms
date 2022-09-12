package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Ramiz");
        hashMap.put(4, "Turan");
        hashMap.put(1, "Anara");
//        System.out.println(hashMap.size());
//        System.out.println(hashMap);
//        for (int i = 0; i < hashMap.size(); i++) {
//            System.out.println(hashMap.get(i));
//        }
        Set<Map.Entry<Integer, String>> set = hashMap.entrySet();
        set.forEach(System.out::println);
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("key=" + entry.getKey() + ". value=" + entry.getValue());
        }
        hashMap.put(1, "Salim");
        hashMap.remove(1);
        System.out.println(hashMap);
    }
}
