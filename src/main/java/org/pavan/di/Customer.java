package org.pavan.di;

public class Customer {

    private int id;
    private String name;
    private String email;
    private NotificationService service;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setService(NotificationService service) {
        this.service = service;
    }

    public void sendNotification() {
        service.sendNotification();
    }
}
