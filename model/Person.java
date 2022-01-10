package desafio.model;

import java.time.LocalDate;

public class Person {
    private String name;
    private String phone;
    private LocalDate dateOfBirth;
    private LocalDate createdPersonDate = LocalDate.now();
    private LocalDate updatePersonDate;

    public Person() {
    }

    public Person(String name, String phone, LocalDate dateOfBirth) {
        this.name = name;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getCreatedPersonDate() {
        return createdPersonDate;
    }

    public void setCreatedPersonDate(LocalDate createdPersonDate) {
        this.createdPersonDate = createdPersonDate;
    }

    public LocalDate getUpdatePersonDate() {
        return updatePersonDate;
    }

    public void setUpdatePersonDate(LocalDate updatePersonDate) {
        this.updatePersonDate = updatePersonDate;
    }

    @Override
    public String toString() {
        return "\nPerson{"+
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", createdPersonDate=" + createdPersonDate +
                ", updatePersonDate=" + updatePersonDate +
                '}' +"\n";
    }
}
