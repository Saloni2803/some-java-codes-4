class Sample
{
int a,b;
Sample(int m,int n)
{
a=m;
b=n;
System.out.print(a+b);
}
Sample(Sample s)
{
a=s.a;
b=s.b;
System.out.print(a+b);
}
}
class copy
{
public static void main(String[] args)
{
Sample x=new Sample(10,20);
Sample x2=new Sample(x);
}
}
