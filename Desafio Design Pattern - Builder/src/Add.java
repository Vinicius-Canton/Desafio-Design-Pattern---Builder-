
public class Add {
	private String name;
	private int age;
	private boolean natural_person;
	private boolean legal_person;
	
	public static Add builder() {
		return new Add();
	}
	
	public Add name(String name) {
		this.name = name;
		return this;
	}
	
	public Add age(int age) {
		this.age = age;
		return this;
	}
	
	public Add natural_peron(boolean natural_person) {
		this.natural_person = natural_person;
		return this;
	}
	
	public Add legal_peron(boolean legal_person) {
		this.legal_person = legal_person;
		return this;
	}

	@Override
	public String toString() {
		return "Add [name=" + name + 
				", age=" + age + 
				", natural_person=" + 
				natural_person + 
				", legal_person="
				+ legal_person + "]";
	}
	
	
}
