package implementQueueStacks232;

public class Main {

	public static void main(String[] args) {
		MyQueue obj = new MyQueue();
		obj.push(1);
		obj.push(2);
		obj.peek();
		obj.pop();
		obj.empty();
		System.out.println(obj.peek() + " " + obj.pop() + " " + obj.empty());
	}

}
