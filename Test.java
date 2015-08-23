import java.util.HashMap;
import static java.lang.System.out;

public class Test {

	/**
	 * @param args
	 */
	
	//remove duplicates from a string
	public static String removeDuplicates(String s){
		
		String uniqueString = "";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put(s.charAt(0), new Integer(0));
		uniqueString+=s.charAt(0);
		char ch ;
		for(int i=1;i<s.length();i++){
			ch = s.charAt(i);
			if(!hm.containsKey(ch)){
					hm.put(ch, new Integer(i));
					uniqueString+=ch;
			}
		}
		
		return uniqueString;
		
	}
	
	//no consequting duplicates
	public static String removeConsequtives(String s){
		
		String finalString = "";
		
		char currentChar = s.charAt(0);
		
		for(int i=1;i<s.length();i++){
			if(currentChar!=s.charAt(i))
				finalString += currentChar;
			currentChar = s.charAt(i);
		}
		
		return finalString;
		
		
	}
	
	
	public static void callByValTest(Object y){
		
		System.out.print(y);
		y= "This is y";
		System.out.println(y);
		System.out.print(y);
		
	}
	
	
	public static void main(String[] args) {
		
		int i, j, c=1;
		
		for(j=10;j>=1;j--){
		for(i=1;i<=10;++i){
			c+=1;
		}
		c-=1;
		}
			out.print(c);
		
			//testing call by value
			//Object  x = "This is x";
			//callByValTest(x);
		//System.out.print(x);
		
		
		
		//out.println(removeDuplicates("aabcddets"));
		//out.print(removeConsequtives("abaaabb"));
		int arr[] = {3,5,1,6,2};
		
		Tree tree = new Tree();
		tree.createTree(arr);
		Node root = tree.getRoot();
		
		System.out.print(tree.findDepth(root));
		System.out.print(tree.findMaxDepth(root));
		//BST Test
		//tree.isBST(root);
		//boolean isBST = tree.isValidBST(root);
		//System.out.print(isBST);
		
		//tree.printAllRootToLeaf(root);
		
		//tree.preOrderTravarsal(tree.getRoot());
		//out.println();
		
		//tree.inOrderTravarsal(tree.getRoot());
		//out.println();
		
		//tree.postOrderTravarsal(tree.getRoot());
		//out.println();
		
		
		
		//tree.BFS(tree);
		
		//tree.DFS(tree);
		
		//tree.rDFS(root);
		
		//int count = tree.countNode(root);
		//int depth = tree.findMaxDepth(root);
		//
		
		//System.out.print(tree.isBalanced(root));
		//Find node
		//out.print(tree.nodeExists(root, new Node(4)));
		//Output to an array
		//int A[] = new int[10];
		//A = tree.DFStoArray(root);
		//for(int a:A)
			//out.print(a+" ");
		//tree.printArray();
		//out.print(tree.nodeExists(root, new Node(6)));
		//out.print(tree.isPath( root.left, new Node(6)));
		
		//Path to target and all leaves
		//tree.printAllRootToLeaf(root);
		//tree.printPathToNode(root, new Node(6));
		
		/* array to tree
		int A[] ={1,5,6,3,2,4,7};
		Node n = tree.arrayToTree(A, 0, A.length-1);
		out.print(n.value);
		out.print(n.left.value);
			out.print(n.left.left.value);
			out.print(n.left.right.value);
		out.print(n.right.value);
			out.print(n.right.left.value);
			out.print(n.right.right.value);
		*/
		//tree.preOrderTravarsal(n);
		
		//tree.printPathToSum(root, 0);
		
		//Stack stack = new Stack();
		//Testing Stack operations
		//stack.push(tree.getRoot().right);
		//stack.push(tree.getRoot().left);
		//stack.push(tree.getRoot());
		
		//out.println("root="+((Node)stack.pop()).value);
		//out.println("left="+((Node)stack.pop()).value);
		//out.print("right="+((Node)stack.pop()).value);
		//Testing Stack operations
		
		//Testing Queue operations
		//Queue queue = new Queue();
		//queue.enQueue(tree.getRoot());
		//queue.enQueue(tree.getRoot().left);
		//queue.enQueue(tree.getRoot().right);
		
		//queue.printQueue();
		
		//out.println("root="+((Node)queue.deQueue()).value);
		//out.println("left="+((Node)queue.deQueue()).value);
		//out.print("right="+((Node)queue.deQueue()).value);
		//Testing Queue operations
		
		//Testing Heap
		int array[] = {1,8,10,14,7,9,13,2,4,16};
		Heap heap = new Heap();
		//test maxHeapify
		//heap.maxHeapify(array, 1);
		
		//test buildMaxHeap
		//heap.buildMaxHeap(array);
		
		/*
		for(int a : array){
			out.print(a +" ");
		}
		*/
	}

}
