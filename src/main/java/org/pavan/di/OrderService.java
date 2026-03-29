package org.pavan.di;

public class OrderService implements NotificationService {
    private int orderId;

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public void sendNotification() {
        System.out.println("Sent Order Notification");
    }
}
