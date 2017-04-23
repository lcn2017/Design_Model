package Decorator_Pattern;

public class Person {
	private String name;
	private String sex;
	
	public Person(String name,String sex) {
		this.name=name;
		this.sex=sex;
	}
	public void show() {
		System.out.println("装扮的我");
	}
}
