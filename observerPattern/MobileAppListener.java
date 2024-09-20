package observerPattern;

public class MobileAppListener implements EventListener {

    public final String username;

    /**
     * constructor
     * @param username1 username1
     */
    public MobileAppListener(String username1) {

        this.username = username1;
    }

    /**
     * method for updating
     *
     * @param eventType eventType
     */
    @Override
    public void update(Event eventType) {

    }
}
