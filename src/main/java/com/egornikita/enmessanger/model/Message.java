package com.egornikita.enmessanger.model;

//- Сообщение
//    - Отправитель (пользователь)
//    - Получатель  (пользователь)
//    - Текст
//    - Дата-время

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private String time;

    public Message(User sender, User receiver, String text, String time) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.time = time;
    }

    public Message() {
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getTime() {
        return time;
    }

    public String getText() {
        return text;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setText(String text) {
        this.text = text;
    }
}
