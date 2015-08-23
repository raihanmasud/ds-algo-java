import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

	boolean adjMatrix[][];
	boolean visited[];
	int numOfNodes;
	//modified to detect cycle
	int predecessor[];
	ArrayList<LinkedList<Node>> adjList;
	
	public Graph(int nodeCounts){
		
		this.numOfNodes = nodeCounts;
		visited = new boolean [nodeCounts];
		
		//modified to detect cycle
		predecessor = new int[nodeCounts];
		for(int i =0;i<nodeCounts;i++)
			predecessor[i]=-1;
		
	}
	
	class Node{
		int value;
		public Node(int value){
			this.value = value;
		}
	}
	
	public void addEdge(int i, int j){
		
		adjMatrix[i][j] = true;
		adjMatrix[j][i] = true;
	}
	
	
	public void createGraphWithAdjList(int numOfNode, int arr[]){
	
		 adjList = new ArrayList<LinkedList<Node>>();
		
		for(int i=1;i<=numOfNodes;i++){
			LinkedList<Node> list = new LinkedList<Node>();
			adjList.add(list);
		}
		
		//for first node adjList
		adjList.get(1).add(new Node(4));
		adjList.get(1).add(new Node(2));
		
		//node 2
		adjList.get(2).add(new Node(3));
		
		
	
	}
	
	
	public void BFS(Node start/*, Node end*/){
		int num = getNumberOfNodes();
		boolean visitedList[] = new boolean[num];
		Queue q = new Queue();
		LinkedList<Node> path = new LinkedList<Node>();
		q.enQueue(start);
		Node current;
		while(!q.isEmpty()){
			current = (Node)q.deQueue() ;
			System.out.print(current.value+" ");
			
			//if(current.value == end.value)
				//break;
			//else
			{
				for(Node n : adjList.get(current.value))
					q.enQueue(n);
			}
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	public void createGraphWithAdjMatrix(int dim){
		
		adjMatrix = new boolean[dim][dim];
		
		adjMatrix[0][1] = true;
		adjMatrix[1][0] = true;
		
		//test for cycle when comment off
		adjMatrix[0][2] = true;
		adjMatrix[2][0] = true;
		
		//commenting this part make node 2 disconnected from the graph
		adjMatrix[1][2] = true;
		adjMatrix[2][1] = true;
		
		
		adjMatrix[1][3] = true;
		adjMatrix[3][1] = true;
		
		//add cycle
		//adjMatrix[2][3] = true;
		//adjMatrix[3][2] = true;
		
	
	}
	
	public int getNumberOfNodes(){
		return numOfNodes;
	}
	
	
	
	public void visit(int node){
		visited[node] = true;
		System.out.print(node+ " ");
	}
	
	public boolean isVisited(int node){
		
		if(visited[node]==true)
			return true;
		else
			return false;
	}
	
	public boolean isEdge( int i, int j){
		
		if(this.adjMatrix[i][j]==true)
			return true;
		else
			return false;
		
	}
	
	public void DFS(Graph g, int startNode){
			visit(startNode);
		visitDFS(startNode);
	}
	
	//boolean path = false;
	
	//using adjacency matrix
	public void visitDFS(int u){
			
		for(int v=0;v<getNumberOfNodes();v++)	
			if( isEdge(u, v)){

				//modified to detect cycle
				if(isVisited(v) && predecessor[u]!=v && predecessor[v]!=-1)
						System.out.print("Cycele Exists");
				
				if(!isVisited(v)){
						visit(v);
						predecessor[v]=u; //modified to detect cycle
						visitDFS(v);
				}
			}
		}
	
	public boolean isPath(int u, int v){
		
		DFS(this,u);
		
		if(visited[v])
			return true;
		
		return false;
	}
	
	public boolean isConnected(){
		for(int i=0; i<getNumberOfNodes(); i++)
			if(!visited[i])
				return false;
		return true;
	}
	
	
	
	public static void main(String args[]){
		int numOfNodes = 4;
		int startNode = 0;
		Graph g = new Graph(numOfNodes);
		int arr[] = {1, 2,3,4};
		g.createGraphWithAdjMatrix(4);
		g.createGraphWithAdjList(numOfNodes, arr);
		Node start = g.new Node(1);//inner class
		g.BFS(start);
		
		//g.printGraph();
		//g.printVisitedNodes();
		
		
		//General Graph Travarsal 
		//g.DFS(g, startNode);
		
		//check for connected component		
		//System.out.print(g.isConnected());
		
		//check for path(u,v)
		int u = 0, v = 2;
		System.out.print(g.isPath(u,v));

	}
}
