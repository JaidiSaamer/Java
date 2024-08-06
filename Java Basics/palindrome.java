// public class palindrome {
//     // WAP to check a palindrome and return value in Boolean
//     // hint - use data type boolean

//     static boolean isPalindrome(String s){
// //  Remove non-alphanumeric characters and convert to lowercase
//         String cleaned = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

// //  Check if the cleaned string is equal to its reverse
//         int length = cleaned.length();
//         for(int i = 0; i < length / 2; i++){
//             if(cleaned.charAt(i) != cleaned.charAt(length - 1 - i)){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         // Example usage
//         String inputString1 = "A man, a plan, a canal, Panama";
//         System.out.println(isPalindrome(inputString1));

//         String inpuString2 = "Hello, world!";
//         System.out.println(isPalindrome(inpuString2));

//         System.out.println(isPalindrome("Sa!a@s"));  // ->true  
        
//     }
// }




import java.util.*;   
class palindrome 
{  
   public static void main(String args[])  
   {  
      String original, reverse = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
   }  
}  
