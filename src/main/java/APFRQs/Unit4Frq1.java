package APFRQs;

public class Unit4Frq1{
  /*
  The method longestStreak is intended to determine the longest substring of consecutive identical characters in the parameter str and print the result.
  For example, the call longestStreak("CCAAAAATTT!") should print the result "A 5" because the longest substring of consecutive identical characters is "AAAAA".
  */

    public static void main(String args[]){

        longestStreak("CAAAAAAT");
    }

    // Could have also taken a recursive approach where a base case and recursive method was used instead of iteration.

    public static void longestStreak(String str){
        int strlen = str.length();
        char longest = str.charAt(0); //Also used charAt method
        int longestnum = 0;

        for(int i=0; i<strlen;i++){
            int maxchar = 1;

            for(int j=i+1;j<strlen;j++){
                if(str.charAt(i) != str.charAt(j)){
                    break;
                } else {
                    maxchar++;
                }
            }

            if(maxchar > longestnum){
                longestnum = maxchar;
                longest = str.charAt(i);
            }

        }
        System.out.println(longest + " " + longestnum);
    }

// 5/5. We got this question correct by using a iterative method to loop through the string and find the longest streak of characters in the question. This code works for any input, which means the task was completed successfully. CORRECT FROM CLASS ANSWERS.


}







