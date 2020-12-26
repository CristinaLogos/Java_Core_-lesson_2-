	package ua.lviv.lgs;

	public class Applicqation {

		public static void main(String[] args) {
			
			/*int a = -1;
			byte b = 23;
			short s = -365;
			long l = 56l;
			double d = 25.5;
			float f = -3.67f;
			char c = 5625184;
			boolean o = false; */
		
		
					
			
		/*System.out.println( "Integer max = " + Integer.MAX_VALUE);
		System.out.println( "Integer min = " + Integer.MIN_VALUE);
		
		System.out.println( "Byte max = " + Byte.MAX_VALUE);
		System.out.println( "Byte min = " + Byte.MIN_VALUE);
		
		System.out.println( "Short max = " + Short.MAX_VALUE);
		System.out.println( "Short min = " + Short.MIN_VALUE);
		
		System.out.println( "Long max = " + Long.MAX_VALUE);
		System.out.println( "Long min = " + Long.MIN_VALUE);
		
		System.out.println( "Double max = " + Double.MAX_VALUE);
		System.out.println( "Double min = " + Double.MIN_VALUE);
		
		System.out.println( "Float max = " + Float.MAX_VALUE);
		System.out.println( "Float min = " + Float.MIN_VALUE);
		
		System.out.println( "Character max = '\uffff'" );
		System.out.println( "Character min = '\u0000'");
		
		System.out.println( "Boolean  = True or False" );*/
			
			
			
			int[] nums = new int[]{8903,56,89,24,68,-389,1176,-8,0,-3695};
			 
			 int x = nums[0];
			 int y = nums[0];
			 
			 for(int i = 0; i < nums.length; i++) {
			 		   
			    if(nums[i] >= x) {
			   
			      x= nums[i];
			    }
			    if(nums[i] <= y)
			       y = nums[i];
			   	}
			 		 
			 System.out.println("Максимальне значення масиву: " +x +"  "+"Мінімальне значення масиву: " +y);
			
		
	}
}
