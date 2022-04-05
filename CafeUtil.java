import java.util.ArrayList;
public class CafeUtil {
    
    public Integer getStreakGoal(){
        int sum = 0;
        for(int i = 0; i < 11; i++){
            sum += i;
        }
        return sum;
    }

    public Double getOrderTotal(double[] prices){
        Double sum = 0.0;
        for (int i = 0; i < prices.length; i++){
            sum += prices[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for( int i = 0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello," +" " + userName);
        System.out.println("there is " + customers.size() + " in front of " + userName);
        customers.add(userName);
        System.out.println(customers);
    }
}
