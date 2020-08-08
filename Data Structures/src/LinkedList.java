
public class LinkedList<T> {
	
	private class linkedListNode<T> {
        T data;
        linkedListNode<T> next;

        public linkedListNode(T nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
	
	linkedListNode<T> head = null;
	linkedListNode<T> tail = null;
	int size = 0;
	
	public int size() {
		return size;
	}
	
	public void printLinkedList() {
		if(head == null) {System.out.println("LinkedList is empty!!");}
		linkedListNode<T> temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public void insertAtHead(T val) {
		linkedListNode<T> newNode = new linkedListNode<T>(val);
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
		size++;
		
	}
	
	public void insertAtEnd(T val) {
		linkedListNode<T> newNode = new linkedListNode<T>(val);
		if(head == null) {
			head = newNode;
		}
		else {
			linkedListNode<T> temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		size++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Linkedlist");
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.insertAtHead(5);
		linkedList.insertAtHead(6);
		linkedList.insertAtHead(59);
		linkedList.insertAtHead(12);
		linkedList.insertAtEnd(20);
		linkedList.printLinkedList();
		System.out.println("Size is " + linkedList.size());
	}

}
