
package ph;

public class Toxicity {
    private double ph;
    Container cp;
    private final int J = 10000/100;
    public double getPh() {
        return ph;
    }

    public void setPh(double ph) {
        this.ph = ph;
    }

    public Toxicity(Product p,double ph) {
        this.ph = ph;
        
        if(p.getFruit()==1 && ph>2.4 && ph<3.10) System.out.println("This Apple juice is perfect for health & ready to sell");
        else if(p.getFruit()==2 && ph>2.9 && ph<3.90) System.out.println("This Grape juice is perfect for health & ready to sell");
        else if(p.getFruit()==3 && ph>2.1 && ph<4.50) System.out.println("This orange juice is perfect for health & ready to sell");
        else if(p.getFruit()==5 && ph>2.2 && ph<4.60) System.out.println("This lemon juice is perfect for health & ready to sell ");
        else if(p.getFruit()==4 && ph>2.0 && ph<2.60) System.out.println("This lichi juice is perfect for health & ready to sell ");
        else System.out.println("The fruit you have selected is toxic at this pH.");
        
    
    }
}
