
package ph;


public class Container {
    private int storage=10000;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
    
    int hold(int fruit,int amount){
        switch (fruit) {
            case 1:
            case 3:
                size=10;
                break;
            case 2:
                size=2;
                break;
            default:
                size=5;
                break;
        }
        int a= size * amount;
        return a;
    }




}
