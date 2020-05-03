import java.util.*;
class TestJavaCollectionArrayList
{
	public static void main(String args[]){
		//Creating arraylist
		List<String> list=new ArrayList<String>();
		//adding object in arraylist
		list.add("Priya");
		list.add("Riya");
		list.add("Anu");
		list.add("Shreya");
		//Traversing list through iterator
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());		
		}
	}
}