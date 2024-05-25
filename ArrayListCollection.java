import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class ArrayListCollection extends Student {

	public static void main(String[] args) {
		 
		List arr= new LinkedList<>();
		
		LinkedList list = new LinkedList<Integer>();
		list.add(0, 12);
		list.add(1, "Abhi");
	    list.add(new Student("abhi",11));
		System.out.println(list.indexOf(new Student("abhi",11)));
		System.out.println(list);
		
	}

}
