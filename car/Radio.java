package car;

/**
 *
 * @author brett
 */
public class Radio {
    int cost = 0;
    String radio = "";
    public int addRadio(){
        cost += 900;
        System.out.println("Blaupunkt New York 800 Radio added.");
        return cost;
    }
    public int removeRadio(){
        cost -= 900;
        System.out.println("Blaupunkt New York 800 Radio removed.");
        return cost;
    }
    public int getRadio(){
        return cost;
    }
    public String addStringRadio(){
        radio = ", Blaupunkt New York 800 Radio";
        return radio;
    }
    public String removeStringRadio(){
        radio = "";
        return radio;
    }
    public String getStringRadio(){
        return radio;
    }
}
