package xxx;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HomeWork_08_Collection {
	//請建立一個Collection物件並將以下資料加入
	public static void main(String[] args) {
	//List
		System.out.println("====LIST====");
		List list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
	//印出這個物件裡的所有元素(使用Iterator, 傳統for與增強for)
	//print toString
		System.out.println("====print toString====");
		System.out.println(list);
	//Iterator	
		System.out.println("====Iterator====");
		Iterator objslist = list.iterator();
		while(objslist.hasNext()) {
			System.out.print(objslist.next()+",");
		}
	//for
		System.out.println("\n"+"====for====");
		for (int i=0; i<list.size();i++) {
			Object objlist = list.get(i);
			System.out.print(objlist+",");
		}
	//for增強
		System.out.println("\n"+"====for-each====");
		for (Object objlist:list) {
			System.out.print(objlist+",");
		}
		
	//移除不是java.lang.Number家族的物件
		System.out.println("\n"+"====移除非Number====");
		Object[] arrlist=list.toArray();
		for (int i=0;i<arrlist.length;i++) {
			if(arrlist[i] instanceof Number==false) {
				list.remove(arrlist[i]);
			}
		}
	//Iterator print
		Iterator objslist2 = list.iterator();
		while(objslist2.hasNext()) {
			System.out.print(objslist2.next()+",");
		}
	

	//Set
		System.out.println("\n");
		System.out.println("====SET====");
		Set set=new HashSet();
		set.add(new Integer(100));
		set.add(new Double(3.14));
		set.add(new Long(21L));
		set.add(new Short("100"));
		set.add(new Double(5.1));
		set.add("Kitty");
		set.add(new Integer(100));
		set.add(new Object());
		set.add("Snoopy");
		set.add(new BigInteger("1000"));
	//印出這個物件裡的所有元素(使用Iterator, 增強for)
	//print toString
		System.out.println("====print toString====");
		System.out.println(set);
	//Iterator
		Iterator objsset = set.iterator();
		while(objsset.hasNext()) {
			System.out.print(objsset.next()+",");
		}
	//for-each
		System.out.println("\n"+"====for-each====");
		for (Object objsset2:set) {
			System.out.print(objsset2+",");
		}
	//移除不是java.lang.Number家族的物件
		System.out.println("\n"+"====移除非Number====");
		Object[] arrset=set.toArray();
		for(int i=0;i<arrset.length;i++) {
			if(arrset[i] instanceof Number==false) {
				set.remove(arrset[i]);
			}
		}
	//Iterator print
		Iterator objsset2 = set.iterator();
		while(objsset2.hasNext()) {
			System.out.print(objsset2.next()+",");
		}
	}
}
