public class WRMArray implements WRM{
  Patient a[];
  int size;
  int start;
 public  void registerPatient(Patient p){
    Patient temp[];
   if(size==0)
     temp=new Patient[1];
   else
      temp=new Patient[a.length+1];
    for(int st=start,i=0,s=start;i<size;i++){
      temp[s]=a[st];
      st=(st+1)%a.length;
      s=(s+1)%temp.length;
    }
     size++;
      p.id=1980+size;
    temp[(start+size-1)%temp.length]=p;
    a=temp;
  }
 public void ServePatient ( ){
     if(a[start]==null)
       return;
    System.out.println(a[start].name+" ("+a[start].id+")"+" is served");
    a[start]=null;
    size--;
    start=(start+1)%a.length;
  }
 public void CancelAll( ){
     System.out.println("All patients appointment have cancelled");
      for(int st=start,i=0;i<size;i++){
    a[st]=null;
    size--;
      st=(st+1)%a.length;
      }
    }
  public boolean CanDoctorGoHome(){
    if(a[start]==null)
      return true;
    return false;
  }
 public void ShowAllPatient(){
    if(a[start]==null){
         System.out.println(" No Patient is Waiting");
         return;
    }
     Patient temp[]=new Patient[size];
    for(int st=start,i=0;i<size;i++){
      temp[i]=a[st];
      st=(st+1)%a.length;
    }
    for(int i=0;i<temp.length;i++){
      for(int j=i+1;j<temp.length;j++){
        if(temp[i].name.compareTo(temp[j].name)>0){
          Patient t=temp[i];
          temp[i]=temp[j];
          temp[j]=t;
        }
      }
    }
      System.out.println("Waiting Patients id are below:");
      for(int i=0;i<temp.length;i++){
        System.out.println(temp[i].id+"("+temp[i].name+")");
      }
       System.out.println();
    }
}
    