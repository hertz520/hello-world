package javaStudy17_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
    String name;
    String sex;
    int age;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Person sb = new Person();
        try{
           if(scan.hasNext()){
               sb.name = scan.next();
           }
           if(scan.hasNext()){
               sb.sex = scan.next();

//               this is strange question
//               male
//               System.out.println(sb.sex);
//               false
//               System.out.println(sb.sex == "male" );
//               true
//               System.out.println(sb.sex.equals("male") );

//               you cannot use sb.sex!="male"&&sb.sex!="female"
               if(!(sb.sex.equals("male")||sb.sex.equals("female")) ){
                   throw (new sexException());
               }
           }
           if(scan.hasNextInt()){
               sb.age = scan.nextInt();
               if(sb.age>=120||sb.age<0) {
                   throw (new belowZeroException2());
               }
           }
        }catch(sexException e){
            System.out.println("sex is not female or male,please enter again");
            main(new String[]{});
        }catch(belowZeroException2 e){
            System.out.println("year error,please enter again");
            main(new String[]{});
        }catch(InputMismatchException e){
            System.out.println("format error,please enter again");
            main(new String[]{});
        }
        System.out.println(sb.name);
        System.out.println(sb.sex);
        System.out.println(sb.age);
    }

}
class sexException extends Exception{}
class belowZeroException2 extends Exception{}