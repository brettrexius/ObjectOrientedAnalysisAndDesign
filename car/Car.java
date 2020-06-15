
package car;
import javax.swing.*;
/**
 *
 * @author brett
 */
public class Car {
// call other functions here. make object in gui for car and in here call everything
    ModelC mc = new ModelC();
    ModelE me = new ModelE();
    ModelCS mcs = new ModelCS();
    SeatsPuma sp = new SeatsPuma();
    SeatsSeal ss = new SeatsSeal();
    SeatsKomodo sk = new SeatsKomodo();
    EngineV8 v8 = new EngineV8();
    EngineV12 v12 = new EngineV12();
    CupHolder ch = new CupHolder();
    Done d = new Done();
    Engine e = new Engine();
    Oil o = new Oil();
    Quit q = new Quit();
    Radio r = new Radio();
    Roof rf = new Roof();
    Seats s = new Seats();
    Tank tk = new Tank();
    Tire tr = new Tire();
    Tow tw = new Tow();
    
    int model;
    public void addModelC(){
        mc.addModelC();
        mc.addStringModelC();
        model = 1;
    }
    public void removeModelC(){
        mc.removeModelC();
        mc.removeStringModelC();
    }
    public void addModelE(){
        me.addModelE();
        me.addStringModelE();
        model = 2;
    }
    public void removeModelE(){
        me.removeModelE();
        me.removeStringModelE();
        
    }
    public void addModelCS(){
        mcs.addModelCS();
        mcs.addStringModelCS();
        model = 3;
    }
    public void removeModelCS(){
        mcs.removeModelCS();
        mcs.removeStringModelCS();
    }
    public void addSeatsPuma(){
        if (model == 2){
            sp.addSeatsPuma();
            sp.addStringPuma();
        }
        else if (model == 1){
            System.out.println("    Error: Puma Skin Seats not available on C");
        }
        else{
            System.out.println("    Error: Puma Skin Seats not available on CS");
        }
    }
    public void removeSeatsPuma(){
        sp.removeSeatsPuma();
        sp.removeStringPuma();
    }
    public void addSeatsSeal(){
        if (model == 1){
            ss.addSeatsSeal();
            ss.addStringSeal();
        }
        else if (model == 2){
            System.out.println("    Error: Seal Skin Seats not available on E");
        } 
        else{
            System.out.println("    Error: Seal Skin Seats not available on CS");
        }
    }
    public void removeSeatsSeal(){
        ss.removeSeatsSeal();
        ss.removeStringSeal();
    }
    public void addSeatsKomodo(){
        if (model == 3){
            sk.addSeatsKomodo();
            sk.addStringKomodo();
        }
        else if (model == 1){
            System.out.println("    Error: Seal Skin Seats not available on C");
        }
        else{
            System.out.println("    Error: Seal Skin Seats not available on E");
        }
    }
    public void removeSeatsKomodo(){
        sk.removeSeatsKomodo();
        sk.removeStringKomodo();
    }
    public void addV8Engine(){
        if (model == 1){
            v8.addV8Engine();
            v8.addStringV8();
        }
        else if (model == 2){
            System.out.println("    Error: V-8 Engine not available on E");
        }
        else{
            System.out.println("    Error: V-8 Engine not available on CS");
        }
        
    }
    public void removeV8Engine(){
        v8.removeV8Engine();
        v8.removeStringV8();
    }
    public void addV12Engine(){
        if (model == 2 || model == 3){
            v12.addV12Engine();
            v12.addStringV12();
        }
        else{
            System.out.println("    Error: V-12 Engine not available on C");
        }
    }
    public void removeV12Engine(){
        v12.removeV12Engine();
        v12.removeV12Engine();
    }
    public void addCupHolder(){
        ch.addCupHolder();
        ch.addStringCupHolder();
    }
    public void removeCupHolder(){
        ch.removeCupHolder();
        ch.removeStringCupHolder();
    }
    
    public void quit(){
        q.quit();
    }         
    public void addOil(){
        o.addOil();
        o.addStringOil();
    }
    public void removeOil(){
        o.removeOil();
        o.removeStringOil();
    }
    public void addRadio(){
        r.addRadio();
        r.addStringRadio();
    }
    public void removeRadio(){
        r.removeRadio();
        r.removeStringRadio();
    }
    public void addRoof(){
        rf.addRoof(model);
        rf.addStringRoof();
    }
    public void removeRoof(){
        rf.removeRoof(model);
        rf.removeStringRoof();
    }
    public void addTank(){
        tk.addTank();
        tk.addStringTank();
    }
    public void removeTank(){
        tk.removeTank();
        tk.removeStringTank();
    }
    public void addTire(){
        tr.addTire();
        tr.addStringTire();
    }
    public void removeTire(){
        tr.removeTire();
        tr.removeStringTire();
    }
    public void addTow(){
        tw.addTow();
        tw.addStringTow();
    }
    public void removeTow(){
        tw.removeTow();
        tw.removeStringTow();
    }

    
    int totalCost = 0;
    int seatCost = 0;
    String order = null;
    //int totalCost = ch.getCupHolder();
    public void done(){
        
        order = mc.getStringModelC() + me.getStringModelE() + mcs.getStringModelCS() + v8.getStringV8() + v12.getStringV12() + rf.getStringRoof() + tw.getStringTow() + tk.getStringTank() + sp.getStringPuma() + ss.getStringSeal() + sk.getStringKomodo() + ch.getStringCupHolder() + r.getStringRadio() + tr.getStringTire() + o.getStringOil();
        
        
        totalCost = mc.getModelC() + me.getModelE() + mcs.getModelCS() + sp.getSeatsPuma() + ss.getSeatsSeal() + sk.getSeatsKomodo() + v8.getV8Engine() + v12.getV12Engine() + rf.getRoof() + ch.getCupHolder() + o.getOil() + r.getRadio() + tk.getTank() + tr.getTire() + tw.getTow();
    
        d.doneString(order);
        d.done(totalCost);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GUI.main(null);
    }
    
}
