package sel.bootcamp.part1_DifficultSection;


public class A_Main {
	
	// main method
		public static void main (String [] args) {
			// Binary Search Tree = a tree data structure, where each node is greater than it's left child but less than it's right
			
			A_BinarySearchTree tree = new A_BinarySearchTree();
			
			// let s insert some anonymous nodes
			tree.insert(new A_Node(5));
			tree.insert(new A_Node(1));
			tree.insert(new A_Node(9));
			tree.insert(new A_Node(7));
			tree.insert(new A_Node(3));
			tree.insert(new A_Node(6));
			tree.insert(new A_Node(4));
			tree.insert(new A_Node(8));
			
			tree.display();
			// element to search
			if (tree.search(10)) {
				System.out.println("The element is present in the Binary Tree");
			}
			else {
				System.out.println("The element is not present in the Binary Tree");
			}
		}

}
