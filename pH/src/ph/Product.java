
package ph;


public class Product {
    private int fruit;

    public int getFruit() {
        return fruit;
    }

    public void setFruit(int fruit) {
        this.fruit = fruit;
    }

    public Product(int fruit) {
        this.fruit = fruit;
    }
    void showFruit(){
        System.out.println(fruit);
    }

    public Product() {
    }
    
}
