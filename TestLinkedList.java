class CustLinkedList {

	CustNode head;

	class CustNode {
		int data;
		CustNode next;

		CustNode(int data) {
			this.data = data;
			next = null;
		}

		public String toString() {
			return "[ data = " + data + " ]";
		}
	}

	void add(int data) {

		CustNode newNode = new CustNode(data);

		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;
	}

	void addAtLast(int data) {

		if (head == null) {
			head = new CustNode(data);
			return;
		}

		CustNode temp = head;
		while (temp != null) {
			if (temp.next == null) {
				temp.next = new CustNode(data);
				return;
			}
			temp = temp.next;
		}

	}

	public void delete() {

		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		if (head.next == null) {
			head = null;
		}

		CustNode extractNextNode = head.next;
		head = extractNextNode;
	}

	public void printAll() {

		if (head == null) {
			System.out.println("Linked List is empty.");
		} else {
			CustNode temp = head;
			System.out.print("[ ");
			while (temp != null) {

				// Using this condition for display output in organize way
				if (temp.next != null) {
					System.out.print(temp.data + ", ");
				} else {
					System.out.print(temp.data);
				}

				temp = temp.next;
			}
			System.out.print(" ]\n");

		} // else-block

	}// Print all

	public void addAtPos(int data, int pos) {
		CustNode newNode = new CustNode(data);

		if (head == null) {
			head = newNode;
		} else if (pos != 0) {
			CustNode currentNode = head;
			CustNode prevNode = null;
			int i = 0;

			while (currentNode != null && i < pos) {
				// System.out.println("Node : " + currentNode + ", index : " + i);
				prevNode = currentNode;
				currentNode = currentNode.next;

				i++;
			}
			if (prevNode != null) {
				prevNode.next = newNode;
				newNode.next = currentNode;
				return;
			}
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public int getSize() {

		if (head == null) {
			return 0;
		}

		CustNode temp = head;
		int count = 0;

		while (temp != null) {
			count++;
			temp = temp.next;
		}

		return count;
	}

	public boolean isAvailable(int data) {

		CustNode temp = head;

		while (temp != null) {

			if (temp.data == data) {
				return true;
			}

			temp = temp.next;
		}

		return false;
	}

	public void sortInsertASC(int data) {
		CustNode newNode = new CustNode(data);
		CustNode currentNode = head;

		if (currentNode == null || currentNode.data > data) {
			newNode.next = head;
			head = newNode;
		} else {

			while (currentNode.next != null && currentNode.next.data < data) {
				currentNode = currentNode.next;
			}

			newNode.next = currentNode.next;
			currentNode.next = newNode;
		}

	}

	public int deleteLast() {
		if (head == null) {
			System.out.println("List is empty..!");
			return 0;
		} else if (head.next == null) {
			int data = head.data;
			head = null;
			return data;
		}

		CustNode temp = head;
		while (temp.next != null) {
			if (temp.next.next == null) {
				int data = temp.next.data;
				temp.next = null;
				return data;
			}

			temp = temp.next;
		}

		return 0;
	}

}

public class TestLinkedList {

	public static void main(String[] args) {
		CustLinkedList linkedList = new CustLinkedList();
		/*linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		linkedList.addAtPos(25, 3);
		linkedList.printAll();
		System.out.println(linkedList.getSize());
		System.out.println(linkedList.isAvailable(40));*/

		/*linkedList.sortInsertASC(5);
		linkedList.sortInsertASC(6);
		linkedList.sortInsertASC(8);
		linkedList.sortInsertASC(7);
		linkedList.printAll();*/

		/*linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		System.out.println(linkedList.deleteLast());
		System.out.println(linkedList.deleteLast());
		linkedList.printAll();*/

	}
}
