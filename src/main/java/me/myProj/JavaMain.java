package me.myProj;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaMain {

    public static Map<Integer, Integer> countDigits(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer int_ : list) {
            map.put(int_, map.getOrDefault(int_, 0) + 1);
        }

        return map;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 5, 1, 5, 4, 1, 2, 4, 5, 3, 6);
        System.out.println(list + " -> " + countDigits(list));
    }
}