package com.egornikita.enmessanger.model;

public class MessageService {
    public static Message[] create4Message(User[] users) {
        Message[] messages = new Message[users.length];

        for (int i = 0; i < users.length; i++) {
            messages[i] = new Message(users[i], users[(i + 1) % users.length], "Привет, " + users[(i + 1) % users.length].getNickName() + ", приятно познакомиться!", 12 + i + ":05");
        }

        return messages;
    }
}
