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
        return "Name: " +  name + ", Email: " + email + ", Birth Year: " + birthYear;
    }
}

class Student extends Person {
    private String studentId;
    private String major;

    public Student(String studentId, String major, String name, String email, int birthYear) {
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
        return super.getInfo() + ", Student id: " + studentId + ", Major: " + major;
    }
}

class Professor extends Person {
    private String employeeId;
    private String department;

    public Professor(String employeeId, String department, String name, String email, int birthYear) {
        super(name, email, birthYear);
        this.employeeId = employeeId;
        this.department = department;
    }

    public String  getEmployeeId() { return employeeId; }
    public String getDepartment() { return department; }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Professor id: " + employeeId + ", Department: " + department;
    }
}
