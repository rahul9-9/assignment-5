import java.util.Scanner;

class rectangle

{
int l;
int b;
int m;
void calculatearea()
{
Scanner z=new Scanner(System.in);
l=z.nextInt();
b=z.nextInt();
m=l*b;
System.out.print(m);	

	}
}
class area
{
public static void main(String args[])
{
rectangle p=new rectangle();
p.calculatearea();  
}
}