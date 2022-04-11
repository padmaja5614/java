import java.io.*;
class Box
{

  int l,b,h;
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
  public void getinput()throws Exception
  { 
      l=Integer.parseInt(br.readLine());
      b=Integer.parseInt(br.readLine());
      h=Integer.parseInt(br.readLine());
   }
   public int cal_area()
   {
      return l*b;
    }
    public int cal_volume()
    {
        return l*b*h;
     }
    public static void main(String args[])throws Exception
    {
      Box b1=new Box();
      b1.getinput();
      int area=b1.cal_area();
      int volume=b1.cal_volume();
      System.out.println("area="+area);
      System.out.println("volume="+volume);   
      
      Box b2=new Box();
      b2.l=10;
     b2.b=20;
      b2.h=30;
      area=b2.cal_area();
      volume=b2.cal_volume();
      System.out.println("area="+area);
      System.out.println("volume="+volume);  
      
    }
 } 
