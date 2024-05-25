import java.util.PriorityQueue;

public class DemoQueue {

	public static void main(String[] args) {
		PriorityQueue<String> prque=new PriorityQueue<String>();
		prque.add("Hi");
		prque.add("Hello");
		prque.add("Namaste");
		System.out.println(prque);
		System.out.println(prque.element());

	}

}
