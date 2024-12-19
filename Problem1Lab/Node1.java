package data_structure.Problem1Lab;

public class Node1 {
	public Node1 next;
	public Struct data;
	public Node1() {
		data=new Struct();
		next=null;
	}
	public Node1(String w) {
		data=new Struct(w);
		next=null;
	}

}
