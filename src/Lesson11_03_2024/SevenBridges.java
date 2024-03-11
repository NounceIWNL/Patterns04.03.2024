package Lesson11_03_2024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Konigsberg bridges

public class SevenBridges {

    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("0", new ArrayList<>());
        graph.get("0").add("1");
        graph.get("0").add("1");
        graph.get("0").add("2");
        graph.get("0").add("3");
        graph.get("0").add("3");

        graph.put("1", new ArrayList<>());
        graph.get("1").add("2");

        graph.put("2", new ArrayList<>());
        graph.get("2").add("3");


        boolean hasEulerianPath = hasEulerianPath(graph);
        System.out.println("Has Eulerian Path: " + hasEulerianPath);
    }

    public static boolean hasEulerianPath(Map<String, List<String>> graph) {
        int oddDegreeCount = 0;
        for (List<String> neighbors : graph.values()) {
            if (neighbors.size() % 2 != 0) {
                oddDegreeCount++;
            }
        }
        return oddDegreeCount == 0 || oddDegreeCount == 2;
    }
}
