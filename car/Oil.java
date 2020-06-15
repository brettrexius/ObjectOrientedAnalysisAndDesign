package car;

/**
 *
 * @author brett
 */
public class Oil {
    int cost = 0;
    String oil = "";
    public int addOil(){
        cost += 75;
        System.out.println("First free oil change added.");
        return cost;
    }
    public int removeOil(){
        cost -= 75;
        System.out.println("First free oil change removed.");
        return cost;
    }
    public int getOil(){
        return cost;
    }
    public String addStringOil(){
        oil = ", First Free Oil Change";
        return oil;
    }
    public String removeStringOil(){
        oil = "";
        return oil;
    }
    public String getStringOil(){
        return oil;
    }
    
}
