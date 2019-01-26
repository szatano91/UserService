package SDA;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<User> users = new ArrayList<>();


    public void addUser(User user) {
        users.add(user);
    }

    public void printAll() {

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
    }
}


