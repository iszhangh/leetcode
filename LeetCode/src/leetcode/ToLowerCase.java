package leetcode;

/**
 * @author zh
 *
 * 2018Äê9ÔÂ19ÈÕ
 */
public class ToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToLowerCase aCase = new ToLowerCase();
		System.out.println(aCase.toLowerCase(""));
	}

    public String toLowerCase(String str) {
        if(str == null && str.length() == 0)
        	return str;
        char c = ' ';
        int temp = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
        	if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
        		temp = (int)str.charAt(i) + 32; 
        		c = (char)temp;
        		stringBuilder.append(c);
        	}else {
        		stringBuilder.append(str.charAt(i));
        	}
        }
        return stringBuilder.toString();
    }
}
