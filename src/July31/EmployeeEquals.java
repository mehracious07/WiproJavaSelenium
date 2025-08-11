package July31;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmployeeEquals {
    int id;
    String name;

    EmployeeEquals(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding equals() to compare object content
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // same reference
        if (obj == null || getClass() != obj.getClass()) return false;

        EmployeeEquals other = (EmployeeEquals) obj;
        return this.id == other.id && this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return id + "_" + name;
    }

    public static void main(String[] args) {
        List<EmployeeEquals> employees = new ArrayList<>();
        employees.add(new EmployeeEquals(103, "Ravi"));
        employees.add(new EmployeeEquals(101, "Amit"));
        employees.add(new EmployeeEquals(102, "Zara"));
        employees.add(new EmployeeEquals(102, "Zara")); // Duplicate
        employees.add(new EmployeeEquals(104, "John"));

        for (EmployeeEquals e : employees) {
            System.out.println(e);
        }

        // Optional check
        EmployeeEquals zara = new EmployeeEquals(102, "Zara");
        System.out.println("List contains Zara? " + employees.contains(zara));
    }
}
