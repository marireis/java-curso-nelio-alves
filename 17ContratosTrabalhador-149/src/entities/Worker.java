package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	//atributos basicos
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	//associações
	private Department department;//1 worker tem 1 depatarmento
	private List<HourContract> contracts =  new ArrayList<>();// tem varios contratos - instacia a lista e nao coloca no construtor
	
	public Worker(String workerName, String string, double baseSalary2, Department department2) {
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {//nao colocar o set contracts para nao permitir trocar a lista por outra lista, a lista de contratos pode ser removido ou adicionada pelos metodos addContract e removeContract
		return contracts;
	}	
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	public double income(int year, int month) {
		double sum = baseSalary;//soma recebe o salario
		Calendar cal = Calendar.getInstance();
		for(HourContract c: contracts) {//percorre a lista de contratos
			cal.setTime(c.getDate());//pega a data digitada
			int c_year = cal.get(Calendar.YEAR);//recebe o ano digitado
			int c_month = cal.get(Calendar.MONTH);//recebe o mes digitado
			if(year == c_year && month == c_month) {//compara se é igual ao do contrato
				sum += c.totalValue();
			}
		}
		return sum;
	}
}
