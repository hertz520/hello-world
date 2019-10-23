package javaStudy_exception;

import java.math.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Triangle {
    double a;
    double b;
    double c;
    double area(){
//        省略this关键字,应为this.a
        double p = (a+b+c)/2;
        return  Math.sqrt((p-a)*(p-b)*(p-c)*p);
    }
    double perimeter(){
        return a + b + c;
    }
    public static void main(String[] args){
        Triangle tri = new Triangle();
        Scanner scanner = null;
        try{
            scanner = new Scanner(System.in);
            tri.a = scanner.nextDouble();
            tri.b = scanner.nextDouble();
            tri.c = scanner.nextDouble();
//          边长大于0
           if(tri.a<0||tri.b<0||tri.c<0){
                throw (new belowZeroException());
//          两边之和大于第三边
           }else if(tri.a+tri.b<=tri.c||tri.a+tri.c<=tri.b||tri.c+tri.b<=tri.a){
               throw (new notTriException());
           }else{
               System.out.println(tri.perimeter());
               System.out.println(tri.area());
            }

        }catch(belowZeroException e){
            System.out.println("a edge is below 0,please enter edges again");
//            递归调用，传入空字符串数组
            main(new String[]{});
        }catch(notTriException e){
            System.out.println("it is not a triangle,please enter edges again");
            main(new String[]{});
        }finally{
            if(scanner != null) {
                scanner.close();
            }
        }
    }
}

class belowZeroException extends Exception{

}
class notTriException extends Exception{

}