import java.util.*;

public class Main {
    public static List<Person> generateClients() {
        List<Person> clients = new ArrayList<>();
        clients.add(new Person("Denis", "Chernikov", 4));
        clients.add(new Person("Irina", "Polyakova", 3));
        clients.add(new Person("Petya", "Petuhov", 1));
        clients.add(new Person("Olya", "Titova", 8));
        clients.add(new Person("Sergey", "Chernikov", 6));
        return clients;
    }

    public static void main(String[] args) {
        Deque<Person> queue = new ArrayDeque<>();

        queue.addAll(generateClients());

        while (!queue.isEmpty()) {
            String clientName = queue.peek().getName();
            String clientSurname = queue.peek().getSurname();
            int countOfTickets = queue.peek().getNumberOfTickets();

            if (countOfTickets != 0) {
                queue.peek().setNumberOfTickets((countOfTickets - 1));
                int clientTickets = queue.peek().getNumberOfTickets();
                queue.addLast(queue.peek());
                queue.poll();

                System.out.println(clientName + " " + clientSurname + " прокатился на аттракционе!\n" + "Остаток билетов: " + clientTickets + "\n");
            } else {
                queue.poll();
            }
        }
    }
}