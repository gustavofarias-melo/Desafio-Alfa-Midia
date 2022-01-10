package desafio.model;

import java.time.LocalDate;

public class Student extends Person {
    private Double finalDegree;

    public Student(String name, String phone, LocalDate dateOfBirth, Double finalDegree) {
        super(name, phone, dateOfBirth);
        this.finalDegree = finalDegree;
    }

    public Double getFinalDegree() {
        return finalDegree;
    }

    public void setFinalDegree(Double finalDegree) {
        this.finalDegree = finalDegree;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "finalDegree=" + finalDegree +
                '}';
    }
}
