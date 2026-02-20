/*import java.util.Scanner;
class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n=sc.nextInt();
        for(int i=1;i<=10;i++)
{
        System.out.println(i+"x"+5+"="+(i*5));
}
}
}*/


/*import java.util.Scanner;
class even {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
for(int i=2;i<=20;i+=2)
{
System.out.println(i);
}}
}*/



/*import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long factorial = 1;

        for(int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}*/


/*import java.util.Scanner;
class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int num=sc.nextInt();
 System.out.print("Factors of : "+num);
 for(int i=1;i<=num;i++)
{
if(num%i==0)
{
System.out.println(i);
}
}
}
}*/



/*import java.util.Scanner;

class Menu{
    public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		int order=0;
		int e=0;
		do{
			System.out.println("1.Dosa/t2.Idly/t3.Poori/t4.Chappati/t5.Exit");
			order=sc.nextInt();
			if(order==1){
				System.out.println("1.Normal/t2.Masala/t3.Set/t4.Onion/t5.Kaaram");
				e=sc.nextInt();
			}
			else if(order==2){
				System.out.println("1.Normal/t2.Podi/t3.Ghee/t4.Millets/t5.Carrot");
				e=sc.nextInt();
			}
		}while(order!=5);
		System.out.print("Full");
	}
}*/





/*import java.util.Scanner;

class Bye {
 public static void main (String[] args){
Scanner sc=new Scanner(System.in);

bye:
for(int i=0;i<5;i++) {
for(int j=0;j<5;j++) {
if(i==0)
break bye;
System.out.println(i);
}
}
}}*/



import java.util.Scanner;

class program5 {
 public static void main (String[] args){
Scanner sc=new Scanner(System.in);

bye:
for(int i=0;i<5;i++) {
for(int j=0;j<5;j++) {
if(i==1)
continue bye;
System.out.println(i);
}}
}}







