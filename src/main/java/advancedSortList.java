import java.util.*;

public class advancedSortList {
    public static List<List<String>> sortList(List<String> list){
        //New List for each result

        //Use a HashMap to make a list of new list for each value, LinkedHashMap keeps the order of insertion
        Map<String, List<String>> values = new LinkedHashMap<>();

        //Iterate through the arraylist
        for (String value : list) {
            //If the String is not in the hashset key already establishing it before adding it
            if (!values.containsKey(value)) {
                values.put(value, new ArrayList<>());
            }
            values.get(value).add(value);
        }

        // Convert the map values into a list of lists
        return new ArrayList<>(values.values());

        //List<List<String>> result = new ArrayList<>(values.values());

    }

    public static void main(String[] args) {

        System.out.println(sortList(List.of(new String[]{"a", "b", "c", "a"})));

    }
}
