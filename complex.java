import java.util.Scanner;
class complex
{
int real;
int imginary;
int i;
void display()
{
 Scanner e=new Scanner(System.in);
real=e.nextInt();
imginary=e.nextInt();
System.out.print(real+"+"+imginary+"i");	
}	
}
class real
{
public static void main(String args[])

{

	complex z=new complex();

z.display();  
}
}