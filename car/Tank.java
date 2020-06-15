package car;

/**
 *
 * @author brett
 */
public class Tank {
    int cost = 0;
    String tank = "";
    public int addTank(){
        cost += 900;
        System.out.println("Oversized gas tank added.");
        return cost;
    }
    public int removeTank(){
        cost -= 900;
        System.out.println("Oversized gas tank removed.");
        return cost;
    }
    public int getTank(){
        return cost;
    }
    public String addStringTank(){
        tank = ", Oversized Gas Tank";
        return tank;
    }
    public String removeStringTank(){
        tank = "";
        return tank;
    }
    public String getStringTank(){
        return tank;
    }
}
