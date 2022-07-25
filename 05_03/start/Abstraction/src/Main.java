public class Main {
    public static void main(String[] args) {
        PasswordChangeEvent eventOne = new PasswordChangeEvent("875348754387");
        AccountTransferEvent eventTwo = new AccountTransferEvent("453987438934");
        MissedPaymentEvent eventThree = new MissedPaymentEvent("1832834849990940");

        Event [] events = {eventOne, eventTwo, eventThree};

        for (Event e: events) {
            System.out.println(e.getTimeStamp());
            e.process();
            System.out.println();

        }
    }
}
