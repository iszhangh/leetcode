package leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zh
 *
 * 2018年9月18日
 */
public class SortArrayByParity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1};
		SortArrayByParity arrayByParity = new SortArrayByParity();
		System.out.println(Arrays.toString(arrayByParity.sortArrayByParity(arr)));
	}
	
    public int[] sortArrayByParity(int[] A) {
    	if(A == null && A.length == 0)
    		return A;
    	List<Integer> oddList = new ArrayList<>();
    	List<Integer> evenList = new ArrayList<>();
    	for(int i = 0; i < A.length; i++) {
    		if(A[i] % 2 == 1) {
    			oddList.add(A[i]);
    		}else {
    			evenList.add(A[i]);
    		}
    	}
    	for(int j = 0; j < evenList.size(); j++) {
    		A[j] = evenList.get(j);
    	}
    	for(int k = evenList.size(); k < oddList.size() + evenList.size(); k++) {
    		A[k] = oddList.get(k - evenList.size());
    	}
    	
//    	//方法二
//    	if(A == null && A.length == 0)
//    		return A;
//    	int head = 0;
//    	int rear = A.length - 1;
//    	while(head <= rear && head < A.length && rear >= 0) {
//    		if(A[head] % 2 == 0 && A[rear] % 2 == 1) {
//    			head++;
//    			rear--;
//    			continue;
//    		}
//    		if(A[head] % 2 == 1 && A[rear] % 2 == 0) {
//    			int temp = 0;
//    			temp = A[head];
//    			A[head] = A[rear];
//    			A[rear] = temp;
//    			head++;
//    			rear--;
//    			continue;
//    		}
//    		if(A[head] % 2 == 1 && A[rear] % 2 == 1) {
//    			rear--;
//    			continue;
//    		}
//    		if(A[head] % 2 == 0 && A[rear] % 2 == 0) {
//    			head++;
//    			continue;
//    		}
//    	}
    	
        return A;
    }
    
}
