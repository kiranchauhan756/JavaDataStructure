package learning.linked_list;

import java.util.*;

class Linked_list {
	Node head;// this denotes starting of linked list

	static class Node { //static class so that main can access it
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			next = null;
		}
	}

	public Linked_list insert(Linked_list list, int d) {
		Node newNode = new Node(d);
		if (list.head == null) {
			list.head = newNode;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return list;
	}

	public void print(Linked_list list) {
		Node cur = list.head;
		while (cur != null) {
			System.out.println(cur.data);
			cur = cur.next;
		}
	}

}

public class LinkedList {
	public static void main(String[] args) {
		int n, input;
		Linked_list list = new Linked_list();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter your choice");
			n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println("Enter the data");
				input = sc.nextInt();
				list = list.insert(list, input);
				break;

			case 2:
				System.out.println("The linked list is:");
				list.print(list);
				break;

			case 3:
				System.exit(3);

			default:
				System.out.println("This is invalid choice ");

			}
		}
	}
}