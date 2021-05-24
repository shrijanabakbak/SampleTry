package Tree;

public class BinaryTree {
	
	public static class Node{
		Node left;
		Node right;
		int data;
		
		public Node(int data) {
			this.data=data; //within class ko variable lai this rakheko ramro
			this.left=null;
			this.right=null;
		}
		
		
	}
	Node root; //tree ma jaile ne traversing root bata huncha
	
	public void createTree() {
		root= new Node(1);
		root.left= new Node(2);
		root.right= new Node(3);
		root.left.left= new Node(4);
		root.left.right= new Node(5);
		root.right.left= new Node(6);
		root.right.right= new Node(7);
		
	}
	
	public void preorder(Node root) {
		if (root==null) {
			return;
		}
		System.out.println(root.data);
		
		preorder(root.left);
		preorder(root.right);
	}
	
	public void traverse() {
		preorder(root);
	}
	
	public static void main(String[] args) {
		BinaryTree obj= new BinaryTree();
		obj.createTree();
		obj.traverse();
	}

}


//Inorder---> L root R(4,2,5,1,3,6,7)
//Preorder---> root L R
//Postorder--> L R root
