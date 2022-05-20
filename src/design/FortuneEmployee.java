package design;

import java.text.ParseException;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		
     EmployeeInfo Aksel = new EmployeeInfo(19);
	 Aksel.benefitLayout(23409);
	 Aksel.getDate_of_birth("09-07-2002");
	 Aksel.getSalary(98000);
	 Aksel.getEmail("tyrion.lannister@gmail.com");
	 Aksel.employeeId(76);

		int bonus=EmployeeInfo.calculateEmployeeBonus(120000, "best");
		System.out.println("your bonus is "+bonus);
		try {
			int pension = EmployeeInfo.calculateEmployeePension(5, 120000);
			System.out.println("your pension is "+ pension);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("**************** Accessing abstract class properties*******");
		// Access the static methods with the class name
		AbstractEmployee.meeting();

		// Access the abstract class properties with EmployeeInfo object

		System.out.println("Experience: " + Aksel.yearsOfExperience);
		Aksel.travelTheWorld();
		Aksel.giveInstructions();


	}
	

}
