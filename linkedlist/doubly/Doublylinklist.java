package data_structure.linkedlist.doubly;

public class Doublylinklist<e> {
	Dnode<e> head;
	Dnode<e> last;
	int count;
	
	public Doublylinklist(){
		head=null;
		last=null;
		count=0;
	}
	public int size() {
		return count;
	}
	public void display() {
		if(head==null) {
			System.out.println("empty list");
		}else {
			Dnode <e> r=head;
			while(r!=null) {
				if(r.next==null) {
					System.out.print(r.data+" "+"\n");
				}else {
					System.out.print(r.data+" <-> ");
				}
				r=r.next;
			}
			
		}
	}
	public void insertlast(e value) {
		Dnode <e> newnode = new Dnode<e>(value);
		if(head==null) {
			head=last=newnode;
		}else {
			newnode.prev=last;
			last.next=newnode;
			last=newnode;
		}
		count++;
	}
	public void insertstart(e value) {
		Dnode <e> newnode = new Dnode<e>(value);
		if(head==null) {
			head=last=newnode;
		}else {
			newnode.next=head;
			head.prev=newnode;
			head=newnode;
		}
		count++;
	}
	public void insertbetween(int pos,e value) {
		
		if(pos>count || count<2) {
			System.out.println("insertion not possible");
		}else {
			Dnode <e> newnode = new Dnode<e>(value);
			Dnode <e> r=head;
			for(int i=1;i<pos-1;i++) {
				r=r.next;
			}
			newnode.next=r.next;
			newnode.prev=r;
			//r.next.prev=newnode;
			newnode.next.prev=newnode;
			//r.next=newnode;
			newnode.prev.next=newnode;
		}
		count++;
	}
	public void deletelast() {
		if(head==null) {
			System.out.println("empty list");
		}else {
			if(head==last) {
				head=last=null;
			}else {
				last=last.prev;
				last.next=null;
			}
			count--;
		}
	}
	public void deletestart() {
		if(head==null) {
			System.out.println("empty list");
		}else {
			if(head==last) {
				head=last=null;
			}else {
				head=head.next;
				head.prev=null;
			}
			count--;
		}
	}
	public void deletemiddle(int pos) {
		if(pos>count) {
			System.out.println("invalid operation");
		}else {
			Dnode<e>r=head;
			
			//1way
//			for(int i=0;i<pos-1;i++) {
//				r=r.next;
//			}
//			r.next.next.prev=r;
//			r.next=r.next.next;
			//2nway
			for(int i=0;i<pos;i++) {
				r=r.next;
			}
			r.prev.next=r.next;
			r.next.prev=r.prev;
			count--;
		}
	}
	
}
