import.java.util.Scanner;
class electbill
{
int consumer no.;
String consumerName;
int prevReading;
int currReading;
String EB conn;
double Bill;
void input_data()
{
Scanner sc=new Scanner(System.in);
system out.println("\n enter consumer number:");
Consumer no.=sc.nextInt();
system.out.println("\n enter previous units");
prevReading=sc.nextInt();
System.out.println("enter current units consument:");
currReading=sc.nextInt();
system.out.in("enter the type of EB connection(domestic or commercial)");
EB conn=sc.next();
}
double calculate_bill()
{
int choice;
if(EB Conn=="domestic")
choice=1;
else
choice=2;
switch(choice)
{
case 1:
if(currReading)=0&&currReading<=100)
Bill=currReading*1;
else if(currReading>100&&currReading<=200)
Bill=(100*1)+((currReading-100)*2.50);
else if(currReading>200&&currReading<=500)
Bill=(100*1)+(100*2.50)+((currReading-200)*4);
else
Bill=(100*1)+(100*2.50)+(300*4)+((currReading-500)*6);
break;
case 2:
if(currReading>=0&&currReading<=100);
Bill=currReading*2;
else if(currReading>100&&currReading<=200)
Bill=(100*1)+((currReading-100)*4.50);
else if(currReading>200&&currReading<=500)
Bill=(100*1)+(100*2.50)+((currReading-200)*6);
else
Bill=(100*1)+(100*2.50)+(300*4)+((currReading-500)*7);
break;
}
return Bill;
}
Void display()
{
System.out.println("___________");
System.out.println("ELECTRICITY BILL");
System.out.println("___________");
System.out.println("consumer number:"+consumer no.);
System.out.println("consumer name:"+consumer Name);
System.out.println("consumer previous unit:"+prevReading);
System.out.println("consumer current units":+currReading);
System.out.println("type of EB connection:"+EB conn);\
System.out.println("___________");
System.out.println("total amount(Rs.):"+bill);
}
}
Class elect BillGen
{
public static void main(String[]args)
{
electBill b=new electBill();
b.input_data();
b.calculate_Bill();
b.display();
}
}