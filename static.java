import java.util.Scanner;
class test
{
int r;
static int count;
static{System.out.println("java");
int count=10;}
static{System.out.println("static"+count);}
{System.out.println("static2");}
{System.out.println("static3");}

test()
{
System.out.print("static4");
}
}
class main
{
public static void main(String[] args)
{
test t=new test();
test t2=new test();

}

}