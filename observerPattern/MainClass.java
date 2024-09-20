package observerPattern;

/**
 * main class
 */
public class MainClass {
    public static void main(String[] args) {
        Store store = new Store();
        store.getNotificationService().emailSubscribe(
                new EmailMsgListener("geekific@like.com")
        );
        store.getNotificationService().emailSubscribe(
                new EmailMsgListener("geekific@subs.com")
        );
        store.getNotificationService().mobileSubscribe(
                new MobileAppListener("GeekificLnS")
        );
        store.newItemPromotion();
    }
}