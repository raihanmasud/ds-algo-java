
public class Maze {

	
	static boolean isReachable(int i, int j, int target_i, int target_j, int maze[][]){
		int n = maze[0].length;
		
		if(i<0||i>n-1||j<0||j>n-1)
			return false;
		if(maze[i][j]==0) 
			return false;
		
		if(maze[i][j]==1 && i==target_i && j==target_j)
			return true;

		if(isReachable(i+1, j, target_i, target_j, maze))
				return true;
		
		if(isReachable(i, j+1, target_i, target_j, maze))
				return true;
		
		return false;
		
	}
	
	public static void main(String[] args) {
		
		int maze[][] ={
						{1,1,0,1,0},
						{0,1,0,1,1},
						{1,1,1,0,1},
						{0,1,1,1,0},
						{1,1,0,0,0}
						};
		System.out.print(isReachable(0,0,3,3, maze));
		
	}

}
