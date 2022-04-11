import java.io.*;
class Employee
{
    String ename,deptname,organization,ug,pg;
    int eid,salary;
    public void getpersonal()throws Exception
    {
      System.out.println("enter eid,ename,deptname,salary,organization:");
      eid=Integer.parseInt(br.readLine());
      ename=br.readLine();
      deptname=br.readLine();
      salary=Integer.parseInt(br.readLine());
      organization=br.readLine();
     }
     public void getqualification()throws Exception
     {
       System.out.println("enter qualification");
       ug=br.readLine();
       pg=br.readLine();
      }
      public void displaypersonal()
      {
        System.out.println("EMPLOYEE ID"+eid);
        System.out.println("EMPLOYEE NAME"+ename);
        System.out.println("DEPARTMENT NAME"+deptname);
        System.out.println("SALARY"+salary);
        System.out.println("ORGANIZATION"+organization);
       }
      public void displayqualification()
       { 
          System.out.prinln("qyalification:");
          System.out.println("UG="+ug);
          System.out.println("PG"+pg);

        }
       public static void main(String args[])throws Exception
       {
          Employee e1=new Employee();
          e1.getpersonal();
          e1.getqualification();
          e1.displaypersonal();
          e1.displayqualification();
         }
}

      