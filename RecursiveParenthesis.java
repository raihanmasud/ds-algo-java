
public class RecursiveParenthesis {

	/**
	 * @param args
	 */
	
	public static void printParen(String str, int l, int r){
		
		if(l<0 || l>r)//invalid
			return;
		
		//counting left and right parenthesis
		 //when both are zero that means 2*n of parenthesis is added in correct order
		 //and it is ready to print one correct sequence
		if(l==0 && r==0) 	
			System.out.println(str);
		
		else{	
			if(l>0)
			printParen(str+"(",l-1,r);
			if(r>l)
			printParen(str+")",l,r-1);	
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 3;//number of pairs
		String str = "";
		
		printParen(str,n,n);
	}

}
