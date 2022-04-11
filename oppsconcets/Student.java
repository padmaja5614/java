import java.io.*;
class Student
{ 
   //member variable declaration
   String rollno,name,branch,clgname;
   int year;
   float marks; 
   InputStreamReader isr=new InputStreamReader(System.in);
   BufferedReader br=new BufferedReader(isr); 
   //reading of input
   public void getdata()throws Exception 
   {
        System.out.println("enter studenr rollno,name ,branch,year,percentage,clgname:");
        rollno=br.readLine();
        name=br.readLine();
        branch=br.readLine();
        year=Integer.parseInt(br.readLine());
        marks=Float.parseFloat(br.readLine());   
        clgname=br.readLine();
    }
    //printing input
    public void display()
    {
       System.out.println("ROLLNO:"+rollno);
       System.out.println("NAME:"+name);
       System.out.println("BRANCH:"+branch);
       System.out.println("YEAR:"+year);
       System.out.println("MARKS:"+marks);
       System.out.println("CLG NAME:"+clgname);     
      }
     public static void main(String args[])throws Exception
     {
        Student s1=new Student();
        s1.getdata();
        s1.display();
      }
}
      