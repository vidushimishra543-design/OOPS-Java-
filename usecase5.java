public class usecase5 {
    public static void main(String args[]) {

        TicketCounter counter = new TicketCounter();
        Thread t1 = new Thread(counter);
        Thread t2 = new Thread(counter);
        t1.setName("Counter 1");
        t2.setName("Counter 1");
        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}

class TicketCounter implements Runnable {
    int availableticket = 3;

    synchronized void bookTickets() {
        if (availableticket > 0) {
            availableticket = availableticket - 1;
            System.out.println("Tickets booked by" + Thread.currentThread().getName());
            System.out.println("left tickets are" + availableticket);

        } else {
            System.out.println("Tickets are sold out");

        }
    })

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            System.out.println(e);
        }
        while (availableticket > 0) {
            bookTickets();
        }
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
}