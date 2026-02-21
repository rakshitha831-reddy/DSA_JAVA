// import java.util.Scanner;
// public class Consonents {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         StringBuilder sb = new StringBuilder(s);
//         for (int i = 0; i < sb.length(); i++) {
//             char c = sb.charAt(i);
//             if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
//                 sb.deleteCharAt(i);
//                 i--;
//             }
//         }
//         System.out.println(sb.toString());
//     }
// }


import java.util.Scanner;
public class Consonents {
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
StringBuilder sb = new StringBuilder(s);
String ch ="aeiouAEIOU";
System.out.println(sb.toString());
for(int i=0;i<sb.length();i++) {
    char c = sb.charAt(i);
    if(ch.indexOf(c)!=-1) {
        sb.deleteCharAt(i);
    }
}
System.out.println(sb.toString());
      }
    }