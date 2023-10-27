package p1;

public class Client {

    private String name;
    Account account;

    public Client(String name, String password){
        this.name = name;
        account = new Account(password);
    }

    public void infoClient(){
        System.out.printf("Client \t Name: %s \t Password: %s \n", name, account.password);
    }


    public class Account{
        private String password;

        public Account(String password){
            this.password = password;
        }

        public void infoAccount(){
            System.out.printf("Account Login: %s \t Password: %s\n", Client.this.name, password);
        }
    }

}
