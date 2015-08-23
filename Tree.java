import static java.lang.System.out;

import java.util.ArrayList;

class Node{
		
		int value;
		Node left = null;
		Node right = null;
		
		public Node(int v){
			value = v;
		}
		//For Traversal
		boolean visited = false;
	}

public class Tree {

	/**
	 * @param args
	 */
	private Node root = null; 
	
	public Tree(){
		root = null;
	}
	
	public void createTree(int arr[]){
		for(int v: arr)
		insertNode(root,v);
	}
	
	public Node getRoot(){
		return root;
	}
	
	private void insertNode(Node n, int v){
	
		if(n==null){
			root = new Node(v);
			System.out.println("root="+root.value);
		}
		else if(n.left==null){
			n.left = new Node(v);
			System.out.print("n.left="+n.left.value);
			}
		
		else if(n.right==null){
			n.right = new Node(v);
			System.out.println("n.right="+n.right.value);
		}
		else
			insertNode(n.left,v);
	}
	
	
	public void preOrderTravarsal(Node node){
		
		out.print(node.value);
		if (node.left != null)  preOrderTravarsal(node.left);
		if (node.right != null) preOrderTravarsal(node.right);
	}
	
	public void inOrderTravarsal(Node node){
		
		if (node.left != null)  inOrderTravarsal(node.left);
		out.print(node.value);
		if (node.right != null) inOrderTravarsal(node.right);
	} 
	
	public void postOrderTravarsal(Node node){
		
		if (node.left != null)  postOrderTravarsal(node.left);
		if (node.right != null) postOrderTravarsal(node.right);
		out.print(node.value);
	}

	public void DFS(Tree tree){
		
		/*
		Step 1: Push the root node in the Stack.
		Step 2: Loop until stack is empty.
		Step 3: Peek the node of the stack.
		Step 4: If the node has unvisited child nodes, get the unvisited child node, mark it as traversed and push it on stack.
		Step 5: If the node does not have any unvisited child nodes, pop the node from the stack.
		*/
		Stack stack = new Stack();
		Node root = tree.getRoot() ; 
		
		if(root==null) {
			System.out.print("Empty Tree");
			return;
		}
		
		stack.push(root);
				
		while(!stack.isEmpty()){
			
			Node node = (Node)stack.pop();
				visit(node);
			
			if(node.right!=null )
				stack.push(node.right);
			
			if(node.left!= null )
				stack.push(node.left);
		}
	}//end DFS

	public void visit(Node n){
		n.visited = true;
		out.print(n.value+" ");
	}
	
	public void isBST(Node root){
		int arr[] = new int[6]; 
		
		inOrder(root, arr);
		for(int a: arr){
			System.out.print(a);
		}
		
		//if()
		
		}
	
	boolean isBSTInOrder(Node root, int prev) {
		  if (root ==null) 
			  return true;
		  if (isBSTInOrder(root.left, prev)) {
		    if (root.value > prev) {
		      prev = root.value;
		      return isBSTInOrder(root.right, prev);
		    } else {
		      return false;
		    }
		  }
		  else {
		    return false;
		  }
		}
	
	boolean isValidBST(Node root) {
		return isValidHelper(root, Integer.MIN_VALUE,
		Integer.MAX_VALUE);
		}
	
		boolean isValidHelper(Node curr, int min, int max) {
		if (curr.left != null) {
			if (curr.left.value < min ||!isValidHelper(curr.left, min, curr.value))
				return false;
		}
		if (curr.right != null) {
			if (curr.right.value > max ||!isValidHelper(curr.right, curr.value, max))
			return false;
		}
	
	return true;
	}
		  
		
	
	
	int i=0;
	public void inOrder(Node n, int arr[]){
		
		if(n==null) return ;
		
		inOrder(n.left, arr);
		arr[i++] = n.value;
		inOrder(n.right, arr);
		
	}
	
	public void  BFS(Tree tree){
		
		Queue queue = new Queue();
		
		
		Node root = tree.getRoot();
		if(root==null)return;
		queue.enQueue(root);
		
		while(!queue.isEmpty()){
			Node node = (Node) queue.deQueue();
			visit(node);
			
			if(node.left!=null)
			queue.enQueue(node.left);
			
			if(node.right!=null)
			queue.enQueue(node.right);
		}
		
	}//end BFS

	//recursive dfs
	public void rDFS(Node n){
		
		if(n==null)
			return ;
			
		if(!n.visited)
			visit(n);
		//if(n.left!= null )//&& !n.left.visited)
			rDFS(n.left);
		
		//if(n.right!= null )//&& !n.right.visited)
			rDFS(n.right);
	}
	
	
	public int findMaxDepth(Node n){
		
		if(n==null) return 0;
		
			int left = 0; int right = 0;
			left = 1+findMaxDepth(n.left);
			right = 1+findMaxDepth(n.right);
			
			return Math.max(left,right);
	
	}
	
	public int findDepth(Node n){

		if(n==null) return 0;
		
		return Math.max(1+findMaxDepth(n.left),1+findMaxDepth(n.right));

	}
	
