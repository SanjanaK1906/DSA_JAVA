package data_structure.linkedlist.doubly;


public class Employye {
	String name;
	int id;
	String dept;
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", dept=" + dept + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
