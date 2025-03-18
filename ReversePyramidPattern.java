import java.util.Scanner;
public class ReversePyramidPattern  
{  
public static void main(String[] args)  
{  
    Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter No. of Rows:");
n = sc.nextInt();
if(5<n && n<50){
    
for (int i= 0; i<= n-1; i++)  
{  
for (int j=0; j<=i; j++)  
{  
System.out.print(" ");  
}  
for (int k=0; k<=n-1-i; k++)  
{  
System.out.print("*" + " ");  
}  
System.out.println();  
}  
}
else
{
    System.out.println("Invalid Input");
}
}
}