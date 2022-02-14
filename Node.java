package com.nchildtree;

public class Node {
	public Node LeftNode;
	  //getter 
		 public Node getLeftNode() {
			 return LeftNode;
		 }
		//setter 
		 public void setLeftNode(Node leftnode) {
			 this.LeftNode=leftnode;
		 }
		 
	    public Node RightNode; 
	    //getter
	    public Node getRightNode() {
	    	return RightNode;
	    }
	    //setter
	    public void setRightNode(Node rightnode) {
	    	this.RightNode=rightnode;
	    }
	    
	    public int Data; 
	    
	    //getter
	    public int getData() {
	    	return Data;
	    }
	    
	    //setter
	    public void setData(int data) {
	    	this.Data=data;
	    	
	    }

}
