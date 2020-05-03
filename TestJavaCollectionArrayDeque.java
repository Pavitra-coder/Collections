import java.util.*;
class TestJavaCollectionArrayDeque
{
	public static void main(String args[]){
		//Creating Deque and adding elements
		Deque<String> deque=new ArrayDeque<String>();
		//adding object in stack
		deque.add("Gautam");
		deque.add("Karan");
		deque.add("Ajay");
		//Traversing elements
		for(String str:deque){
			System.out.println(str);		
		}
	}
}