	public int findMinDepth(Node n){
		
		if(n==null) return 0;
		
		int left = 0; int right = 0;
		left = 1+findMinDepth(n.left);
		right = 1+findMinDepth(n.right);
		
		return Math.min(left,right);
	}
	
	public boolean isBalanced(Node n){
		int min = findMinDepth(n);
		int max = findMaxDepth(n);
		out.print("minD"+min);
		out.print("maxD"+max);
		
		return (max-min<=1);
	}	
	
	Node arrayToTree(int A[], int start, int end){
		
		if(start==end){
			Node root = new Node(A[start]);
			return root;
		}
		
		if(start<end){
		int mid = (start+end)/2;
		Node root = new Node(A[mid]);
		Node left =	arrayToTree(A, start, mid-1);
		Node right = arrayToTree(A, mid+1, end);
		
		root.left = left;
		root.right = right;
		}
		
		return root;
		
		
		
		
	} 
	
	
	
	int A1[] = new int[10];
	int in =0;
	public int[] DFStoArray(Node root){
		
		
		if(root ==null) return A1;
		
		else{
			
			DFStoArray(root.left);
			
			out.print(" "+root.value);
			A1[in++] = root.value;
			DFStoArray(root.right);
		}
		
		return A1;
	}
	
	
	void printPathToNode(Node root, Node target){
		
		int path[] = new int[countNode(root)];
		printPath(root, target, path, 0);
		
	}
	
	
	void printAllRootToLeaf(Node root){
		
		int path[] = new int[countNode(root)];
		printPath(root, path, 0);
		printAllPathArrays();
		
	}
	
	void printPathToSum(Node root, int sum){
		int path[] = new int[countNode(root)];
		printPath(root, sum, path, 0);
		
	}	
	
	
	void printPathArray(int path[], int len){
		
		for(int i=0;i<len;i++)
			out.print(path[i]+" ");
		out.println();
		
	}
	
	void printPath(Node n, Node target, int path[], int len){
		
		if(n==null||target==null) return;
		path[len++] = n.value;
		
		//print all path to leafs
		//if(n.left==null && n.right==null)
		if(n.value==target.value)	
			printPathArray(path, len);
		
		printPath(n.left, target, path, len);
		printPath(n.right,target, path, len);
		
	}
	
	
	
void printPath(Node n, int sum, int path[], int len){
		
		if(n==null) return;
		path[len++] = n.value;
		
		//print all path to leafs
		//if(n.left==null && n.right==null)
		if(sum - n.value == 0)	
			printPathArray(path, len);
		
		printPath(n.left, sum-n.value, path, len);
		printPath(n.right,sum-n.value, path, len);
		
	}
	
public void printAllPathSums(Node root){
		
		int path[] = new int[5];
		printPathSums(root,0,path);
		for(int sum: path)
			out.print(sum+" ");
	} 
int len =0;

public void printPathSums(Node n,int sum, int path[]){
	
	if(n==null) return;
	
	if(n.left==null && n.right==null)
		{
		path[len++] = sum + n.value ;
		}
	
	else
		printPathSums(n.left,sum+n.value, path); 
		printPathSums(n.right,sum+n.value, path);
	
}
	
	
	int I =0; int paths[][] = new int[10][10];
	
	public void printAllPathArrays(){
		
		for(int i=0;i<10;i++){
			
			for(int j=0;j<10;j++){
				System.out.print(paths[i][j]+" ");
			}
		System.out.println();
		}
	}
	
	void printPath(Node n,  int path[], int len){
		
		if(n==null) return;
		path[len++] = n.value;
		
		//print all path to leafs
		if(n.left==null && n.right==null)
			{
			
			for(int i =0;i<len;i++)
			 paths[I][i]= path[i];
				I++;
			//printPathArray(path, len);
			
			}
		printPath(n.left, path, len);
		printPath(n.right, path, len);
		
	}
	
	boolean isPath(Node n1, Node n2){
		
		return nodeExists(n1,n2);
		
	}
	
	public boolean nodeExists(Node root, Node target){
		
		if (root == null) return false;
		
		else
		{
			if(root.value==target.value) 
				return true;
		
			return (nodeExists(root.left, target) || nodeExists(root.right, target)) ;
		}
		
	}
	
	public int countNode(Node n){
		
		if(n==null)
			return 0;
	
		else{
			
		if(n.left==null && n.right==null)
			return 1;
		
		return 1+countNode(n.left) + countNode(n.right);
		}
		
		/*
		if(!n.visited)
			{
			//count++;
			//visit(n);
			}
		*/
		
		/*
		int left= 0, right=0;
		if(n.left!=null && !n.left.visited)
			right = 1+countNode(n.left);
		if(n.right!=null && !n.right.visited)
			left =  1+countNode(n.right);
		*/
		
		//return 1+countNode(n.left)+countNode(n.right);
		/*
		if(n.left!=null)
			count = 1+countNode(n.left);
		if(n.right!=null)
			count = 1+countNode(n.right );
		 */
		/*
		if(n.left!=null)
			count = 1+countNode(n.left);
		if(n.right!=null)
			count = 1+countNode(n.right);
		
		
		return 1+count;
		*/
	}
	
	

}





