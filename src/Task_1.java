import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_1 {
   public static List<String> nameList = new ArrayList<>(Arrays.asList("John", "Alice", "Robert", "Lisa", "David", "Amanda"));

    public static void main(String[] args) {
        System.out.println("Initial list:");
        printList(nameList);
        System.out.println("Sorted list:");
        printList(sortedList(nameList));
    }
    public static List<String> sortedList(List<String> nameList){
       return nameList.stream().sorted().toList();

    }
    public static void printList(List<String> list){
        int count = 1;
        for (String str: list){
            System.out.println(count + ") " + str);
            count++;
        }
    }
}
