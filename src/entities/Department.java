package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private int payDay;
	
	private Address address;
	private List<Employee> employees = new ArrayList<>();
	
	public Department() {
	}

	public Department(String name, int payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}
	
	public double payroll() {
		Double employeesSalary = 0.0;
		for(Employee employee : employees) {
			employeesSalary += employee.getSalary();
		}
		return employeesSalary;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("FOLHA DE PAGAMENTO: ");
		sb.append("\nDepartamento Vendas = R$ " + String.format("%.2f", payroll()));
		sb.append("\nPagamento realizado no dia " + payDay);
		sb.append("\nFuncionários: ");
		for (Employee employee : employees) {
			sb.append("\n" + employee.getName());
		}
		sb.append("\nPara dúvidas favor entrar em contato: " + address.getEmail());
		return sb.toString();
	}
	
	
}
