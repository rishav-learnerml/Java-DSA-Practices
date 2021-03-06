package Queue;

public class QueueUse {

	public static void main(String[] args) throws QueueEmptyException {
		QueueUsingStacks<Integer> q = new QueueUsingStacks<>();
		int[] arr = {10,20,30};
		for(int item : arr) {
			q.enqueue(item);
		}
		q.dequeue();
		q.enqueue(40);
		q.enqueue(50);
		System.out.println(q.size());
		while(!q.isEmpty()) {
			System.out.println(q.dequeue());
		}
		System.out.println(q.size());
	}

}
