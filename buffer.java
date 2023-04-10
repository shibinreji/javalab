import java.util.*;

class buffer
{
int choice;
void manipulation()
{
Scanner sc=new Scanner(System.in);
String a;
System.out.println("enter the string");
a=sc.nextLine();
do
{
System.out.println("\nSTRING METHODS");
System.out.println("\n1.toupper\n2.tolower\n3.concatination\n4.replace\n5.length\n6.tochararray\n7.indexof substring");
System.out.println("enter the choice:");
choice=sc.nextInt();
switch(choice)
{
case 1 :System.out.println("string in upper case: "+a.toUpperCase());
	break;
case 2 :System.out.println("string in lowercase: "+a.toLowerCase());
	break;
case 3 :String s;
        System.out.println("emter a string for concat:");
        s=sc.next();
        System.out.println("string concatnation "+ a.concat(s));
	break;
case 4 :System.out.println("STRING REPLACE IS: "+  a.replace("s","h"));
	break;
case 5 :System.out.println("STRING LENGTH IS: " + a.length());
	break;
case 6 : char charArray[] = a.toCharArray();
	  for(char i : charArray)
           {
	
             System.out.println(i+"\t");
           }
	break;
case 7 :System.out.println("enter the substring");
        String sub=sc.next();
	System.out.println("the position of sustring is "+ a.indexOf(sub));
 	break;
default:System.out.println("enter valid choice");
	break;
}
}
while(choice!=7);
}
public static void main(String args[])
{
buffer obj=new buffer();
obj.manipulation();
}}

