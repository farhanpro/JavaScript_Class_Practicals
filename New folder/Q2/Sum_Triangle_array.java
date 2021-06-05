public class Sum_Triangle_array {
	   
	    static void sum(int mat[][], int r, int c) 
	    { 
	        int i, j; 
	        int upper_right_sum = 0; 
	        int lower_left_sum = 0; 
	        int upper_left_sum = 0;
	        int col=c-1;
	        
	        /*calculate sum of upper right triangle*/
	        for (i = 0; i < r; i++) 
	            for (j = 0; j < c; j++)  
	            { 
	                if (i <= j)  
	                { 
	                    upper_right_sum += mat[i][j]; 
	                } 
	            } 
	      
	        System.out.println("Upper Right sum is " + upper_right_sum); 
	          
	        /*calculate sum of lower left triangle*/
	        for (i = 0; i < r; i++) 
	            for (j = 0; j < c; j++)  
	            { 
	                if (j <= i)  
	                { 
	                    lower_left_sum += mat[i][j]; 
	                } 
	            } 
	      
	        System.out.println("Lower Left sum is " + lower_left_sum); 
	        
	        /*calculate sum of upper left triangle*/
	        for(i= 0; i < r; i++) {
	        	for(j = 0; j <= col; j++) 
	        	{
	        			upper_left_sum += mat[i][j];
	        		
	        	}
	        	col--;
	        	}
	        System.out.println("Upper Left sum is " + upper_left_sum);
	    }
	    
	           
	    public static void main (String[] args) 
	    { 
	        int r = 3; 
	        int c = 3; 
	      
	        int mat[][] = { 
			                { 6, 9, 1 }, 
	                        { 4, 2, 6 }, 
	                        { 8, 9, 3 } 
							};
	        
	        sum(mat, r, c); 
	    } 
	} 

