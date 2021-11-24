public class WRMList  implements WRM{
  Node head;
  Node rear;
  int size;
 public  void registerPatient(Patient p){
   Node h=new Node(p,null);
   if(size==0){
     head=h;
       rear=h;
   }
   else{
     rear.next=h;
     rear=rear.next;
       }
   size++;
    h.patient.id=1980+size;
  }
  public void ServePatient ( ){
    if(head==null)
      return;
      System.out.println(head.patient.name+" ("+head.patient.id+")"+" is served");
      Node h=head;
      head=head.next;
      h.patient=null;
      h=null;
      size--;
  }
public  void CancelAll( ){
     System.out.println("All patients appointment have cancelled");
     for(Node h=head;h!=null;){
       h=h.next;
       Node temp=head;
       head=head.next;
        temp.patient=null;
      temp=null;
      size--;
     }
    }
  public boolean CanDoctorGoHome(){
   if (head==null)
     return true;
    return false;
  }
  public void ShowAllPatient(){
    if (head==null){
          System.out.println(" No Patient is Waiting");
         return;
    }
    Node t=new Node(head.patient,null);
    Node temp=t;
    for(Node h=head.next;h!=null;h=h.next){
      Node h1=new Node(h.patient,null);
      t.next=h1;
      t=t.next;
    }
     for(Node i=temp;i!=null;i=i.next){
      for(Node j=i.next;j!=null;j=j.next){
        if(i.patient.name.compareTo(j.patient.name)>0){
          Patient p=i.patient;
          i.patient=j.patient;
          j.patient=p;
        }
      }
    }
      System.out.println("Waiting Patients id are below:");
      for(Node i=temp;i!=null;i=i.next){
         System.out.println(i.patient.id+"("+i.patient.name+")");
      }
       System.out.println();
}
}
    