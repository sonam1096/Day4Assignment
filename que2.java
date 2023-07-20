package Day4Assignment;


class Complex{
	private int real,imag;
	Complex(){}
	Complex(int x, int y){
		real = x;
		imag = y;
	}
	public Complex add(Complex t) {
		 
		Complex z = new Complex();
		z.real = (this.real+t.real);
		z.imag = this.imag + t.imag;
		return z;
	}
	public Complex sub(Complex t) {
		// TODO Auto-generated method stub
		Complex z = new Complex();
		z.real = (this.real - t.real);
		z.imag = this.imag - t.imag;
		return z;
	}
	public Complex mul(Complex t) {
		// TODO Auto-generated method stub
		Complex z = new Complex();
		z.real = (this.real*t.real)-(this.imag*t.imag);
		z.imag = (this.real*t.imag)+(this.imag*t.real);
		return z;
	}
	public Complex div(Complex t) {
		// TODO Auto-generated method stub
		Complex z = new Complex();
		z.real = (this.real*t.real+this.imag*t.imag)/(t.real*t.real+t.imag*t.imag);
		z.imag = (this.imag*t.real-this.real*t.imag)/(t.real*t.real+t.imag*t.imag);
		return z;
	}
	public String toString() {
		if(imag<0) {
			return real + "-" + "i" + (-1*imag);
		}
		return real + "+" + "i" + imag;
	}
}
 
	
public class que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Complex x=new Complex(3,4);
        Complex y=new Complex(4,5);
        Complex a=x.add(y);
        Complex s=x.sub(y);
        Complex m=x.mul(y);
        Complex d=x.div(y);
        System.out.println(x); //3+i4
        System.out.println(y); //4+i5
        System.out.println(a);//7+i9
        System.out.println(s);//-1-i
        System.out.println(m);//-8+i31
        System.out.println(d);//.78+i0.02

			

			 
				

			}

		}
	

 
