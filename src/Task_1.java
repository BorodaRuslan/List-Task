import java.util.ArrayList;
import java.util.List;

public class Task_1 {
   public static List<String> nameList = new ArrayList<>();

    public static void main(String[] args) {
        addNameList();
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
    public static void addNameList(){
        nameList.add("John");
        nameList.add("Alice");
        nameList.add("Robert");
        nameList.add("Lisa");
        nameList.add("David");
        nameList.add("Amanda");
    }
}
