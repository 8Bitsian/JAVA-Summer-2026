import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // =========================
        // 1. LIST
        // =========================
        ArrayList<String> list3 = new ArrayList<>();
        LinkedList<String> list4 = new LinkedList<>();
        // Different types (recommended)
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();


        // =========================
        // 2. SET
        // =========================
        HashSet<String> set4 = new HashSet<>();
        TreeSet<String> set5 = new TreeSet<>();
        LinkedHashSet<String> set6 = new LinkedHashSet<>();
        // Different types (recommended)
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new TreeSet<>();
        Set<String> set3 = new LinkedHashSet<>();


        // =========================
        // 3. MAP
        // =========================
        HashMap<String, Integer> map4 = new HashMap<>();
        TreeMap<String, Integer> map5 = new TreeMap<>();
        LinkedHashMap<String, Integer> map6 = new LinkedHashMap<>();
        // Different types (recommended)
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new TreeMap<>();
        Map<String, Integer> map3 = new LinkedHashMap<>();


        // =========================
        // SIMPLE USAGE
        // =========================
        list1.add("A");
        set1.add("A");
        map1.put("A", 1);

        System.out.println(list1);
        System.out.println(set1);
        System.out.println(map1);
    }
}

