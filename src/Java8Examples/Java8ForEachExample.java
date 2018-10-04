package Java8Examples;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEachExample {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			myList.add(i);

		MyConsumer action = new MyConsumer();
		myList.forEach(action);
	}

}

class MyConsumer implements Consumer<Integer> {

	public void accept(Integer t) {
		System.out.println("Consumer impl Value::" + t);
	}

}
