import java.util.Scanner;

class NumberPad {

	/**
	 * @param args
	 */


	private static String trimOneZero(String str){
		
		String newStr = "";
		int i=0;
		
		while(i<str.length()){
		if(str.charAt(i)!='0' && str.charAt(i)!='1')
			newStr += str.charAt(i);
		i++;
		}
		
		return newStr;
	} 
	
	private static void printSequences(String prefix, String str, int startIndex){
		
		int len = str.length() - startIndex;
		
		if(len == 0){
			System.out.println(prefix);
			return;
		}
		
		int in = str.charAt(startIndex) - 48;
		int strLen = map[in].length();
		
		for(int i=0;i<strLen;i++){
			prefix += map[in].charAt(i);
			printSequences(prefix, str, startIndex+1);
			prefix = prefix.substring(0, prefix.length()-1);
		}
		
	}
	
	private static String map[] = new String[10];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//could add map[0],map[1] 
		//But trimming zeros and ones will have less recurvise calls
		
		
		map[2] = "ABC";
		map[3] = "DEF";
		map[4] = "GHI";
		map[5] = "JKL";
		map[6] = "MNO";
		map[7] = "PQRS";
		map[8] = "TUV";
		map[9] = "WXYZ";
		
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		String trimmedStr = trimOneZero(number);
		System.out.println(trimmedStr);
		
		printSequences("",trimmedStr,0);
		
		
		
		

	}

}
