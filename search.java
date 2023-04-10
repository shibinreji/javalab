 import java.util.Scanner;

class search
{
public static void main(String args[])
{
int i,key,n,f=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the limit");
n=sc.nextInt();
int array[]=new int[n];
System.out.println("enter the elemnts:");

for(i=0;i<n;i++)
{
array[i]=sc.nextInt();
}
System.out.println("the elemnts are:");
for(i=0;i<n;i++)
{
System.out.print("\t"+array[i]+"\t");
}
System.out.println("\nenter the element to be searched");
key=sc.nextInt();
for(i=0;i<n;i++)
{
if(key==array[i])
{
System.out.println("element found at position:"+ i);
f=1;
}
}
if(f==0)
{
System.out.println("element not found");
}
}
}
