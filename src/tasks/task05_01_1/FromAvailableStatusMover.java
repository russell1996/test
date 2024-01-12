package tasks.task05_01_1;

public class FromAvailableStatusMover extends BookMover {
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (requestedStatus == Status.AVAILABLE) {
            switch (requestedStatus) {
                case BORROWED, ARCHIVED -> {
                    System.out.println("Изменен статус книги с " + book.getStatus() + " на " + requestedStatus);
                    book.setStatus(requestedStatus);
                }
                default ->
                        System.out.println("Перевод из статуса " + book.getStatus() + " статус " + requestedStatus + " невозможен ");

            }
        } else {
            System.out.println("Ошибка, статус книги не соответствует");
        }
    }
}

