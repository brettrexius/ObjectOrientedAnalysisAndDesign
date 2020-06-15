package car;

/**
 *
 * @author brett
 */
public class ModelC {
    int cost = 0;
    String ModelC = "";
    public int addModelC(){
        cost += 28000;
        System.out.println("Model C Selected.");
        return cost;
    }
    public int removeModelC(){
        cost -= 28000;
        System.out.println("Model C Unselected.");
        return cost;
    }
    public int getModelC(){
        return cost;       
    }  
    public String addStringModelC(){
        ModelC = "Car: C with ";
        return ModelC;
    }
    public String removeStringModelC(){
        ModelC = "";
        return ModelC;
    }
    public String getStringModelC(){
        return ModelC;
    }
}
