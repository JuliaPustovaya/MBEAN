package jmxlesson;

public interface HelloMBean {
	void sayHello();

	int addIntegers(int a, int b);

	Person returnPerson();

	String getName();//атрибуты
	void setName(String name);//атрибуты
	
}
