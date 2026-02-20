import java.util.Scanner;

class Main{

public static void main (String[] args) {
Scanner sc =new Scanner(System.in);
int num1=sc.nextInt();
char out=(num1>=90)?'A':(num1>=80)?'B':(num1>=70)?'C':(num1>=60)?'D':'F';
System.out.println(out);
}
}