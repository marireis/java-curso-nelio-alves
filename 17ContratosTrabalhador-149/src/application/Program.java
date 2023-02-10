package application;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;

public class Program {
	public static void main(String[] args) throws ParseException{
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter department's name:");
		String departmentName = sc.nextLine();
		
		System.out.println("Enter Worker data: ");
		
		System.out.println("Name: ");
		String workerName = sc.nextLine();
		
		System.out.println("Level: ");
		String workerLevel = sc.nextLine();
		
		System.out.println("Base Salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, workerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.println("How many contracts to this worker? ");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++){
			System.out.println("Enter contract #" + i + "data: ");
			System.out.print("Date DD/MM/yyyy");
			Date contractDate =  sdf.parse(sc.next());
			
			System.out.println("Value per hours: ");
			double valuePerHours = sc.nextDouble();
			
			System.out.println("Duration (hours)");
			int hours = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHours, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.println("Enter moth and year to calculate income(MM/YYYY)");
		String monthAndYear = sc.next();
		
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f",worker.income(year, month)));
		
		sc.close();
		
		
	}

}
