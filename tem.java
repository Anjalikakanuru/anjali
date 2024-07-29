import java.util.*;
class tem
{
public static void main(String args[])
{
int temperature;
System.out.println("Enter the value to convert the temperture into celsusis");
Scanner in=new Scanner(System.in);
temperature=in.nextInt();
temperature=((temperature-32)*5)/9;
System.out.println("the celsusis value is "+temperature);
}
}

