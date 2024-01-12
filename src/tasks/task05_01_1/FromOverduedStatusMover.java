package tasks.task05_01_1;

public class FromOverduedStatusMover extends BookMover {
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case AVAILABLE -> {
                book.setStatus(requestedStatus);
            }
            default ->
                    System.out.println("Перевод из статуса " + book.getStatus() + " статус " + requestedStatus + " невозможен ");
        }
    }

}

