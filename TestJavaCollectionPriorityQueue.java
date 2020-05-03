import java.util.*;
class TestJavaCollectionPriorityQueue
{
	public static void main(String args[]){
		//Creating queue
		Queue<String> queue=new PriorityQueue<String>();
		//adding object in queue
		queue.add("Amit Sharma");
		queue.add("Vijay Raj");
		queue.add("Jaishankar");
		queue.add("Raj");
		System.out.println("head:"+queue.element());
		System.out.println("head:"+queue.peek());
		System.out.println("Iterating the queue elements:");
		//Traversing queue through iterator
		Iterator itr=queue.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());	
		}
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements:");
		Iterator itr2=queue.iterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());	
		}
	}
}