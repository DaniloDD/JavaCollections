package sel.bootcamp.part1_DifficultSection;

public class B_DoublyLinkedList {

	private ListNode head;
	private ListNode tail;
	private int length; // number of nodes

	public B_DoublyLinkedList() { // when we initialize an empty list
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	// verify if the list is empty or not
	public boolean isEmpty() {
		return length == 0; // head == null
	}

	public int length() {
		return length;
	}

	// insert a node at the end of the list
	public void insert(int data) {
		// create a node
		ListNode newNode = new ListNode(data);

		// if the list is empty
		if (head == null) {
			head = tail = newNode;
			// set both head and tail to the new node
			head.prev = null;
			tail.next = null;
		} else {
			// attach the new node to the end of the list
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next = null;
		}
	}

	// delete a node from the list
	public void delete(ListNode del) {
		// if the node to be deleted is null
		if (head == null && del == null) {
			return;
		}
		// if the node to be deleted is the head node
		else if (head == del) {
			head = del.next;
		}
		// change next only if the node to be deleted is not the tail
		else if (del.next != null) {
			del.prev.next = del.next;
		}
		// change prev only if the node to be deleted is not the first node
		else if (del.prev != null) {
			del.prev.next = del.next;
		} 
		else { // node to be deleted is the tail
			tail = del.prev;
		}
	}
	
	// dispaly the list nodes
	public void display() {
		// create a new node and initialize it with the head
		ListNode current = head;
		if (head == null) {
			System.out.println("The list is empty");
			return;
		}
		System.out.println("The nodes of the list are:");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}
	
	public static void main (String [] args) {
		B_DoublyLinkedList dll = new B_DoublyLinkedList();
		// insert nodes
		dll.insert(10);
		dll.insert(20);
		dll.insert(30);
		dll.insert(40);
		
		// display the list
		dll.display();
		
		// delete a node
		dll.delete(dll.head.next.next.next);
		
		System.out.println();
		dll.display();
	}

	private class ListNode {
		private int data;
		private ListNode prev;
		private ListNode next;

		private ListNode(int data) {
			this.data = data;
			prev = null;
			next = null;
		}

	}

}
