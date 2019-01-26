package SDA;

public class App {
    public static void main(String[] args) {
        User user = new User("ew1e", "324234", "423", "424234");
        User user1 = new User("13123e12313123w1e", "324234", "423", "424234");

        UserService nowy = new UserService();

        nowy.addUser(user);
        nowy.addUser(user1);
        nowy.printAll();




    }
}
