package encapsulation;

public class Person {
	public String Name = "Rohit";
	public String LastName = "Chavan";
	private int age = 26;
	private float salary = 28000.03f;

	public int getAge() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
}
