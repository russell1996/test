package array.Example4;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.name = "Test1";
        company.employees = new Employee[4];

        Employee employee1 = new Employee();
        employee1.name = "Иванов И.И.";
        employee1.age = 18;

        Employee employee2 = new Employee();
        employee2.name = "Филимонов И.И.";
        employee2.age = 25;

        company.hire(employee1);
        company.hire(employee2);
        company.fire(employee2.name);
        company.fire("tom");
        company.fire("Чорт Коля");
        employee2.display();
    }
}
