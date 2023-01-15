package com.composition.principle;

import java.util.List;

public class TestTree {
	
	public static void main(String[] args) {
		Tree tree = new Tree("World");
		Node root = tree.getRoot();
		
		Node china = new Node("China");
		Node america = new Node("America");
		
		root.add(china);
		root.add(america);
		
		Node beijing = new Node("Beijing");
		Node shangai = new Node("Shanghai");
		
		china.add(beijing);
		china.add(shangai);
		
		Node sanfrancisco = new Node("San Francisco");
		Node newyork = new Node("New York");
		
		america.add(sanfrancisco);
		america.add(newyork);
		
		System.out.println(root.getName());
		List<Node> childeNodes = root.getChildNodes();
		
		for( Node node: childeNodes ) {
			System.out.println("---"+node.getName());
			List<Node> childNodes2 = node.getChildNodes();
			for(Node node2 : childNodes2) {
				System.out.println("------"+node2.getName());
			}
		}
		
		
	}

}
