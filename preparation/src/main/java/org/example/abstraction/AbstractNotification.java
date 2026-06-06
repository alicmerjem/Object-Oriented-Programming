package org.example.abstraction;

abstract class AbstractNotification {
    abstract void send(String recipient);
}

class EmailNotification extends AbstractNotification {
    private String subject;
    private String lastSentTo;

    public EmailNotification(String subject) {
        this.subject = subject;
        this.lastSentTo = "";
    }

    public String getSubject() { return subject; }

    @Override
    public void send(String recipient) {
        this.lastSentTo = recipient;
        System.out.println("Email with subject " + subject + " sent to " + recipient);
    }
}
