import java.util.ArrayList;

public class Queue<T> {
	
	int size;
	ArrayList<T> queue = new ArrayList<T>();
	
	public Queue() {}
	
	public void enqueue(T num) {
		queue.add(num);
		size++;
	}
	
	public void dequeue() {
		if(size == 0) {System.out.println("Queue is empty! Nothing to dequeue");}
		else {
			queue.remove(0);
			size--;
		}
	}
	
	public int size() {
		return size;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue1 = new Queue<Integer>();
		System.out.println("Size is " + queue1.size + " queue is " + queue1.queue);
		queue1.enqueue(4);
		queue1.enqueue(234);
		queue1.enqueue(123);
		queue1.enqueue(1341);
		System.out.println("Size is " + queue1.size + " queue is " + queue1.queue);
		queue1.dequeue();
		System.out.println("Size is " + queue1.size + " queue is " + queue1.queue);
	}

}
