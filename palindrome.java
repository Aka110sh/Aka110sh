-  import java.util.Scanner;
public class Boolean1{
  public static boolean Palindrome(String str) {
    for(int i=0;i<str.length()/2;i++){
        int n = str.length();
     if(str.charAt(i)!=str.charAt(n-1-i)){
       return false;
     }
    }
   return true;
}
public static void main(String args[]){
    Scanner obj = new Scanner(System.in);
    String str = obj.nextLine();
    System.out.println(Palindrome(str));
}
}
