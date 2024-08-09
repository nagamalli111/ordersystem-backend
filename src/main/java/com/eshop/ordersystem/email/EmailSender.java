package com.eshop.ordersystem.email;

public interface EmailSender {
    void send(String to, String email);
}