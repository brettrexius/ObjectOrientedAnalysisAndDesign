package car;

/**
 *
 * @author brett
 */
public class Tire {
    int cost = 0;
    String tire = "";
    public int addTire(){
        cost += 400;
        System.out.println("Spare Tire added.");
        return cost;
    }
    public int removeTire(){
        cost -= 400;
        System.out.println("Spare Tire removed.");
        return cost;
    }
    public int getTire(){
        return cost;
    }
    public String addStringTire(){
        tire = ", Spare Tire";
        return tire;
    }
    public String removeStringTire(){
        tire = "";
        return tire;
    }
    public String getStringTire(){
        return tire;
    }
}
