package encapsulation;

public class Runner {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println("Age is: " + p.getAge());
		p.setage(27);
		System.out.println("Age is: " + p.getAge());
		System.out.println("Salary is: " + p.getSalary());
		p.setSalary(33012.55f);
		System.out.println("Salary is: " + p.getSalary());

	}
}
