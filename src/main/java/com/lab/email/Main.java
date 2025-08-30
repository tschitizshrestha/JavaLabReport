package main.email;

public class Main {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        javax.swing.SwingUtilities.invokeLater(() -> new EmailSenderGUI(emailService));
    }
}