package car;

/**
 *
 * @author brett
 */
public class SeatsPuma {
    int cost = 0;
    String puma = "";
    public int addSeatsPuma(){
        cost += 7000;
        System.out.println("Puma Skin Seats added.");
        return cost;
    }
    public int removeSeatsPuma(){
        cost -= 7000;
        System.out.println("Puma Skin Seats removed.");
        return cost;
    }
    public int getSeatsPuma(){
        return cost;       
    }  
    public String addStringPuma(){
        puma = ", Puma Skin Seats";
        return puma;
    }
    public String removeStringPuma(){
        puma = "";
        return puma;
    }
    public String getStringPuma(){
        return puma;
    }
}
