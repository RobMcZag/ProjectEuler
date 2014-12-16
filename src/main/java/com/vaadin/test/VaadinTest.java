package com.vaadin.test;

public class VaadinTest {

	public VaadinTest() {
		// TODO Auto-generated constructor stub
	}

    /**
     * Mixes digits from the input integers to form the output. Picks one digit
     * at a time from the input numbers, starting from the first digit in the
     * first number, continuing with the first digit in the second number, then
     * the second digit in the first number etc.
     * <p>
     * Example input: 1234, 56 -> output: 152634
     * 
     * Example input: 56, 1234 -> output: 516234
     * 
     * @param A
     *            the first input number
     * @param B
     *            the second input number
     * @return a mix of A and B
     */
    private static int oldSolution(int A, int B) {
    	int solution = 0;
    	String AString = Integer.valueOf(A).toString();
    	String BString = Integer.valueOf(B).toString();
    	
    	int aLen = AString.length();
    	int bLen = BString.length();
    	
    	StringBuilder sb = new StringBuilder();
    	int i = 0;
    	for(; i < Math.min(aLen, bLen);i++) {
    		sb.append(AString.charAt(i));
    		sb.append(BString.charAt(i));    		
    	}
    	
    	if(aLen > bLen) {
    		sb.append(AString.substring(i));
    	} else {
    		sb.append(BString.substring(i));
    	}
    	
    	return Integer.parseInt(sb.toString());
    	
    }
    
    private static int solution(int A, int B) {

    	int result = 0;
    	
    	int a = A;
    	int b = B;
    	int mult = 1;

    	while(Math.max(a, b) > 1) {
    		if ( hasMoreDigits(a , b) ) {
    			result = result + mult *  (a % 10);
    			a = a / 10;
    		} else if ( hasMoreDigits(b , a) ) {
    			result = result + mult *  (b % 10);
    			b = b / 10;
    		} else {
       			result = result + mult *  (b % 10);
        		mult = mult *  10;
    			result = result + mult *  (a % 10);
    			a = a / 10;
    			b = b / 10;       		    			
    		}

    		mult = mult *  10;
    		
    	}
    	
    	return result;
    	
    }
    
    
	private static boolean hasMoreDigits(int a, int b) {
		while (Math.min(a, b) >= 1) {
			a = a / 10;
			b = b / 10;
		}
		if (a >= 1) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
        System.out.println(solution( 56, 1234));
    }

    
}
