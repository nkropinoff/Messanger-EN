package com.egornikita.enmessanger.model;

public class UserService {
    public static User[] create4Users() {
        User[] users = new User[4];

        User user1 = new User("Egor Sorokin", "egorX_x", "8-800-555-35-35", "qwerty12");
        User user2 = new User("Nikita Kropinov", "fequery", "8-800-808-88-00", "йцукен34");
        User user3 = new User("Magomed Ebdulaev", "maga", "8-123-456-78-90", "M1A2G3A4");
        User user4 = new User("Ariadna Grande", "bestgrandy67", "8-987-654-32-10", "p@sSw0rd");

        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        users[3] = user4;

        return users;
    }
}
