import java.util.Scanner;

public class Complex{
double real;
double image;

Complex(double real,double image)
{
	this.real=real;
	this.image=image;
}
	public double getReal(){
		return real;
	}
	public void setReal(double real){
		this.real=real;
	}
	public double qetlmage(){
	return image;
	}
	public void setlmage(double image){
		this.image=image;
	}
	Complex add(Complex a){
		double real2=a.qetReal();
		double image2=a.qetlmage();
		double newReal=real+real2;
		double newlmage=image+image2;
		Complex result=new Complex(newReal,newlmage);
		return result;
	}
	Complex sub(Complex a){
	double real2=a.qetReal();
	double image2=a.qetReal();
	double newReal=real*real2;
	double newlmage=image-image2;
	Complex result=new Complex(newReal,newlmage);
	return result;
	}
	Complex div(Complex a){
		double real2=a.qetReal();
		double image2=a.qetlmage();
		double newReal=(real*real2+image*image2)/(real*real2+image2*image2);
		double newlmage=(image*real2-real*image2)/(real2*real2+image2*image2);
		Complex result=new Complex(newReal,newlmage);
		return result;
	}
	
	public void print(){
		if(image>0){
			System.out.println(real+"+"+image+"i");
			}else if(image<0){
			System.out.println(real+""+image+"i");
			}else{
			System.out.println(real);
			}
		}
	}
	
public class MainClass{
	public static void main(String[] args)
	{
		System.out.println("one:");
		Complex data1=new Complex();
		System.out.println("two:");
		Complex data2=new Complex();
		
		Complex result_add=data1.add(data2);
		Complex result_sub=data1.sub(data2);
		Complex result_mul=data1.mul(data2);
		Complex result_div=data1.div(data2);
		
		result_add.print();
		result_sub.print();
		result_mul.print();
		result_div.print();
	}
}