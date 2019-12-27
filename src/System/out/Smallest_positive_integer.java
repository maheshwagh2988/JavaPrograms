package System.out;
// you can also use imports, for example:
import java.util.*;
import java.util.Set;
import java.util.TreeSet;

public class Smallest_positive_integer {
	int solution(int[] A) {
        int n = 0;
        while (contains(A, ++n)){}
        return n;
    }
	/*
	public int solution(int[] A) {
	       Set<Integer> set = new TreeSet<Integer>();

	        for (int a : A) {
	            set.add(a);
	        }

	        int N = set.size();

	        int[] C = new int[N];

	        int index = 0;

	        for (int a : set) {
	            C[index++] = a;
	        }

	        for (int i = 0; i < N; i++) {

	            if (C[i] > 0 && C[i] <= N) {
	                C[i] = 0;
	            }
	        }

	        for (int i = 0; i < N; i++) {

	            if (C[i] != 0) {
	                return (i + 1);
	            }
	        }

	        return (N + 1);
	    }
	    */

	private boolean contains(int[] a, int i) {
		// TODO Auto-generated method stub
		return false;
	}
	}





