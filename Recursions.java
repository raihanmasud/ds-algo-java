
public class Recursions {
	//print from 1 -> n
	public static void print(int n){
		if(n>1){
			print(n-1);
		}
		System.out.print(n);
		
	}
	
	public static int lexicalCompare(String s1, String s2){
		
		if(s1==null||s2==null)return -2;
		else 
			return lCompare(0,s1,s2);
		
		
	}
	public static int lCompare(int in, String s1, String s2){
		
		if (s1.charAt(in)<s2.charAt(in)) 
			return 1;
		else if(s1.charAt(in)>s2.charAt(in))
			return -1;
		else{
			in++;
			if(in<s1.length() && in<s2.length())
				return lCompare(in,s1,s2);
			else if(s1.length()<s2.length())
				return 1;
			else if (s1.length()>s2.length())
				return -1;
			else
				return 0;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		//print(n);
		System.out.print(lexicalCompare("abc","ab"));
	}

}
