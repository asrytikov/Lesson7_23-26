package p3;

public /*final*/ class Client extends People{

    private String name;

    public String getName() {
        return name;
    }

    public Client(String name) {
        //this.name = name;
        super(name);
    }

    public /*final*/ void info(){
        System.out.println("Name: " + name);
    }
}
