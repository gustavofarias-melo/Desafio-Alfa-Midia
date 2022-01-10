package desafio.service;

import desafio.model.Person;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonService {

    private List<Person> people = new ArrayList<>();

    public void create(Person person){
        people.add(person);
        JOptionPane.showMessageDialog(null, "Person created with success.");
    }

    public void findAll(){
        if(people.size() > 0){
            JOptionPane.showMessageDialog(null, people);
        }
    }

    public void update(String name, Person personRequest){
        this.delete(name);
        personRequest.setUpdatePersonDate(LocalDate.now());
        people.add(personRequest);
    }

    public void delete(String name){
        var person = people.stream().filter(p -> p.getName().equalsIgnoreCase(name)).findFirst();
        if(person.isEmpty()){
            JOptionPane.showMessageDialog(null, "["+name+"] not found!");
            return;
        }
        people.remove(person.get());
    }
}
