class FizzBuzz{

		public static void main (String[]args){
		
		// Declare variables
		
				String fizz;
				String buzz;
				String FizzBuzz;
		
		// Lets make a FizzBuzz loop
		
		
		for (int i=1; i <=100; i++) {
		
			if( i % 3 == 0){                            // Multiples of 3 will have output of "Fizz"
			
				System.out.println("Fizz");
				
			}else if(i % 5 == 0){                 // Multiples of 5 will have output of "Buzz"
					
					System.out.println("Buzz");
					
			} else if( i % 5 == 0 && i % 3 == 0){           //Multipes of 5 and 3 will have output of "FizzBuzz"
					
					System.out.println("FizzBuzz");
					
			}else{
					
					System.out.print(i);
					}
					
					}
				}
		
		
		}