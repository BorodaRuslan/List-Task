import java.util.ArrayList;
import java.util.List;

public class Task_2 {
    public static List<String> fruitList = new ArrayList<>();

    public static void main(String[] args) {
        addFruit("orange");
        addFruit("mango");
        addFruit("banana");
        addFruit("apple");
        addFruit("kiwi");
        addFruit("kiwi");
        addFruit("cherry");

        System.out.println("Initial list:");
        printFruitList(fruitList);
        System.out.println("List part:");
        printFruitList(subList(fruitList, 1, 2));

    }
    public static void addFruit(String fruit){
        fruitList.add(fruit);
    }
    public static void printFruitList(List<String> fruitList){
        int count = 1;
        for (String fruit: fruitList){
            System.out.println(count + ") " + fruit);
            count++;
        }
    }
    public static List<String> subList(List<String> fruitList, int start, int finish){
        int endIndex = Math.min((start + finish), fruitList.size());
        return new ArrayList<>(fruitList.subList(start, endIndex));
    }

}
