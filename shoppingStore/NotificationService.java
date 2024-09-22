
package shoppingStore;

import java.util.*;

/**
 * class for Notification Service
 * email corresponding to each subscriber
 */
public class NotificationService {

    private final Map<Event, List<EventListener>> customers;

    private final List<EmailMsgListener> emailCustomers;
    private final List<MobileAppListener> mobileCustomers;

    /**
     * customers who want to be updated
     */
    public NotificationService() {

        customers = new HashMap<>();
        Arrays.stream(Event.values()).forEach(event ->
                customers.put(event, new ArrayList<>()));

        emailCustomers = new ArrayList<>();
        mobileCustomers = new ArrayList<>();
    }

    /**
     * method for subscribing on email
     * @param listener listener
     */
    public void emailSubscribe(EmailMsgListener listener) {
        emailCustomers.add(listener);
    }

    /**
     * method for unsubscribing on email
     * @param listener listener
     */
    public void emailUnsubscribe(EmailMsgListener listener) {
        emailCustomers.remove(listener);
    }


    /**
     * method for subscribing on mobile
     * @param listener listener
     */
    public void mobileSubscribe(MobileAppListener listener) {
        mobileCustomers.add(listener);
    }

    /**
     * method for unsubscribing on mobile
     * @param listener listener
     */
    public void mobileUnsubscribe(MobileAppListener listener) {
        mobileCustomers.add(listener);
    }


}
