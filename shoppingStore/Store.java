
package shoppingStore;

/**
 * class for observer.Store
 */
public class Store {

    private final NotificationService notificationService;

    /**
     * constructor class
     */
    public Store() {
        notificationService = new NotificationService();
    }

    /**
     * method for promoting new item
     */
    public void newItemPromotion() {
        notificationService.notify();
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

}
