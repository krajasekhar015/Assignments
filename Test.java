class Employee{
	
	private int id = 209;
	private String name = "Ram";
	private float salary = 12300;
	private String city = "Banglore";
	
	public void setId(int id){
		
		this.id = id;
	}
	public void setName(String name){
		
		this.name = name;
	}
	public void setSalary(float salary){
	
		this.salary = salary;
	}
	public void setCity(String city){
		
		this.city = city;
	}
	public int getId(){
	
		return id;
	}
	public String getName(){
	
		return name;
	}
	public float getSalary(){
	
		return salary;
	}
	public String getCity(){
		
		return city;
	}
}
public class Test{

	public static void main(String args[]){
	
		Employee e = new Employee();
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		System.out.println(e.getCity());
	}
}