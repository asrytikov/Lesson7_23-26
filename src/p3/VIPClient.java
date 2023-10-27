package p3;

public class VIPClient extends People{

    private int countMoney;

    public VIPClient(String name, int countMoney) {
        super(name);
        this.countMoney = countMoney;
    }

   /* public void inform(){
        System.out.printf("%s have %d $ \n", getName(), countMoney);
    }*/

    @Override
    public void info() {
        //System.out.printf("Name: %s \n", getName());
        //super.info();
        System.out.printf("%s have %d $ \n", getName(), countMoney);
    }
}
