import java.util.ArrayList;

public class removeArray {
  
  private String name;
  
  public removeArray(String name) {
    this.name = name;
  }
  
  public void changeName (String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
  public String toString() {
    return name;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
     ArrayList<removeArray> array = new ArrayList<removeArray>();
     removeArray billy = new removeArray("billy");
     removeArray bob = new removeArray("bob");
     removeArray joe = new removeArray("joe");
     array.add(billy);
     array.add(bob);
     array.add(joe);
     ArrayList<removeArray> arrayKeep = new ArrayList<removeArray>();
     for(int i = 0 ; i < array.size(); i ++) {
       if(!array.get(i).getName().equals("billy") && !array.get(i).getName().equals("bob")) {
         arrayKeep.add(array.get(i));
       }
       if(array.get(i).getName().equals("joe")) {
         array.get(i).changeName("bob2");
       }
     }

     for(int i = 0 ; i < arrayKeep.size(); i ++) {
       System.out.println(arrayKeep.get(i) + "\n");
     }
  }

}
