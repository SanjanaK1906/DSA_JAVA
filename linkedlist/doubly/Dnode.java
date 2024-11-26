package data_structure.linkedlist.doubly;

public class Dnode<e> {

	Dnode<e> prev;
	Dnode<e> next;
	e data;
	
	public Dnode() {
		prev=null;
		next=null;
		data=null;
	}
	public Dnode(e data) {
		prev=null;
		next=null;
		this.data=data;
	}

}
