package com.singlelinkedlist;

public class SinglyLinkedList {
private ListNode head;
private static class ListNode	{
	private int data;
	private ListNode next;
	public ListNode(int data) {
		this.data=data;
		this.next=null;
	}
} 
public void insertAtGivenPosition(int position,int value) {
	ListNode newNode=new ListNode(value );
	if(position==1) {
		newNode.next=head;	
		head=newNode;
	}
	else {
		ListNode previous=head;
		int count=1;
		while(count<position-1) {
			previous=previous.next;
			count++;
		}
		ListNode current=previous.next;
		newNode.next=current;
		previous.next=newNode;
	}
}
public ListNode deleteFirstNode(){
	if(head==null) {
		return null;
	}
	ListNode temp=head;
	head=head.next;
	 temp.next=null;
	return temp; 
	
}
public int findLength() {
	int count=0;
	ListNode current=head;
	if(current==null) {
		return count;
	}else {
		while(current!=null) {
			current=current.next;
			count++;
		}
	}return count;
}
public void insertAtEnd() {
	ListNode newNode=new ListNode(8);
	if(head==null) {
		head=newNode;
		return;
	}
	ListNode current=head;
	while(null!=current.next) {
		current=current.next;
	}
	current.next=newNode;
}

public void prining() {
	ListNode current=head;
	if(current==null) {
		return;
	}
	while(current!=null) {
		System.out.print(current.data+"--->");
		current=current.next;
	}
	System.out.println("null");
	System.out.println("-----");
}
public ListNode deleteLastNode() {
	if(head==null || head.next==null) {
		return null;
	}
	ListNode current=head;
	ListNode previous=null;
	while(current != null) {
		previous=current;
		current=current.next;
	}
	previous.next=null;
	return current;
}
public void deleteAtPosition(int position) {
	if(position==1) {
		head=head.next;	
	}else {
		ListNode previous=head;
		int count=1;
		while(count<position-1) {
			previous=previous.next;
			count++;
		}
		ListNode current=previous.next;
		previous.next=current.next;
	}	
}
public boolean find(ListNode head,int searchKey) {
	if(head==null) {
		return false;
	}
	ListNode current=head;
	while(current!=null) {
		if(current.data==searchKey) {
			return true;
		}
		current=current.next;
	}return false;
}
public ListNode reverse() {
	if(head==null) {
		return null;
	}
	ListNode current=head;
	ListNode previous=null;
	ListNode pnext=null;
	while(current!=null) {
		pnext=current.next;
		current.next=previous;
		previous=current;
		current=pnext;
	}
	return current;
}
public ListNode findMiddle() {
	ListNode slowptr=head;
	ListNode fastptr=head;
	while(fastptr!=null && fastptr.next !=null) {
		slowptr=slowptr.next;
		fastptr=fastptr.next.next;
	}
	return slowptr;
}
public ListNode nthFromEnd(int n) {
	ListNode mainptr=head;
	ListNode refptr=head;
	int count=0;
	while(count<n) {
		refptr=refptr.next;
		count++;
	}
	while(refptr != null) {
		refptr=refptr.next;
		mainptr=mainptr.next;
	}
	return mainptr;
}
public void getRemoveDuplicate() {
	if(head==null) {
		return;
	}
	ListNode current=head;
	while(current!=null && current.next!=null) {
		if(current.data==current.next.data) {
			current.next=current.next.next;
		}else {
			current=current.next;
		}
	}
}
public ListNode insertInSortedlist(int value) {
	ListNode newNode=new ListNode(value);
	if(head==null) {
		return newNode;
	}
	ListNode current=head;
	ListNode temp=null;
	while(current!=null && current.data<newNode.data) {
		temp=current;
		current=current.next;
	}
		newNode.next=current;
		temp.next=newNode;
	return head;
}
public void deleteByGivenPosition(int key) {
	ListNode current=head;
	ListNode temp=null;
	if(current!=null && current.data==key) {
		head=current.next;
		return;
	}
	while(current!=null && current.data!=key) {
		temp=current;
		current=current.next;
	}if(current==null) {
		return;
	}temp.next=current.next;
}
public boolean containsLoop() {
	ListNode fastptr=head;
	ListNode slowptr=head;
	while(fastptr!=null && fastptr.next!=null) {
		fastptr=fastptr.next.next;
		slowptr=slowptr.next;
		if(fastptr==slowptr) {
			return true;
		}
	}return false;
}
public ListNode findStartingOfTheLoop() {
	ListNode fastptr=head;
	ListNode slowptr=head;
	while(fastptr!=null && fastptr.next!=null) {
		fastptr=fastptr.next.next;
		slowptr=slowptr.next;
		if(slowptr==fastptr) {
			return getStartingLOop( slowptr);
		}
	}return null;
}
private ListNode getStartingLOop(ListNode slowptr) {
	// TODO Auto-generated method stub
	ListNode temp=head;
	while(slowptr!=temp) {
		temp=temp.next;
		slowptr=slowptr.next;
	}
	
	return temp ;
}
public void createLoopInLinkedList() {
	//ListNode first=new ListNode(data: 1);
}
public void remove() {
	ListNode fastptr=head;
	ListNode slowptr=head;
	while(fastptr!=null&&fastptr.next!=null) {
		fastptr=fastptr.next.next;
		slowptr=slowptr.next;
		if(slowptr==fastptr){
			removeLoop(slowptr);
			return;
		}
	}
}
private void removeLoop(ListNode slowptr) {
	
	// TODO Auto-generated method stub
	ListNode temp=head;
	while(slowptr.next!=temp.next) {
		temp=temp.next;
		slowptr=slowptr.next;
	}slowptr.next=null;
}
public void createList() {
	head = new ListNode(10);
	 ListNode first=new ListNode(1);
	 ListNode second = new ListNode(12);
	 ListNode third=new ListNode(4);
	 head.next=first;
	 first.next=second;
	 second.next=third;
	 third.next=null;
}
public static void main(String[]args) {
	  SinglyLinkedList sl=new SinglyLinkedList();
	  sl.createList();
	 sl.prining();
	 System.out.println(sl.findLength());
	 
}
}
