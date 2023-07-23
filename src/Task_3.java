import java.util.LinkedList;

public class Task_3 {

    public static LinkedList<String> fruitList = new LinkedList<>();

    public static void main(String[] args) {
        addFruit("orange");
        addFruit("grape");
        addFruit("apple");
        addFruit("orange");
        addFruit("lemon");
        System.out.println("Initial list:");
        printList(fruitList);
        System.out.println("Edited list:");
        addFirst("plum");
        addFruit("mango");
        printList(fruitList);
    }

    public static void addFruit(String fruit) {
        fruitList.add(fruit);
    }
    public static void addFirst(String fruit){
        fruitList.addFirst(fruit);

    }
    public static void addLast(String fruit){
        fruitList.addLast(fruit);

    }
    public static void printList(LinkedList<String> list){
        int count = 1;
        for (String fruit: list){
            System.out.println(count + ") " + fruit);
            count++;
        }
    }

}
