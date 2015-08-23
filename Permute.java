import java.io.*;

public class Permute {
	
	
	void permute( String str ){
	    int          length = str.length();
	    boolean[]    used = new boolean[ length ];
	    StringBuffer out = new StringBuffer();
	    char[]       in = str.toCharArray();

	    doPermute( in, out, used, length, 0 );
	}

	void doPermute( char[] in, StringBuffer out,
	                boolean[] used, int length, int level ){
	    if( level == length ){
	        System.out.println( out.toString() );
	        return;
	    }

	    for( int i = 0; i < length; ++i ){
	        if( used[i] ) continue;

	        out.append( in[i] );
	        used[i] = true;
	        doPermute( in, out, used, length, level + 1 );
	        used[i] = false;
	        out.setLength( out.length() - 1 );
	    }
	}

	
	
	
	
	
	///permute with swap
	public static void swap(char[] set, int first, int second) //java doesn't allow the same pass by reference like C++
	{
	        char ch = set[second]; //so we pass the char array and assign, since this will hold
	        set[second] = set[first]; //swap the values
	        set[first] = ch;
	}
	
	public static int permute(char[] set, int begin, int end)
	{
	        int i;
	        int range = end - begin;
	        if (range == 0) {
	                System.out.println(set); //print out each permutation
	        } else {
	                for(i=0; i<=range; i++) {
	                        swap(set, begin, begin+i);		//initial swap
	                        permute(set, begin+1, end);		//recursion
	                        swap(set, begin, begin+i);       //swap back
	                }
	        }
	        return 0;
	}
	
	
	static void  combine( String str ){
	    int           length = str.length();
	    char[]        instr = str.toCharArray();
	    StringBuilder outstr = new StringBuilder();
	    doCombine( instr, outstr, length, 0, 0 );
	}

	static void doCombine( char[] instr, StringBuilder outstr, int length,
	                int level, int start ){
	    for( int i = start; i < length; i++ ){
	        outstr.append( instr[i] );
	        System.out.println( outstr.toString() );

	        if( i < length - 1 ){
	            doCombine( instr, outstr, length, level + 1, i + 1 );
	        }

	        outstr.setLength(outstr.length() - 1);
	    }
	}

	
	

	//***************TEST EXAMPLE********************
	public static void main(String[] args) {
		
		char[] test = {'a','b','c'};
		//permute(test, 0, 2);
		combine("abc");
	}

}