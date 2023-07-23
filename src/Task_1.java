import java.util.ArrayList;
import java.util.List;

public class Task_1 {
   public static List<String> nameList = new ArrayList<>();

    public static void main(String[] args) {
        addNameList("John");
        addNameList("Alice");
        addNameList("Robert");
        addNameList("Lisa");
        addNameList("David");
        addNameList("Amanda");

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
    public static void addNameList(String name){
        nameList.add(name);
    }
}
