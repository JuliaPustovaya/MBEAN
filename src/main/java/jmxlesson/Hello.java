package jmxlesson;

public class Hello implements HelloMBean {
private String name;

	public int addIntegers(int a, int b) {
		return a+b;
	}

	public Person returnPerson() {
		return new Person();
	}

	public String getName() {
		return null;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println("Hello fromm Jmx");
	}
}
