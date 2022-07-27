package problem1;

 class Main {
	
	Node node;
	Node prev = null;
	Node newHead = null;
	void processBST(Node root)
	{
	if(root == null)return;
	//loop till left leaf
	processBST(root.left);
	Node rightNode = root.right;
	Node leftNode = root.left;
	//update new head to hold new root
	if(newHead == null)
	{
		newHead = root;
	root.left = null;
	prev = root;
	}
	else
	{
	//update the right of predecessor and also the predecessor to accomodate next node
	prev.right = root;
	root.left = null;
	prev = root;
	}
	processBST(rightNode);
	}
	void traverse(Node root)
	{
	//traverse till leaf
	if(root == null)return;
	System.out.print(root.val + " ");
	traverse(root.right);
	}
	}