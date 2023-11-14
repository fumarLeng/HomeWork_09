package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Add {

	public static void main(String[] args) {
		Collection<Object> Collection = new ArrayList<>();

		Collection.add(100);
		Collection.add(3.14);
		Collection.add(21L);
		Collection.add(Short.parseShort("100"));
		Collection.add(5.1);
		Collection.add("Kitty");
		Collection.add(100);
		Collection.add(new Object());
		Collection.add("Snoopy");
		Collection.add(new BigInteger("1000"));

		
		System.out.println("Iterator:");
		Iterator<Object> iterator = Collection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		System.out.println();

		System.out.println("for:");
		for (int i = 0; i < ((ArrayList<Object>) Collection).size(); i++) {
			System.out.println(((ArrayList<Object>) Collection).get(i));
		}
		System.out.println();
		
		System.out.println("foreach:");
		for (Object obj : Collection) {
			System.out.println(obj);
		}
		System.out.println();
		
		// 移除不是 java.lang.Number 相關的物件
		Iterator<Object> removeIt = Collection.iterator();
		while (removeIt.hasNext()) {
			Object notNum = removeIt.next();
			if (!(notNum instanceof Number)) {
				removeIt.remove();
			}
		}
		
		//再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
		System.out.println("觀察Number相關的物件移除成功:");
		for (Object obj : Collection) {
			System.out.println(obj);
		}
		System.out.println();

	}

}
