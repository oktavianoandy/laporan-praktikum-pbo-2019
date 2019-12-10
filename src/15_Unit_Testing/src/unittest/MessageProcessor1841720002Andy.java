package unittest;

public class MessageProcessor1841720002Andy {

    private String mSender, mRecipient, mMessage;

    public String getMessageAndy() {
        return mMessage;
    }

    public String getRecipientAndy() {
        return mRecipient;
    }

    public String getSenderAndy() {
        return mSender;
    }

    public void setMessageAndy(String message) {
        this.mMessage = message;
    }

    public void setRecipientAndy(String recipient) {
        this.mRecipient = recipient;
    }

    public void setSenderAndy(String sender) {
        this.mSender = sender;
    }

    public String messageFormatAndy() {
        String message = String.format("Hai %s, you have message from %s. "
                + "\nThe message as follows : %s", this.mRecipient, this.mSender, this.mMessage);
        return message;
    }

    public void showMessageAndy() {
        System.out.println(messageFormatAndy());
    }
}
