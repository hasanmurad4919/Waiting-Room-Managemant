import java.util.Scanner;
public class Tester{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    WRM w;
     System.out.println("Enter 1 for Array \n or Enter any other integer for List");
     int x=sc.nextInt();
     if(x==1)
   w=new WRMArray();
     else
        w=new WRMList();
    w.registerPatient(new Patient("murad",22,"A+"));
    w.registerPatient(new Patient("niloy",22,"o+"));
    w.registerPatient(new Patient("tamal",21,"B+"));
    w.registerPatient(new Patient("nafis",21,"A+"));
    w.ShowAllPatient();
    System.out.println(w.CanDoctorGoHome());
    w.ServePatient();
     w.ShowAllPatient();
     w.CancelAll();
      System.out.println(w.CanDoctorGoHome());
      w.ShowAllPatient();
  }
}