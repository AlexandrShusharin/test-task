public class Main {
    public static void main(String[] args) {
        Organization organization = new Organization();

        organization.addDepartment(new Department(1, "Java"));
        organization.addDepartment(new Department(2, "С#"));
        organization.addDepartment(new Department(3, "JavaScript"));
        organization.addStaff(new User(1, "Raman", 1000, 1,
                new Address("Brest", "YK", 17)));
        organization.addStaff(new User(2, "Anha", 2500, 1,
                new Address("Brest", "RC", 11)));
        organization.addStaff(new User(3, "Artem", 1500, 2,
                new Address("Wroclow", "lenina", 1)));
        organization.addStaff(new User(4, "Alex", 1700, 2,
                new Address("Minsk", "ordj", 29)));
        organization.addStaff(new User(5, "Ivan", 3000, 3,
                new Address("Wroclow", "lenina", 18)));

        organization.getMaxSalaryByDepartments().entrySet().stream()
                .forEach(entry -> System.out.println(String.format("%s - %d", entry.getKey(), entry.getValue())));
    }
}
