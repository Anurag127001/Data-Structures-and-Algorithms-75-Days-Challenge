package anurag;


public class SinglyLinkedList {

	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
		
		
	}
	
	private static ListNode head;
	

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		
		display(head);
		
		System.out.println("The length of the Linked List is: "+count(head));
		
		insertFirst(35);
		
		display(head);
		
		insertLast(56);
		
		display(head);
		
		insert(72, 5);
		
		display(head);

		sll.deleteFirst();
		
		display(head);

		sll.deleteLast();
		
		display(head);
		
		sll.delete(4);
		
		display(head);
		
		System.out.println("Position of the value is: "+ sll.searchpos(8));
		System.out.println("Position of the value is: "+ sll.searchpos(9));
		

		System.out.println("Given value is present in SLL: "+ sll.search(8));
		System.out.println("Given value is present in SLL: "+ sll.search(9));
		
//		display(sll.reverse());

		
		System.out.println("The SLL is: ");
		display(head);
		System.out.println("Middle value of SLL is : " + sll.findmid() );
		
		System.out.println("Nth value of SLL from end is : " + sll.findn(3) );

		
		
		SinglyLinkedList sortedSll = new SinglyLinkedList();
		sortedSll.head = new ListNode(1);
		ListNode sec = new ListNode(1);
		ListNode thi = new ListNode(10);
		ListNode fou = new ListNode(12);
		ListNode fif = new ListNode(15);

		sortedSll.head.next = sec;
		sec.next = thi;
		thi.next = fou;
		fou.next = fif;
		
		System.out.println("This is Sorted Linked List: ");
		sortedSll.display(head);
		
		sortedSll.removedupli();
		System.out.println("This is Sorted Linked List after removing duplicates: ");
		sortedSll.display(head);

		System.out.println("Insert 11 in Sorted List");
		sortedSll.insertInSorted(11);
		sortedSll.display(head);

		
		
	}

	

//	Print SLL
	public static void display(ListNode head) {
	ListNode crr = head;
	while(crr!= null)
		{
			System.out.print(crr.data + " --> ");
			crr= crr.next;
		}System.out.println("null");
	}
	
	
//	Find length of SLL
	public static int count(ListNode head) {
		int count = 0;
		ListNode crr = head;
		while(crr != null) 
			{
				count++;
				crr= crr.next;
			}
		return count;
	}
		
	
//	Insert node at beginning
public static void insertFirst(int value) {
		
		ListNode newNode = new ListNode(value);
		if(head == null) {
			head = newNode;
		}
		newNode.next = head;
		head = newNode;
	}
	

//	Insert at the end
public  static void insertLast(int value) {
	
	ListNode newNode = new ListNode(value);
	if(head == null) {
		head = newNode;
	}
	ListNode curr = head;
	while(curr.next!=null) {
		curr = curr.next;
	}
	curr.next = newNode;
	newNode.next = null;
}


// Insert at given position
public static void insert(int value, int pos) {
	ListNode node = new ListNode(value);
	if(pos==1) {
		node.next = head;
		head = node;
		
	}
	else {
		ListNode prev = head;
		int count = 1;
		while(count!=pos-1) {
			prev = prev.next;
			count++;
		}
		ListNode curr = prev.next;
		node.next = curr;
		prev.next = node;
	}
}
	

// Delete first node
public static ListNode deleteFirst() {
	if(head == null) return null;
	ListNode temp = head;
	head = head.next;
	temp.next = null;
	return temp;
}


//Delete Last node
public static ListNode deleteLast() {
	
	if(head.next == null) return null;
	ListNode crr= head;

	while(crr.next.next!=null) {
		crr = crr.next;
	}crr.next = null;
	return crr;
}


//Delete node of given position
public static ListNode delete(int pos) {
	
	ListNode curr = head;
	int count = 1;
	while(count!=pos-1) {
		curr = curr.next;
		count++;
	}
	ListNode temp = curr.next;
	curr.next = curr.next.next;
	temp.next = null;
	
	
	return temp;
}


//Search given value in SLL and return position of it
public static int searchpos(int value) {
	
	int count = 1;
	ListNode curr = head;
	while(curr.next!=null) {
		if(curr.data == value) {
			return count;
		}
		
		curr =curr.next;
		count++;
	}return -1;
	
	
}


//Search whether given value is present or not in SLL
public static boolean search(int value) {

	ListNode curr = head;
	while(curr.next!=null) {
		if(curr.data == value) {
			return true;
		}
		
		curr =curr.next;
		
	}return false;
	
	
}

//Reverse the SLL
public static ListNode reverse(){
	
	ListNode prev = null;
	ListNode curr = head;
	ListNode next = null;
	
	while(curr!= null) {
		next = curr.next;
		curr.next = prev;
		prev = curr;
		curr = next;
	}
	
	return prev;
}

//Find middle of the SLL
public static int findmid() {
	ListNode slowptr = head;
	ListNode fastptr = head;
	while(fastptr != null && fastptr.next!=null) {
		slowptr = slowptr.next;
		fastptr = fastptr.next.next;
	}return slowptr.data;
	
}

//Find nth node from last
public static int findn(int n) {
	
	ListNode mainptr = head;
	ListNode refptr = head;
	
	int count = 0;
	
	while(count<n) {
		refptr= refptr.next;
		count++;
	}
	while(refptr!=null) {
		refptr = refptr.next;
		mainptr = mainptr.next;
	}
	return mainptr.data;
}


//Remove duplicates from sorted LinkedList
public static void removedupli() {
	ListNode curr= head;
	while(curr.next!=null && curr!=null) {
		
		if(curr.data == curr.next.data) {
			curr.next = curr.next.next;
		}
		
		
		curr = curr.next;
	}
}


//Insert Node in Sorted List
public static ListNode insertInSorted(int val) {
	
	ListNode node = new ListNode(val);
	ListNode curr = head;
	ListNode temp = null;
	while(curr!=null && curr.data<val) {
		temp = curr;
		curr = curr.next;		
	}
	node.next = curr;
	temp.next = node;
	return head;
	
}






}


