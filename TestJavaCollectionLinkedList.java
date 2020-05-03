import java.util.*;
class TestJavaCollectionLinkedList
{
	public static void main(String args[]){
		//Creating linkedlist
		List<String> list=new LinkedList<String>();
		//adding object in linkedlist
		list.add("Rani");
		list.add("Vijay");
		list.add("Rani");
		list.add("Ajay");
		//Traversing list through iterator
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());		
		}
	}
}