package Learn;

public class Student {

    private final int id;
    private final String firstName;
    private final String lastName;
    private final String department;
    private final int joinedYear;

    public Student(int id, String firstName, String lastName, String department, int joinedYear) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.joinedYear = joinedYear;
    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public int getJoinedYear() {
        return joinedYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", joinedYear=" + joinedYear +
                '}';
    }
}
