public class Main {
    interface NotificationService {
        void send(String message);
    }

    static class EmailService implements NotificationService {

        @Override
        public void send(String message) {
            System.out.println("Email жіберілді: " + message);
        }
    }

    static class NotificationManager {

        private NotificationService service;

        public NotificationManager(NotificationService service) {
            this.service = service;
        }

        public void notifyUser(String message) {
            service.send(message);
        }
    }

    public static void main(String[] args) {

        NotificationService emailService = new EmailService();

        NotificationManager manager = new NotificationManager(emailService);
        
        manager.notifyUser("Сәлем, әлем!");
    }
}
