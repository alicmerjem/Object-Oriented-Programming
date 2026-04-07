package org.example;

public class UniversityPerson {
    private String name;
    private int birhtYear;

    public UniversityPerson(String name, int birhtYear) {
        this.name = name;
        this.birhtYear = birhtYear;
    }

    public String getRole() {
        return "University Person";
    }

    public int getAge(int currentYear) {
        return currentYear - this.birhtYear;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Birht Year: " + this.birhtYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;

        if (obj instanceof UniversityPerson) {
            UniversityPerson other = (UniversityPerson) obj;

            return this.name.equals(other.name) && this.birhtYear == other.birhtYear;
        }

        return false;
    }
}

class Student extends UniversityPerson {
    private String studentId;
    private String major;

    public Student(String name, int birhtYear, String studentId, String major) {
        super(name, birhtYear);
        this.studentId = studentId;
        this.major = major;
    }

    @Override
    public String getRole() {
        return "Student";
    }

    public String getStudentInfo() {
        return "Name: " + this.studentId + ", Major: " + this.major;
    }
}

class Professor extends UniversityPerson {
    private String employeeId;
    private String department;

    public Professor(String name, int birhtYear, String employeeId, String department) {
        super(name, birhtYear);
        this.employeeId = employeeId;
        this.department = department;
    }

    @Override
    public String getRole() {
        return "Professor";
    }

    public String getProfessorInfo() {
        return "Name: " + this.employeeId + ", Department: " + this.department;
    }
}

class Staff extends UniversityPerson {
    private String staffId;
    private String role;

    public Staff(String name, int birhtYear, String staffId, String role) {
        super(name, birhtYear);
        this.staffId = staffId;
        this.role = role;
    }

    @Override
    public String getRole() {
        return "Staff";
    }

    public String getStaffInfo() {
        return "Name: " + this.staffId + ", Department: " + this.role;
    }

}

class UniversityPrinter {
    public void printPersonDetails(UniversityPerson person, int currentYear) {
        System.out.println(person.toString());
        System.out.println("Role: " + person.getRole());
        System.out.println("Age: " + person.getAge(currentYear));

        if (person instanceof Student) {
            Student student = (Student) person;
            System.out.println(student.getStudentInfo());
        } else if (person instanceof Professor) {
            Professor professor = (Professor) person;
            System.out.println(professor.getProfessorInfo());
        } else if (person instanceof Staff) {
            Staff staff =  (Staff) person;
            System.out.println(staff.getStaffInfo());
        }
    }
}
