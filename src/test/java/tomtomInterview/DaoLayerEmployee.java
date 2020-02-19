package tomtomInterview;

import java.util.ArrayList;
import java.util.List;

public class DaoLayerEmployee {

	
	public static List<Employee> getEmployee() {
		List<Employee> list = new ArrayList<Employee> ();
		list.add(new Employee(123, "Alok", "Testing", 10000));
		list.add(new Employee(234, "Monika", "Developer", 20000));
		list.add(new Employee(345, "Rushikesh", "HybridQA", 30000));
		list.add(new Employee(456, "Sudarshan", "SDET", 40000));
		list.add(new Employee(567, "Sushma", "FullStackQA", 50000));
		
		return list;
		
	}
}
