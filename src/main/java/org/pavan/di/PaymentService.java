package org.pavan.di;

public class PaymentService {
    NotificationService notificationService;

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification() {
        notificationService.sendNotification();
    }
}
