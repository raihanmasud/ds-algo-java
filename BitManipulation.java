
public class BitManipulation {

	static byte reverseBits(byte n, int size){
		byte rev =0;
		
		for(int i=0;i<size;i++){
			rev = (byte) ((rev<<1)| (n&1));
			
			System.out.println(" "+rev);
			n>>=1;
		}
		
		return rev;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(reverseBits((byte)1, 8));
	}

}
