class sample
{


pubic sample()    //default constructor
 {
   int x;
   
 }
 public sample(int y)   //parameterized constructor
 {
    x=y;
  }
 /* public sample(sample s)   //copy constructor
  {
     s.x;
   }*/
   public void show()
   {
      System.out.println(x);
      System.out.println(y);
      //System.out.println(s);
     }
    public static void main(String[] args)
   {
       sample s1=new sample();
       
       sample s2=new sample(200);
       
       //sample s=new sample(s1);
       s1.show();
       s2.show();
       //s3.show();



     }
 }