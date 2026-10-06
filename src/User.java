public class User {
    private int id;
    private String name;
    private String login;
    private String password;
    private int balance;

    public User(int id, String name, String login, String password, int balance) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
