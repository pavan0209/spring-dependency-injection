package org.pavan.di;

public class OrderService {
    private int orderId;
    private NotificationService notificationService;

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification() {
        notificationService.sendNotification();
    }
}
