package Assignment14;

import java.util.ArrayList;
import java.util.List;

public class Q3 {

  public void autonboxing(){
      List<Integer> list=new ArrayList<>();
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);
      list.add(50);
      System.out.println("List:- " +list);
      int sum=0;
      for (Integer num: list){
          sum+=num;

      }
      System.out.println("Addition Of List:- " +sum);
  }

    public static void main(String[] args) {
        Q3 q3=new Q3();
        q3.autonboxing();
    }
}
