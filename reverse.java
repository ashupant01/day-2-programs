package reverse;

public class reverse {

	public static void main (String[] args) {
		
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a no");
	        int n = sc.nextInt();
	        int i,sum=0;
	 
	 for(i=0;i<=n;i++)
	 {
	 sum = sum + i;
	 }  
	 
	 System.out.println("Sum of first "+n+" natural nos = "+sum);
	    }
	}
	 sum of numbers
	public static void main(String[] args) {

	    int num = 1234, reversed = 0;
	    
	    System.out.println("Original Number: " + num);

	    // run loop until num becomes 0
	    while(num != 0) {
	    
	      // get last digit from num
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;

	      // remove the last digit from num
	      num /= 10;
	    }

	    System.out.println("Reversed Number: " + reversed);
	  }
	}

	}

}
