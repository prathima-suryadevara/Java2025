import java.util.Scanner;

public class Code1 {
    public static int lengthOfSubstring(String s) {
        int[] charIndex = new int[128];
        int a=0;
        int l=0;        
        for (int i= 0;i<s.length();i++) {
            char c=s.charAt(i);
            a= Math.max(a, charIndex[c]);
            l= Math.max(l,i-a+1);
            charIndex[c] = i+1;
        }
    return l;
    }
    public static void main(String[] args) {
        Scanner word=new Scanner(System.in);
        System.out.println("Please enter a string");
        String s=word.nextLine();
        System.out.println("Length of Longest Substring Without Repeating Characters: " + lengthOfSubstring(s));
        word.close();
    }
}
