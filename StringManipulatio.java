import java.util.Arrays;
import java.util.Hashtable;


public class StringManipulatio {

	public static boolean isPalindrome(String s){
		
		if(s==null) return false;
		else{
			return match(0,s.length()-1,s);
		}
		
		
	}
	
	public static char firstUniqueChar(String str){
		
		char ch[] = new char[str.length()];
		
		if(str==null)
			System.out.print("Empty String");
		else
			ch = str.toCharArray();
	
		
		if(ch.length==1)
			return ch[0];
		else{
			Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>(ch.length);
			for(int i =0;i<ch.length;++i){
				Character c = new Character(ch[i]);
				if(!ht.containsKey(c))
					ht.put(c, new Integer("1"));
				else
					ht.put(c, (Integer)ht.get(c)+ 1);
			}
			
			for(int j =0;j<ch.length;++j){
				if( (Integer)ht.get(new Character(ch[j]))==1)
					return ch[j];
			}
			return 0;
			
		}
		
			
		 
	}
	
	public static boolean match(int start, int end, String s){
		if(end-start==0 ||
				(end-start==1 && (s.charAt(start)==s.charAt(end))
				 )
		   )
			return true;
		else{
			if(s.charAt(start)!=s.charAt(end))return false;
			else
				return match(start+1,end-1,s);
		}
		
	}
	
	public static boolean Anagram(String s1, String s2){
		
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		
		return false;
	} 
	
	static void byteArr(String str){
		
		byte b[] = str.getBytes();
		
		for(byte bb : b){
			System.out.print(bb);
		}
	}
	
	static void swapXOR(int x, int y){
		
		x = x^y; 
		y = x^y;
		x = x^y;
		
		System.out.print(x+" "+ y);
		
	}
	
	public static void main(String args[]){
		//swapXOR(1,2);
		//byteArr("abc");
		//System.out.print(isPalindrome("raar"));
		System.out.print(firstUniqueChar("aabbccac"));
		
	}
}
