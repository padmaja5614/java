public class First
{
   int x,y;
   public First()
   {
     x=10;
    }
   public void show()
   {
       System.out.println(x);
       System.out.println(y);
     }
   public static void main(String args[])
{
    First f=new First();
    f.show();
}
}