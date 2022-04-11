class Complex
{
   int real,img;
   public Complex(int x,int y)
   {
       real=x;
       img=y;
    }
    public Complex()
    {
    }
    public void show()
    {
       System.out.println(real+"+i"+img);
     }
     public void add(Complex c,Complex c1)
     {  
        this.real=c.real+c1.real;
        this.img=c.img+c1.img;
       

      }
     public static void main(String args[])
     {
       Complex c=new Complex(2,3);
       Complex c1=new Complex(4,5);
       Complex c2=new Complex();
       c2.add(c,c1);
       c.show();

       c1.show();
        System.out.println("the addition of 2 complex numbers is");
        c2.show();
       
      }
}