package Evaluation;

public class LinkedList {
	
	Node head;
	Node position;
	
	private void nextGreaterNode() {
		Node node1=head;
		Node node2;
		int count;
		while(node1!=null) {
			node2=node1.next;
			count=0;
			while(node2!=null) {
				if(node1.data<node2.data) {
					count++;
					System.out.print(node2.data+" ");
					break;
				}
			node2=node2.next;
			}
			if(count==0) System.out.print(count+" ");
			node1=node1.next;
		}
	}
	private void push(int num) {
		Node n = new Node(num);
		if(position!=null) {
			position.next=n;
		}
		if(head==null) {
			head=n;
		}
		position=n;
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.push(2);
		list.push(7);
		list.push(4);
		list.push(3);
		list.push(5);
		list.nextGreaterNode();
	}
}
class Node{
	
	int data;
	Node next;
	Node(int num) {
		data=num;
		next=null;
	}
}
