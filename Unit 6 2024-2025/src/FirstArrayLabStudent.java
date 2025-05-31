import java.util.*;

public class FirstArrayLabStudent
{
   public static void main(String[] args)
   {
      int[] myArray = {1,2,6,4,9,10,2,-5,8};
      System.out.println("My max value in my array is " + maxValue(myArray));
      System.out.println("My min value in my array is " + minValue(myArray));
      System.out.println("My average value in my array is " + averageValue(myArray));
      System.out.println("My array in reverse is " + Arrays.toString(reverseArray(myArray)));
      
      //Second part. Random number between 1-10
      Scanner kb = new Scanner(System.in);
      System.out.println("Enter the length of the array: ");
      int length = kb.nextInt();
      int[] randArray = new int[length];
      for(int r = 0; r < randArray.length; r++) {
    	  randArray[r] = (int)(Math.random() * 15-5);
      }
      System.out.println(Arrays.toString(randArray));
      
   }//end of main
   
   //Input: array
   //Return max value in array
   
   public static int maxValue(int[] myA)
   {
	   int value = myA[0];
	   for(int i:myA) {
		   if(value < i) {
			   value = i;
		   }
	   }
	   return value;
   }
   
   //input: array
   //Return  the min value of array
    public static int minValue(int[] myA)
   {
 	   int value = myA[0];
 	   for(int i:myA) {
 		   if(value > i) {
 			   value = i;
 		   }
 	   }
 	   return value;
   }

    //input: array
    //Return  the average value of array
     public static double averageValue(int[] myA)
    {
  	   int sum = 0;
  	 for(int s:myA) 
 		sum += s;
 	return (double) sum / myA.length;
    }
   
   //imput: array
   //Return an ARRAY that is reverse
   public static int[] reverseArray(int[] myA)
   {
	   int[] newArray = new int[myA.length];
	   for(int i = 0; i <= myA.length - 1; i++) {
		   newArray[i] = myA[(myA.length - 1) - i];
	   }
	   /*for(int j:newArray) {
		   System.out.print(j+ " ");
	   }*/
	   return newArray;
   }//end of  method
   
   

}//end of class

