import java.util.LinkedList;

public class Task_3 {

    public static LinkedList<String> fruitList = new LinkedList<>();

    public static void main(String[] args) {
        addFruit();
        System.out.println("Initial list:");
        printList(fruitList);
        System.out.println("Edited list:");
        addFirst();
        addLast();
        printList(fruitList);
    }

    public static void addFruit() {
        fruitList.add("orange");
        fruitList.add("grape");
        fruitList.add("apple");
        fruitList.add("orange");
        fruitList.add("lemon");
    }
    public static void addFirst(){
        fruitList.addFirst("plum");

    }
    public static void addLast(){
        fruitList.addLast("mango");

    }
    public static void printList(LinkedList<String> list){
        int count = 1;
        for (String fruit: list){
            System.out.println(count + ") " + fruit);
            count++;
        }
    }

}
