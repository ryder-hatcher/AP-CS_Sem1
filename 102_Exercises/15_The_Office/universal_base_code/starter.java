/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee DwightSchrut = new Employee(1987,"Dwight", "Schrute",  4416.66);
		Employee JimHalpert = new Employee(2474,"Jim", "Halpert", 2474);
		Employee PamBeesly = new Employee (2011,"Pam", "Beesly", 2250);
		Employee MarsonTaragawa = new Employee (2000,"Marson", "Tagarawa", 1000);
		DwightSchrut.raiseSalary(100);
		JimHalpert.raiseSalary(100);
		PamBeesly .raiseSalary(100);
		MarsonTaragawa.raiseSalary(100);
		}
}
