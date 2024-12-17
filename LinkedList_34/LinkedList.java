package LinkedList_34;

public class LinkedList{
    private ListNode head;
    public LinkedList() {
        this.head = null;
    }
    public void add(int value) {
        ListNode newNode = new ListNode(value, this.head);
        this.head = newNode;
    }

    public int size(){
        ListNode current = this.head;
        int count = 0;
        for (int i = 0; i<Integer.MAX_VALUE;i++){
            if (current== null) return count;
            count++;
            current = current.getNext();
        }
        return count;
    }

    public int sumIterative(){
        ListNode current = this.head;
        int sum = 0;
        while(current != null){
            sum += current.getEntry();
            current = current.getNext();
        }
        return sum;
    }

    public int sum(){
        return sum(this.head);
    }

    private int sum(ListNode node){
        if(node == null) return 0;
        return sum(node.getNext())+ node.getEntry();
    }

    public void printReverseList(){
        printReservereList(this.head);
    }

    private void printReservereList(ListNode node){
        if (node == null) return;
        System.out.println(node.getEntry());
        printReservereList(node.getNext());
    }


}