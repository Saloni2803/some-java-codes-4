import java.util.*;
import java.io.*;
class compare
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String k;
k=s.next();
String j;
j=s.next();
int t;
t=j.compareTo(k);
System.out.println(t);
if(t>0)
System.out.print(k+"is greater");
if(t<0)
System.out.print(k+"is smaller");
if(t==0)
System.out.print("both are equal");
}
}