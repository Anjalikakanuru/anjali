import java.util.Scanner;
class Num
{
public static void main(String args[])
{
int x;
System.out.println("Enter the value to decide the value is even or odd");
Scanner in=new Scanner(System.in);
x=in.nextInt();
if(x%2==0)
System.out.println("The value is even");
else
System.out.println("The value is odd");
}
}

