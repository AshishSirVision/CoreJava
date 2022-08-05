package array_excercise;

import java.util.ArrayList;
import java.util.List;

class Employee {
	private String id;
	private String name;
	private char gender;
	private String emailId;
	private int age;
	private double salary;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String id, String name, char gender, String emailId, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.emailId = emailId;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", emailId=" + emailId + ", age=" + age
				+ ", salary=" + salary + "]";
	}

}

public class BestProgram {
	public static void main(String[] args) {
		List<Employee> elist = new ArrayList<Employee>();
		Employee obj1 = new Employee("111", "tom", 'M', "tom@gmail.com", 15, 4544.43);
		elist.add(obj1);
		elist.add(new Employee("111", "tom", 'M', "tom@gmail.com", 15, 4544.43));
		elist.add(new Employee("B065", "Emma", 'F', "emma123@yahoo.com", 21, 78000.00));
		elist.add(new Employee("M034", "Olivia", 'F', "olivia123@gmail.com", 24, 89000));
		elist.add(new Employee("C045", "Smith", 'M', "Smith997@rediff.com", 25, 56000.00));
		elist.add(new Employee("L056", "Herry", 'M', "herry23@hotmail.com", 22, 56000.00));
		elist.add(new Employee("P078", "William", 'M', "william56@gmail.com", 27, 80000.00));
		elist.add(new Employee("G089", "Maria", 'F', "maria90@gmail.com", 30, 100000.00));
		elist.add(new Employee("S012", "Julia", 'F', "julia1990@gmail.com", 25, 60000.00));
		elist.add(new Employee("M055", "David", 'M', "david99@gmail.com", 23, 70000.00));
		
		//System.out.println(elist);
		System.out.printf("%5s %10s %10s %8s %20s %17s\n", "EMPLOYEE ID", "NAME", "GENDER", "AGE", "E-MAIL ID", "SALARY");

		for (Employee obj : elist) {
			System.out.format("%7s %14s %7s %10s %25s %13s \n", obj.getId(), obj.getName(), obj.getGender(), obj.getAge(), obj.getEmailId(), obj.getSalary());  
		}
	}
}
