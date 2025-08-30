package main.email;

public class EmailDetails {
    private String receiver;
    private String subject;
    private String message;

    public EmailDetails(String receiver, String subject, String message) {
        this.receiver = receiver;
        this.subject = subject;
        this.message = message;
    }

    public String getReceiver() { return receiver; }
    public String getSubject() { return subject; }
    public String getMessage() { return message; }
}
