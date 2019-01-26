package SDA;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        User user = new User("Jakub", "Stoch", "12345", "jakub.stoch");
        User user1 = new User("Adam", "Zyła", "12345", "adam.zyla");
        User user2 = new User("Wojtek", "Kot", "12345", "wojtek.kot");

        UserService nowy = new UserService();

        nowy.addUser(user);
        nowy.addUser(user1);
        nowy.addUser(user2);
        nowy.printAll();


    }
}




