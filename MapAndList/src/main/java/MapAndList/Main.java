package MapAndList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    private static String a = "A";
    private static String b = "B";
    private static String c = "C";

    public static  void main(String[] args) {
        ArrayList <String> list = new ArrayList<String>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        list.add(b);
        list.add(a);
        list.add(c);
        System.out.println("Исходный вариант");
        for(String unitList:list){
            System.out.println(unitList);
        }
        Collections.sort(list);
        System.out.println("После сортировки");
        for(String unitList:list){
            System.out.println(unitList);
        }
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("После обратной сортировки");
        for(String unitList:list){
            System.out.println(unitList);
        }
        Point pp = new Point();
        Map<Integer,Integer> treeMap = new TreeMap<Integer,Integer>(pp.map);
        System.out.println("После сортировки");
        for(Map.Entry<Integer,Integer> entry: treeMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        Map<Integer,Integer> treeMap1 = new TreeMap<Integer,Integer>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2.compareTo(o1);
                    }
                });
        treeMap1.putAll(pp.map);
        System.out.println("После обратной сортировки");
        for(Map.Entry<Integer,Integer> entry: treeMap1.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
