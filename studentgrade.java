import java.util.Scanner;
public class studentgrade
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter science marks out of 100 :");
        int m1=input.nextInt();
        System.out.print("Enter maths marks out of 100: ");
        int m2=input.nextInt();
        System.out.print("Enter english marks out of 100: ");
        int m3=input.nextInt();
        System.out.print("Enter hindi marks out of 100: ");
        int m4=input.nextInt();
        System.out.print("Enter social science marks out of 100: ");
        int m5=input.nextInt();
        int sum=0;
        sum=m1+m2+m3+m4+m5;
        System.out.println("sum of all subject is : "+sum);
        double percentage;
        percentage=sum/5.0;
        System.out.println("percentage of student is: "+percentage+ "%");
        String division="";
		
		if(percentage >=60)
		{
			division="first";
		}
		else if(percentage >=50)
		{
			division="second";
		}
		else if(percentage >=40)
		{
			division="third";
		}
		else
		{
			division="fail";
		}
        System.out.println("division: "+division );
    }
}