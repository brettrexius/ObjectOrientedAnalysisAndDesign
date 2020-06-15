package car;

/**
 *
 * @author brett
 */
public class ModelE {

    int cost = 0;
    String ModelE = "";
    public int addModelE(){
        cost += 41000;
        System.out.println("Model E Selected.");
        return cost;
    }
    public int removeModelE(){
        cost -= 41000;
        System.out.println("Model E Unselected.");
        return cost;
    }
    public int getModelE(){
        return cost;       
    }  
    public String addStringModelE(){
        ModelE = "Car: E with ";
        return ModelE;
    }
    public String removeStringModelE(){
        ModelE = "";
        return ModelE;
    }
    public String getStringModelE(){
        return ModelE;
    }
    
}
