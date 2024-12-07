package com.egornikita.enmessanger;
import com.egornikita.enmessanger.model.*;


public class Main {
    public static void main(String[] args) {

    }

    public static void printInfoAboutUsers(User[] users) {
        for (User u : users) {
            System.out.printf("NickName: %s\nUserName: %s\nPhoneNumber: %s\nPassword: ********\n\n", u.getNickName(), u.getUserName(), u.getPhoneNumber());
        }
    }
}
