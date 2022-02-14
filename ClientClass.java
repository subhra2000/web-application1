package com.nchildtree;

public class ClientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ntree nTree = new Ntree();
		 
		nTree.Add(1);
		nTree.Add(2);
		nTree.Add(7);
		nTree.Add(3);
		nTree.Add(10);
		nTree.Add(5);
		nTree.Add(8);
		 
		Node node = nTree.Find(5);
		int depth = nTree.GetTreeDepth();
		 
		System.out.print(depth);
		
		//binaryTree.Remove(7);
		//binaryTree.Remove(8);
		 
			  System.out.println(nTree); 
			  System.out.println(nTree); 
	}

}
