package leetcode;

import java.util.HashMap;

public class NumJewelsInStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String J = "aA";
		String S = "aAAbbbb";
		System.out.println(numJewelsInStones(J, S));
	}
	
    public static int numJewelsInStones(String J, String S) {
//        int result = 0;
//        HashMap<Integer,Character> map = new HashMap<>();
//        for (int i = 0; i < J.length(); i++) {
//			map.put(i, J.charAt(i));
//		}
//        for(int j = 0; j < S.length(); j++) {
//        	if(map.containsValue(S.charAt(j))) 
//        		result++;
//        }
//        return result;
    	return S.replaceAll("[^" + J + "]", "").length();	//采用正则表达式方式解决
    }

}
