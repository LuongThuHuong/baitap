package baitappp;

import java.util.Scanner;

public class baibonn{

	public static   void canDenTa(float a, float b, float c){
        float x1= 0.0F, x2 = 0.0F;
        float q= (float) Math.sqrt(Math.pow(b,2)-4*a*c);
        if( q < 0) System.out.println("Phương trinh vô ngiệm");
        else if(q == 0 ){
            x1 = -b/(2*a);
        }else {
            x1 = (-b+q)/(2*a);
            x2 = (-b-q)/(2*a);
        }
        
        if(x2 >= 0){
            if(x1==0) System.out.println("x2 = 0 " );
            else{
                System.out.format("x1 = %.3f\n",Math.sqrt(x2));
                System.out.format("x2 = %.3f\n",-1.0*Math.sqrt(x2));
            }
        }
        if(x1 >= 0) {
            if(x1==0) System.out.print("x1 = 0 " );
            else{
                System.out.format("x3 = %.3f\n",Math.sqrt(x1));
                System.out.format("x4 = %.3f\n",-1.0*Math.sqrt(x1));
            }
        }
        if(x2 < 0 || x2< 0) System.out.println("Vô nghiệm");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap a, b, c: ");
        float a= sc.nextFloat();
        float b= sc.nextFloat();
        float c= sc.nextFloat();
        canDenTa(a,b,c);

    }
}

