package StackAndQueueProblems;
import java.util.HashMap;
import java.util.Map;

public class LRUcache {
	public class Node{
		Node next,prev;
		int key,val;
		public Node(int key,int val) {
			this.key=key;
			this.val=val;
		}
	}
	
	Node head = new Node(0,0);
	Node tail = new Node(0,0);//dummy values
	Map<Integer, Node> map = new HashMap();
	int capacity;
	
	public LRUcache(int capacity) {
		this.capacity=capacity;
		head.next=tail;
		tail.prev=head;
	}
	
	public int get(int key) {
		if(map.containsKey(key)) {
			Node node = map.get(key);
			remove(node);
			insert(node);
			return node.val;
		}else {
			return -1;
		}
	}
	
	public void put(int key,int val) {
		if(map.containsKey(key)) {
			remove(map.get(key));
		}
		if(capacity==map.size()) {
			remove(tail.prev);
		}
		insert(new Node(key,val));
	}
	
	private void remove(Node node) {
		map.remove(node.key);
		node.prev.next=node.next;
		node.next.prev=node.prev;
	}
	
	private void insert(Node node) {
		map.put(node.key, node);
		Node headNext = head.next;
		head.next=node;
		node.next=headNext;
		node.prev=head;
		headNext.prev=node;
	}
	
}
