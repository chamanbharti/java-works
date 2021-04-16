package interview.surya;

import java.util.List;
import java.util.ArrayList;
 
public class ListMut {

   public void Display()
   {
      List<String> list = new ArrayList<String>();
      list.add("Alice");
      list.add("Smith");
      list.add("Jones");
 
      for (String str : list) 
      {
         str += "50";  
      }
      System.out.println(list);  
   }

   public static void main(String[] args) 
   {
      ListMut obj = new ListMut();
      obj.Display();
   }
      
}
