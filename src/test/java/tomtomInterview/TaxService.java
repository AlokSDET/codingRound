package tomtomInterview;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.expression.spel.ast.Operator;

public class TaxService {

	public static List<Employee> evalueTaxUsers(String input) {
		/*
		 * if(input.equalsIgnoreCase("tax")) { return
		 * DaoLayerEmployee.getEmployee().stream().filter(emp -> emp.getSalary() >=
		 * 30000).collect(Collectors.toList()); }else { return
		 * DaoLayerEmployee.getEmployee().stream().filter(emp -> emp.getSalary() <
		 * 30000) .collect(Collectors.toList()); }
		 */

		// above code can be replaced by below using ternary Operator.class
		return (input.equalsIgnoreCase("tax"))
				? DaoLayerEmployee.getEmployee().stream().filter(emp -> emp.getSalary() >= 30000)
						.collect(Collectors.toList())
				: DaoLayerEmployee.getEmployee().stream().filter(emp -> emp.getSalary() < 30000)
						.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println(evalueTaxUsers("tax"));
		System.out.println(evalueTaxUsers("non tax"));
	}

}
