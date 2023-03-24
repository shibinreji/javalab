import java.util.Scanner;

class leap
{
public static void main(String args[])
{
Scanner n=new Scanner(System.in);
int start,end;
System.out.println("enter the starting year:");
start=n.nextInt();
System.out.println("enter the ending year:");
end=n.nextInt();
System.out.println("leap years are:");

for(int i=start;i<=end;i++)
{
 if((i%4==0)||(i%100!=0) && (i%400==0))
 System.out.println(i);
}
}
}

