package car;

/**
 *
 * @author brett
 */
public class SeatsSeal {
    int cost = 0;
    String seal = "";
    public int addSeatsSeal(){
        cost += 5600;
        System.out.println("Seal Skin Seats added.");
        return cost;
    }
    public int removeSeatsSeal(){
        cost -= 5600;
        System.out.println("Seal Skin Seats removed.");
        return cost;
    }
    public int getSeatsSeal(){
        return cost;       
    }  
    public String addStringSeal(){
        seal = ", Seal Skin Seats";
        return seal;
    }
    public String removeStringSeal(){
        seal = "";
        return seal;
    }
    public String getStringSeal(){
        return seal;
    }
}
