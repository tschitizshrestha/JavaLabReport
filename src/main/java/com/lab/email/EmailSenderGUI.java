package main.email;

import javax.swing.*;

public class EmailSenderGUI extends JFrame {
    private final EmailService emailService;

    private JTextField subjectField, receiverField;
    private JTextArea messageArea;

    public EmailSenderGUI(EmailService emailService) {
        this.emailService = emailService;

        JFrame frame = new JFrame("Email Sender");
        frame.setSize(500, 240);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel subjectLabel = new JLabel("Subject: ");
        subjectLabel.setBounds(15, 10, 100, 20);
        frame.add(subjectLabel);

        subjectField = new JTextField();
        subjectField.setBounds(65, 10, 400, 20);
        frame.add(subjectField);

        JLabel messageLabel = new JLabel("Message: ");
        messageLabel.setBounds(15, 35, 100, 20);
        frame.add(messageLabel);

        messageArea = new JTextArea();
        messageArea.setBounds(15, 60, 450, 50);
        frame.add(messageArea);

        JLabel receiverLabel = new JLabel("Receiver: ");
        receiverLabel.setBounds(15, 120, 100, 20);
        frame.add(receiverLabel);

        receiverField = new JTextField();
        receiverField.setBounds(15, 150, 450, 20);
        frame.add(receiverField);

        JButton sendButton = new JButton("Send");
        sendButton.setBounds(395, 175, 70, 20);
        frame.add(sendButton);

        sendButton.addActionListener(e -> sendEmail());

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void sendEmail() {
        String receiver = receiverField.getText();
        String subject = subjectField.getText();
        String message = messageArea.getText();

        EmailDetails emailDetails = new EmailDetails(receiver, subject, message);
        boolean success = emailService.sendEmail(emailDetails);

        if (success) {
            JOptionPane.showMessageDialog(this, "Email sent successfully");
        } else {
            JOptionPane.showMessageDialog(this, "Email sent failed");
        }
    }
}
