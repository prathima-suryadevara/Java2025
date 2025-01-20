import java.util.Scanner;

public class VowelsInWord {
    public static void main(String[] args) {
        System.out.println("Please enter a word ");
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        word=word.toLowerCase();
        int count=0;
        for(int i=0;i<word.length();i++)
        {
           // int count=0;
            char ch=word.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;

            }
        }
        System.out.println(count);
        sc.close();
    }
    
}
