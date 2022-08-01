import java.util.ArrayList;
import java.util.Arrays;

class CafeUntil {
  public int getStreakGoal(int drinks){
    int total = 0;
    for (int i = 0; i <= drinks; i++){
      total += i;

    }
    return total;
  } 

  public double getOrderTotal(double[] prices){
    int sum = 0;
    for(int i =0; i < prices.length; i++){
      sum += prices[i];
    }
    return sum;
  }
  

  public String displayMenu(ArrayList<String> items){
    String output = "";
    for(int i =0; i < items.size(); i++){
      output += i +" " + " "+items.get(i);
    }
    return output;
  }

  public void addCustomer (ArrayList<String> customers){
    System.out.println("Please enter your name");
    String userName = System.console().readLine();
    System.out.println("Hello!" + userName);
    customers.add(userName);

  }
}