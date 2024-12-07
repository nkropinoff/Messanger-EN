package com.egornikita.enmessanger;
import com.egornikita.enmessanger.model.*;


public class Main {
    public static void main(String[] args) {
        User[] users = UserService.create4Users();
        printInfoAboutUsers(users);


    }

    public static void printInfoAboutUsers(User[] users) {
        for (User u : users) {
            System.out.printf("NickName: %s\nUserName: %s\nPhoneNumber: %s\nPassword: ********\n\n", u.getNickName(), u.getUserName(), u.getPhoneNumber());
        }
    }

    public static void printInfoAboutMessages(Message[] messages) {
        for (Message message : messages) {
            System.out.println("Sender: " + message.getSender().getNickName());
            System.out.println("Receiver: " + message.getReceiver().getNickName());
            System.out.println("Text: " + message.getText());
            System.out.println("Time: " + message.getTime());
            System.out.println();
        }
    }
}
