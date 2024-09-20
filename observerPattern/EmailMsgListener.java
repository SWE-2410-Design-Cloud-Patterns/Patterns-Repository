
package observerPattern;

/**
 * class for Email Message Listener
 */
public class EmailMsgListener implements EventListener {

    private final String email;

    /**
     * constructor for emails
     * @param email email
     */
    public EmailMsgListener(String email) {
        this.email = email;
    }

    /**
     * method for update
     */
    public void update() {
        // acutally send the mail
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
