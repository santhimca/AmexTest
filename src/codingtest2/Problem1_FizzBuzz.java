package codingtest2;


public class Problem1_FizzBuzz {
    
    public static void main(String[] args) {
        Problem1_FizzBuzz fb = new Problem1_FizzBuzz();
        fb.print();
        
       
    }
    public void print() {
        //Requirements: Output the numbers 1-100, with one number on every row.
        //	If the number is a multiple of 3 output an F instead of the number.
        //	If the number is a multiple of 5 output an B instead of the number.
        //	If the number is a multiple of 15 output output an FB instead of the number.
         for (int i=1; i<=100; i++) {
            boolean flag = false;
            if (i % 3 == 0) {
                System.out.println("F"); 
                flag = true;
            }
            else if (i % 5 == 0) {
                System.out.println("B"); 
                flag = true;
            }
            else if (i % 15 == 0) {
                System.out.println("FB"); 
                flag = true;
            }
            if (!flag) {
                System.out.println(i);
                
            }
        }
        
    }
}
