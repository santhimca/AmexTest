package codingtest2;


public class Problem2_Recursion {
    public static void main(String[] args) {
        Problem2_Recursion rec = new Problem2_Recursion();
		String inputStr = "String to reverse";
		String outputStr = rec.reverseString(inputStr);
		System.out.println(outputStr);
    }
	public String reverseString(String inputStr) {
		//Requirements: reverse the input string by using recursion.
                
                String reverse = "";
                //System.out.println("str length-->" + inputStr.length());
                if (inputStr.length() == 1) { 
                    return inputStr; 
                } else{
                    reverse += inputStr.charAt(inputStr.length() - 1) + reverseString(inputStr.substring(0, inputStr.length()-1));
                    return reverse;
                }
	}
}
