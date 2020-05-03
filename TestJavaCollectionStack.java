import java.util.*;
class TestJavaCollectionStack
{
	public static void main(String args[]){
		//Creating stack
		Stack<String> stack=new Stack<String>();
		//adding object in stack
		stack.add("Ayush");
		stack.add("Amit");
		stack.add("Ashish");
		stack.add("Garima");
		//Traversing list through iterator
		Iterator itr=stack.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());		
		}
	}
}