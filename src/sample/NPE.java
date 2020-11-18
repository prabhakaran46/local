package sample;

import java.math.BigDecimal;
import java.util.*;

public class NPE {

	public static void main(String a[]) {
		// String s = null;
		Date date = new Date();
		Set<String> hobbies = new HashSet<String>();
		hobbies.add("cricket");
		hobbies.add("Hockey");
		// s.length();

		String s1 = new String("");
		s1.length();

		Employee obj1 = new Employee();
		obj1.setId(1);
		obj1.setName("XXX");
		obj1.setSalary(new BigDecimal("10000.00"));
		obj1.setJoiningDate(date);
		obj1.setHobbies(hobbies);
		
		Employee obj2 = new Employee();
		obj2.setId(2);
		obj2.setName("YYY");
		obj2.setSalary(new BigDecimal("11000.00"));
		obj2.setJoiningDate(date);
		obj2.setHobbies(hobbies);
		Employee obj3 = new Employee();
		obj3.setId(3);
		obj3.setName("ZZZ");
		obj3.setSalary(new BigDecimal("12000.00"));
		obj3.setJoiningDate(date);
		obj3.setHobbies(hobbies);
		
		
		//Using Clonaeble
	//	try {
	//	Employee obj5 = (Employee)obj3.clone();
	//	System.out.println("Cloned id"+obj5.getId());
	//	} catch (CloneNotSupportedException e) {
			
	//		e.printStackTrace();
	//	}
		
		//System.out.println(obj1);
		

		Set<Employee> set1 = new HashSet<Employee>();
		set1.add(obj1);
		set1.add(obj2);
		set1.add(obj3);
		Employee obj4 = new Employee();
		//obj4.retrive(set1);
		//obj4.modify(set1,obj1,obj3);
		//obj4.delete(set1, obj2);
		//obj4.retrive(set1);
		obj4.SampleInterface();
		obj4.SampleInterface("SampleInterface");
		
		HashMap<Integer, Employee> map = new HashMap<>();
		map.put(obj1.getId(), obj1);
		map.put(obj2.getId(), obj2);
		map.put(obj3.getId(), obj3);
		obj4.retrivemap(map);
		obj4.modifymap(map, obj1, obj3);
		obj4.deletemap(map, obj1); 

	List<Employee> list = new ArrayList<Employee>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		obj4.retrivelist(list);
		obj4.modifylist(list, obj3, obj1);
		obj4.deletelist(list, obj1);
		obj4.retrivelist(list);

	}

}
