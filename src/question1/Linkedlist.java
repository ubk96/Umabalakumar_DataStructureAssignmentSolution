package question1;

public class Linkedlist {
	
	Node head; 
	   
    static class Node {
   
        int data;
        Node next;
   
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
   
    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public Linkedlist insert( Linkedlist list, int data)
    {
        Node new_node = new Node(data);
   
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    
    void deleteList()
    {
        head = null;
    }

}
