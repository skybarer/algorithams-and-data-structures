package array.linked_list;

public class Test {

    public static void main(String[] arr) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(3);
        linkedList.display();
        System.out.println("\n"+linkedList.size());
    }
}
