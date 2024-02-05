package tasks.task05_01_24;

public class FromBorrowedStatusMover extends BookMover {
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case AVAILABLE, OVERDUED, ARCHIVED -> {
                book.setStatus(requestedStatus);
            }
            default ->
                    System.out.println("Перевод из статуса " + book.getStatus() + " статус " + requestedStatus + " невозможен ");
        }
    }
}