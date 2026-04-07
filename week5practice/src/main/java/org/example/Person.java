package org.example;

public class Person {
    private String name;
    private String email;
    private int birthYear;

    public Person(String name, String email, int birthYear) {
        this.name = name;
        this.email = email;
        this.birthYear = birthYear;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getBirthYear() { return birthYear; }

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }

    public int getAge(int currentYear) { return currentYear - birthYear; }

    public String getInfo() {
        return "Name: " + name + "\nEmail: " + email + "\nBirth Year: " + birthYear;
    }
}

class Students extends Person {
    private String studentId;
    private String major;

    public Students(String name, String email, int birthYear, String studentId, String major) {
        super(name, email, birthYear);
        this.studentId = studentId;
        this.major = major;
    }

    public String getStudentId() { return studentId; }
    public String getMajor() { return major; }

    public void setStudentId(String studentId) { this.studentId = studentId; }
    public void setMajor(String major) { this.major = major; }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nStudents: " + studentId + "\nMajor: " + major;
    }
}

class Professor extends Person {
    private String employeeId;
    private String department;

    public Professor(String name, String email, int birthYear, String employeeId, String department) {
        super(name, email, birthYear);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() { return employeeId; }
    public String getDepartment() { return department; }

    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }
    public void setDepartment(String department) { this.department = department; }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nProfessors: " + employeeId + "\nDepartment: " + department;
    }
}


