package org.pavan.di;

public class PaymentService implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("Sent Payment Notification");
    }
}
