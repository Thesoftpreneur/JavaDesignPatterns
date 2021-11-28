package com.amberlion.behavioral.observer.pointofsale;

import com.amberlion.behavioral.observer.pointofsale.observer.CashierDisplay;
import com.amberlion.behavioral.observer.pointofsale.observer.CustomerDisplay;
import com.amberlion.behavioral.observer.pointofsale.observer.Observer;
import com.amberlion.behavioral.observer.pointofsale.topic.AddItemTopic;
import com.amberlion.behavioral.observer.pointofsale.topic.AddPaymentTopic;
import com.amberlion.behavioral.observer.pointofsale.topic.CompleteOrderTopic;
import com.amberlion.behavioral.observer.pointofsale.topic.Topic;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List cart = new ArrayList();
    List payments = new ArrayList();

    private Topic addItemTopic;
    private Topic addPaymentTopic;
    private Topic completeOrderTopic;

    public Order() {
        // create observers (devices)
        Observer cashierDisplay = new CashierDisplay();
        Observer customerDisplay = new CustomerDisplay();

        // create subjects (events)
        addItemTopic = new AddItemTopic();
        addPaymentTopic = new AddPaymentTopic();
        completeOrderTopic = new CompleteOrderTopic();

        // cashier display subscribed to all topics
        addItemTopic.register(cashierDisplay);
        addPaymentTopic.register(cashierDisplay);
        completeOrderTopic.register(cashierDisplay);

        // customer display subscribed to all topics
        addItemTopic.register(customerDisplay);
        addPaymentTopic.register(customerDisplay);
        completeOrderTopic.register(customerDisplay);

    }

    public void addItem(Item item) {
        cart.add(item);
        String line = item.name + " $" + item.price;
        addItemTopic.notifyObservers(line);
    }

    public void makePayment(Payment payment) {
        payments.add(payment);
        String line = payment.type + "$" + payment.amount;
        addPaymentTopic.notifyObservers(line);
    }

    public void completeOrder() {
        String line = "Order completed";
        completeOrderTopic.notifyObservers(line);
    }
}
