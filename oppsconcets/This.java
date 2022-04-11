class This
{
    int x;//globle variable
    public This(int x)//local variable
    {
       this.x=x;  
     }
     public void show()
     {
       System.out.println(x);
      }
      public static void main(String args[])
    {
      This t=new This(10);
      t.show();
     }
 }
   