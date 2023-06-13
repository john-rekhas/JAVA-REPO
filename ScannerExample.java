import java.util.Scanner;

class  ScannerExample {
public static void main(String args[]) {
System.out.println("Enter your name:");
Scanner sc = new Scanner(System.in);
String name = sc.nextLine();

System.out.println("Enter Your Integer Value:");
int a = sc.nextInt();


System.out.println("Enter Your Float Value:");
float b = sc.nextFloat();


System.out.println("Enter Your Short Value:");
short c = sc.nextShort();


System.out.println("Enter Your  Byte Value:");
byte d = sc.nextByte();

System.out.println("Enter Your Long Value:");
long e = sc.nextLong();


System.out.println("Enter Your Double Value:");
double f = sc.nextDouble();


System.out.println("Enter Your Boolean Value:");
boolean g = sc.nextBoolean();


System.out.println("Enter Your Character:");
char h = sc.next().charAt(1);




System.out.println("Your name is" + name);
System.out.println("Integer Value is" + a);
System.out.println("Float Value is" + b);
System.out.println("Shoet Value is" + c);
System.out.println("Byte Value is" + d);
System.out.println("Long Value is" + e);
System.out.println("Double Value is" + f);
System.out.println("Boolean Value is" + g);
System.out.println("Enter Your Character" + h);
   }
}