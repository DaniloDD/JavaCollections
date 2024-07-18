package sel.bootcamp.part1_DifficultSection;

public class A_BinarySearchTree {

	public A_Node root;

	public void insert(A_Node node) {
		root = insertHelper(root, node);
	}

	// root is the node we are examining in the binary tree, node is the node we
	// have to find
	private A_Node insertHelper(A_Node root, A_Node node) {
		int data = node.data;

		if (root == null) {
			root = node;
			return root;
		} else if (data < root.data) {
			root.left = insertHelper(root.left, node);
		} else {
			root.right = insertHelper(root.right, node);
		}
		return root; // returns the current root node
	}

	public void display() {
		displayHelper(root);
	}

	private void displayHelper(A_Node root) {
		if (root != null) {
			displayHelper(root.left);
			System.out.println(root.data);
			displayHelper(root.right);
		}
	}

	public boolean search(int data) {
		return searchHelper(root, data);
	}

	private boolean searchHelper(A_Node root, int data) {
		if (root == null) {
			return false;
		} 
		else if (root.data == data) { // we found our data
			return true;
		} 
		else if (root.data > data) {
			return searchHelper(root.left, data);
		}
		else {
			return searchHelper(root.right, data);
		}
	}

	public void remove(int data) {
		if (search(data)) {
			removeHelper(root, data);
		}
		else {
			System.out.println(data + " could not be found");
		}
	}

	private A_Node removeHelper(A_Node root, int data) {
		
		if (root == null) {
			return root;
		}
		else if (data < root.data) {
			root.left = removeHelper(root.left, data);
		}
		else if (data > root.data) {
			root.right = removeHelper(root.right, data);
		}
		else {	// node found
			if (root.left == null && root.right ==  null) {
				root = null;
			}
			else if (root.right != null) { 	// find a successor to replace this node
				root.data = successor(root);
				root.right = removeHelper(root.right, root.data);
			}
			else {	// find a predecessor to replace this node
				root.data = predecessor(root);
				root.left = removeHelper(root.right, root.data);
			}
		}
		return root;
	}

	private int successor(A_Node root) {	// find the least value below the right child of this root node
		root = root.right;
		while (root.left != null) {		// // go as far left as we can go
			root = root.left;
		}
		return root.data;
	}

	private int predecessor(A_Node root) {
		root = root.left;
		while (root.right != null) {	// go as far right as we can go
			root = root.right;
		}
		return root.data;
	}
	
	
}