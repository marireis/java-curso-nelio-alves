package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();//
		
		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();
		
		Employee vetor[] = new Employee[n];
		
		for(int i = 1; i<=n; i++) {
			System.out.println();
			System.out.println("Emplyoee #:" + i + ": ");
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			
			while(hasId(list, id)) {
				System.out.println("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.next();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			list.add(new Employee(id,name,salary));
	}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);//função list.stream: forma de transformar a lista em stream/ funcao filter: filtra somente os funcionario = id salary, pega o primeiro ou retorna nulo
		
		if(emp == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.println("Enter the precentage: ");
			double percetage = sc.nextDouble();
			emp.increaseSalary(percetage);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for(Employee obj: list) {
			System.out.println(obj);
		}
		sc.close();
		
	}
	
	private static boolean hasId(List<Employee> list, int id) {//funçao auxiliar para procurar elemento na lista 
		// TODO Auto-generated method stub
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
		
			}
	}



