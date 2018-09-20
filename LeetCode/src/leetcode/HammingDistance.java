package leetcode;

/**
 * @author zh
 *
 * 2018年9月20日
 */
public class HammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HammingDistance hammingDistance = new HammingDistance();
		System.out.println(hammingDistance.hammingDistance(1, 4));
	}
	
    public int hammingDistance(int x, int y) {
//        int result = 0;
//        int temp = x ^ y;
//        String str = Integer.toBinaryString(temp);
//        for(int i = 0; i < str.length(); i++) {
//        	if(str.charAt(i) == '1') {
//        		result++;
//        	} 
//        }
//        return result;
//    	//方法二
//    	return Integer.bitCount(x ^ y);
    	//方法三
        int result = 0;
        int temp = x ^ y;
        System.out.println(temp);
        for(int i = 0; i < 32; i++){
            result += (temp >> i) & 1;
        }
        return result;
    }

}
