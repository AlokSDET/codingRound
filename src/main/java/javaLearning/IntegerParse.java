package javaLearning;

public class IntegerParse {


	    public static void main(String args[]) 
	    { 
	        int decimalExample = Integer.parseInt("20"); 
	        int signedPositiveExample = Integer.parseInt("+20"); 
	        int signedNegativeExample = Integer.parseInt("-20"); 
	        int radixExample = Integer.parseInt("20", 16); 
	        int stringExample = Integer.parseInt("geeks", 29); 
	  
	        System.out.println(decimalExample); 
	        System.out.println(signedPositiveExample); 
	        System.out.println(signedNegativeExample); 
	        System.out.println(radixExample); 
	        System.out.println(stringExample); 
	        
	        Integer obj = new Integer(10); 
	        
	        // Returns an Integer instance 
	        // representing the specified int value 
	        System.out.println("Output Value = "
	                           + obj.valueOf(85)); 
	        
	        String s = "77"; 
	        
	        // Primitive int is returned 
	        int str = Integer.parseInt(s); 
	        System.out.println(str); 
	  
	        // Integer object is returned 
	        Integer str1 = Integer.valueOf(s); 
	        System.out.print(str1);
	        
	        int val = 99; 
	        
	        try { 
	  
	            // It can take int as a parameter 
	            int val2 = Integer.valueOf(val); 
	            System.out.print(val2); 
	  
	            // It cannot take an int as a parameter 
	            // Hence will throw an exception 
	      //      int val3 = Integer.parseInt(val); 
	           // System.out.print(val3); 
	        } 
	        catch (Exception e) { 
	            System.out.print(e); 
	        } 
	    
	} 

}
