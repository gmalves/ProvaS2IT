package com.masson.provas2it;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		Exercicio8 e = new Exercicio8();
		Integer c = e.exercicio8(10256, 512);
		
		System.out.println(c);
	}
	
	public Integer exercicio8(Integer a, Integer b) {
	    char[] aS= a.toString().toCharArray();
	    char[] bS = b.toString().toCharArray();
	    int t;
	    String result = "";
	    
	    if (aS.length > bS.length) {
	    	t = aS.length;
	    }else {
	    	t = bS.length;
	    }
	    
	    for(int i=0; i < t; i++) {

	    	if (i <= aS.length -1) {
	    		result = result + String.valueOf(aS[i]);
	    	}
	    	
	    	if (i <= bS.length -1) {
	    		result = result + String.valueOf(bS[i]);
	    	}
	    }
	    
	    System.out.println("Valor parcial: " + Integer.valueOf(result));
		if (Integer.valueOf(result) > 1000000) {
			return -1;
		}else {
			return Integer.valueOf(result);
		}		
	}
	
	
	
	
}
