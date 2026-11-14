package program_4;

import java.util.LinkedList;
import java.util.Scanner;

public class PizzeriaLineSimulator {

    private LinkedList<Customer> regularQueue = new LinkedList<>();
    private LinkedList<Customer> vipQueue = new LinkedList<>();
    private int customersServed = 0;
    private long totalWaitTime = 0;

    public static void main(String[] args) {
        PizzeriaLineSimulator simulator = new PizzeriaLineSimulator();
        simulator.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            printMenu();
            input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1:
                    viewQueue();
                    break;
                case 2:
                    addCustomer(scanner);
                    break;
                case 3:
                    addVipCustomer(scanner);
                    break;
                case 4:
                    serveCustomer();
                    break;
                case 5:
                    removeCustomer(scanner);
                    break;
                case 6:
                    printQueueStatistics();
                    break;
                case 7:
                    System.out.println("Closing the pizzeria...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (input != 7);
        scanner.close();
    }

    private void viewQueue() {
        System.out.println("Current queue");
        System.out.println("-------");
        for (Customer vip : vipQueue) {
            System.out.println(vip.getName() + " (" + vip.getOrder() + ") [VIP]");
        }
        for (Customer regular : regularQueue) {
            System.out.println(regular.getName() + " (" + regular.getOrder() + ")");
        }
    }

    private void addCustomer(Scanner scanner) {
        System.out.println("What is the customer's name?");
        String name = scanner.nextLine();
        System.out.println("What would you like to order?");
        String order = scanner.nextLine();
        System.out.println("Added " + name + " to the queue.");
        regularQueue.add(new Customer(name, order));
    }

    private void addVipCustomer(Scanner scanner) {
        System.out.println("What is the customer's name?");
        String name = scanner.nextLine();
        System.out.println("What would you like to order?");
        String order = scanner.nextLine();
        System.out.println("Added " + name + " (VIP) to the queue.");
        vipQueue.add(new Customer(name, order));
    }

    private void removeCustomer(Scanner scanner) {
        System.out.println("What customer is leaving the line?");
        String name = scanner.nextLine();
        Customer toRemove = null;

        for (Customer vip : vipQueue) {
            if (vip.getName().equalsIgnoreCase(name)) {
                toRemove = vip;
                vipQueue.remove(vip);
                break;
            }
        }

        if (toRemove == null) {
            for (Customer regular : regularQueue) {
                if (regular.getName().equalsIgnoreCase(name)) {
                    toRemove = regular;
                    regularQueue.remove(regular);
                    break;
                }
            }
        }

        if (toRemove != null) {
            long waitTime = (System.nanoTime() - toRemove.getTimeEntered()) / 1_000_000_000;
            System.out.println(toRemove.getName() + " has been removed from the queue.");
            System.out.println("Time spent in queue: " + waitTime + " seconds");
        } else {
            System.out.println("Customer not found in the queue.");
        }
    }

    private void serveCustomer() {
        Customer nextCustomer;
        if (!vipQueue.isEmpty()) {
            nextCustomer = vipQueue.removeFirst();
        } else if (!regularQueue.isEmpty()) {
            nextCustomer = regularQueue.removeFirst();
        } else {
            System.out.println("The queue is empty!");
            return;
        }

        long waitTime = (System.nanoTime() - nextCustomer.getTimeEntered()) / 1_000_000_000;
        totalWaitTime += waitTime;
        customersServed++;

        String review = (waitTime <= 15) ? "⭐⭐⭐" :
                        (waitTime <= 45) ? "⭐⭐" : "⭐";

        System.out.println(nextCustomer.getName() + " has been served their " + nextCustomer.getOrder());
        System.out.println("Time spent in queue: " + waitTime + " seconds");
        System.out.println(nextCustomer.getName() + "'s review: " + review);
    }

    private void printQueueStatistics() {
        if (customersServed == 0) {
            System.out.println("No customers served yet.");
        } else {
            double averageWaitTime = (double) totalWaitTime / customersServed;
            System.out.println("Customers served: " + customersServed);
            System.out.printf("Average wait time: %.2f seconds\n", averageWaitTime);
        }
    }

    private void printMenu() {
        System.out.println("");
        System.out.println("1. View current queue");
        System.out.println("2. Add regular customer to queue");
        System.out.println("3. Add VIP customer to queue");
        System.out.println("4. Serve next customer");
        System.out.println("5. Remove customer from queue");
        System.out.println("6. Print queue statistics");
        System.out.println("7. Exit");
        System.out.println("");
        System.out.println("Please enter an option: ");
    }
}