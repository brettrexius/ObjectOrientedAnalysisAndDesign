package car;

/**
 *
 * @author brett
 */
public class Seats {
    int cost = 0;
    public int addPuma(){
        cost += 7000;
        return cost;
    }
    public int subtractPuma(){
        cost -= 7000;
        return cost;
    }
    public int addSeal(){
        cost += 5600;
        return cost;
    }
    public int subtractSeal(){
        cost -= 5600;
        return cost;
    }
    public int addDragon(){
        cost += 12000;
        return cost;
    }
    public int subtractDragon(){
        cost -= 12000;
        return cost;
    }
   
}
