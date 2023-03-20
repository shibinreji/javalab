
class product
{
int pcode,price;
String pname;
product(int code,String name,int price1)
{
pcode=code;
pname=name;
price=price1;
}
void display()
{
System.out.println("produt code:"+pcode+"\nproduct name:"+pname+"\n product price :"+price+"\n");
}
public static void main(String args[])
{
product p1=new product(111,"book",300);
product p2=new product(222,"pen",100);
product p3=new product(333,"bag",800);
System.out.println("product p1\n ");
p1.display();
System.out.println("product p2\n ");
p2.display();
System.out.println("product p3\n ");
p3.display();


if(p1.price<p2.price && p1.price<p3.price)
{
System.out.println("product p1 has lowest price");
}
else if(p2.price<p1.price &&  p2.price<p3.price)
{
System.out.println("product p2 has lowest price");
}
else
{
System.out.println("product p3 has lowest price");
}
}
}

