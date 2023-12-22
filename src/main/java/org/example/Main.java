package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> mulList = new ArrayList<>();
        mulList.add(List.of(1, 2, 3));
        mulList.add(List.of(4, 5, 6, 7));
        mulList.add(new ArrayList<>());

        findMaxPro(mulList);
    }

    public static void findMaxPro(List<List<Integer>> mulList) {
        int max = mulList.get(0).get(0);
        int maxI = 0;
        int maxJ = 0;

        for (int i = 0; i < mulList.size(); i++) {
            for (int j = 0; j < mulList.get(i).size(); j++) {
                if (max < mulList.get(i).get(j)) {
                    max = mulList.get(i).get(j);
                    maxI = i;
                    maxJ = j;
                }
            }
        }

        System.out.println("Максимальне число є " + max + " та знаходиться на координатах I=" + maxI + ", J=" + maxJ);
    }
}
