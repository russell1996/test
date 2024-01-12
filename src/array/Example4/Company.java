package array.Example4;

public class Company {
    String name;
    Employee[] employees;

    // TODO: добавление сотрудника
    void hire(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                System.out.println("Принят");
                employee.display();
                return;
            }
        }
    }

    // TODO: увольнение сотрудника
    void fire(String employeeName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employeeName == employees[i].name) {
                    System.out.println("Уволен  " + employeeName);
                    return;

                }
            }
        }

        System.out.println("Не найден  " + employeeName);

    }
}



/*
    void addSong(Song song) {
        for (int i = 0; i < songs.length; i++) {
            if (songs[i] == null) {
                songs[i] = song;
                return;
            }
        }
        System.out.println("Песня не добавлена");
    }
}*/
