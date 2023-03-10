import java.util.*;

public class Organization {
    private final List<User> staff;
    private final List<Department> departments;

    public Organization() {
        this.staff = new ArrayList<>();
        this.departments = new ArrayList<>();
    }

    public void addStaff(User worker) {
        staff.add(worker);
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public Map<String, Integer> getMaxSalaryByDepartments() {
        Map<String, Integer> maxSalary = new HashMap<>();
        departments.stream()
                .forEach(dep ->
                        maxSalary.put(dep.getName(), staff.stream().
                                filter(worker -> worker.getDepartmentId() == dep.getId())
                                .max(Comparator.comparingInt(User::getSalary))
                                .map(User::getSalary)
                                .orElse(0)
                        )
                );
        return maxSalary;
    }
}
