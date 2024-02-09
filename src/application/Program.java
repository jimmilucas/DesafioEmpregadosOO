package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String departmentName = sc.nextLine();
		
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		
		System.out.print("Email: ");
		sc.nextLine();
		String email = sc.nextLine();
		
		System.out.print("Telefone: ");
		String phone = sc.nextLine();
		
		Address address = new Address(email, phone);
		Department dept = new Department(departmentName, payDay, address);
		
		System.out.print("Quantos funcionários tem o departamento? ");
		int amountEmp = sc.nextInt();
		
		for(int i=0; i < amountEmp; i++) {
			System.out.printf("Dados do funcionário %d:", i+1);
			System.out.print("\nNome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salário: ");
			Double salary = sc.nextDouble();
			
			Employee employee = new Employee(name, salary);
			dept.addEmployee(employee);
		}
		
		showReport(dept);
		
		sc.close();
	}
	
	private static void showReport(Department dept) {
		System.out.println();
		System.out.println(dept);
	}

}
