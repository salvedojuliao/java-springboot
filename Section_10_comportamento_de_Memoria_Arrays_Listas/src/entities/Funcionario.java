package entities;

public class Funcionario {
	private Integer id;
	private String name;
	private Double salary;
	
	public Funcionario() {}
	
	public Funcionario(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public void increaseSalary(double percentage) {
		salary+= salary * percentage / 100;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}

	
	
	
	
	
	 
	
	
}