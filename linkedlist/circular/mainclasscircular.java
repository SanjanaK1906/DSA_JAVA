package data_structure.linkedlist.circular;

public class mainclasscircular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		circularllist c1 = new circularllist();
		System.out.println("create circular link list");
		c1.createclist(4);
		System.out.println("circular link list");
		c1.displayclist();
		System.out.println(" \n circular link list insertfirst  value 9");
		c1.insertstart(9);
		c1.displayclist();
		System.out.println(" \n circular link list insertmiddle  pos 3 val 10");
		c1.insertmiddle(3,10);
		c1.displayclist();
		System.out.println(" \n circular link list insertlast val 22");
		c1.insertlast(22);
		c1.displayclist();
		System.out.println(" \n circular link list deletefirst ");
		c1.deletestart();
		c1.displayclist();
		System.out.println(" \n circular link list deletemiddle at pos 2");
		c1.deletemiddle(2);
		c1.displayclist();
		System.out.println(" \n circular link list deletelast ");
		c1.deletelast();
		c1.displayclist();
		System.out.println("\n");
		c1.search(10);
		c1.search(45);
	}

}
