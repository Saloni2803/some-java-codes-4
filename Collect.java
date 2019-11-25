import java.util.*;
class Collect
{
public static void main(String args[])
{
LinkedList<Integer> li=new LinkedList<Integer>();
Scanner sc=new Scanner(System.in);
for(int i=0;i<5;i++)
{
int n=sc.nextInt();
li.add(n);
}
Collections.reverse(li);
Iterator i=li.iterator();
while(i.hasNext())
{
System.out.print(i.next());
}
}}