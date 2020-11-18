package sample;

import java.math.BigDecimal;
import java.util.*;
import java.util.Map.Entry;

public class Employee extends Sample implements Cloneable {

	/*
	 * private Employee() {
	 * 
	 * }
	 */

	private Integer id;

	private String name;

	private BigDecimal salary;

	private Date joiningDate;

	private Set<String> hobbies;

	// if we using static only it can be changed but it allocates only one
	// memory for all instance of classes
	// if we use final it can't changed

	private static final String position = "Employee";

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Set<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Set<String> hobbies) {
		this.hobbies = hobbies;
	}

	public String getPosition() {
		return position;
	}

	public void retrive(Set<Employee> set1) {

		for (Employee e : set1) {
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getHobbies());
			System.out.println(e.getJoiningDate());
			System.out.println(e.getSalary());
			System.out.println(e.getPosition());
		}

	}

	public void modify(Set<Employee> set1, Employee obj, Employee obj1) {
		for (Employee i : set1)
			if (i.equals(obj)) {
				set1.remove(i);
				set1.add(obj1);
				break;
			}

	}

	public void delete(Set<Employee> set1, Employee obj) {
		set1.remove(obj);
		/*
		 * for (Employee i : set1) if (i.equals(obj)) { set1.remove(obj); break;
		 * }
		 */
		/*
		 * Iterator<Employee> i = set1.iterator(); while (i.hasNext()) {
		 * Employee obj1=i.next(); if (obj1.equals(obj)) { i.remove(); break; }
		 * }
		 */

	}

	public void retrivemap(HashMap<Integer, Employee> map) {
		for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
			System.out.println("key: " + entry.getKey() + "name: "
					+ entry.getValue().getName() + "Hobbies"
					+ entry.getValue().getHobbies() + ""
					+ entry.getValue().getSalary() + ""
					+ entry.getValue().getJoiningDate());
		}

	}

	public void modifymap(HashMap<Integer, Employee> map, Employee obj,
			Employee obj1) {
		for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
			if (entry.getKey().equals(obj.getId())) {
				map.replace(entry.getKey(), obj, obj1);
				break;
			}

		}
	}

	public void deletemap(HashMap<Integer, Employee> map, Employee obj) {
		/*
		 * for (Map.Entry<Integer, Employee> entry : map.entrySet()) { if
		 * (entry.getKey().equals(obj.getId())) { map.remove(obj.getId());
		 * break; }
		 * 
		 * }
		 */
		Set<Entry<Integer, Employee>> setOfEntries = map.entrySet();
		Iterator<Entry<Integer, Employee>> iterator = setOfEntries.iterator();
		while (iterator.hasNext()) {
			Entry<Integer, Employee> entry = iterator.next();
			if (entry.getKey().equals(obj.getId())) {
				map.remove(obj.getId());
				break;
			}
		}

	}

	public void retrivelist(List<Employee> list) {
		for (Employee e : list) {
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getHobbies());
			System.out.println(e.getJoiningDate());
			System.out.println(e.getSalary());
		}
	}

	/*
	 * Exception Handling
	 */
	public void modifylist(List<Employee> list, Employee obj, Employee obj1) {
		try {
			for (Employee i : list) {
				list.remove(i);

				// if (i.equals(obj)) {
				// list.remove(i);
				// list.add(obj1);
				// break;
				// }
			}
		} catch (ConcurrentModificationException e) {
			System.out.println(e);

		}
	}

	// using super keyword for accessing parent class method
	public void supermodifylist(List<Employee> list, Employee obj, Employee obj1) {

		super.modifylist(list, obj, obj1);
	}

	// catch(Exception e)
	// {
	// System.out.println(e);
	// }

	public void deletelist(List<Employee> list, Employee obj) {
		/*
		 * for (Employee i : list) if (i.equals(obj)) { list.remove(i); break; }
		 */
		Iterator<Employee> i = list.iterator();
		while (i.hasNext()) {
			Employee obj1 = i.next();
			if (obj1.equals(obj)) {
				i.remove();
				break;
			}
		}
	}

	// private List<TeamMate> list;

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return String.format("id=" + id + "name=" + name + "salary=" + salary
				+ "JoiningDate=" + joiningDate);

	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
