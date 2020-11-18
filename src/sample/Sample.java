package sample;


import java.util.List;

public class Sample implements SampleInterface {
	//Default Constructor
	public void SampleInterface(){
		System.out.println("Default Constructor for SampleInterface class");
	}
	//Parameterised Constructor
	public void SampleInterface(String s) {
		System.out.println("Parameterised constructor for "+s+" class");
		
		
	}
	public void modifylist(List<Employee> list, Employee obj, Employee obj1) {

		for (Employee i : list) {

			if (i.equals(obj)) {
				list.remove(i);
				list.add(obj1);
				break;
			}
		}
	}

}
