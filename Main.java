package desafio;

import desafio.model.Person;
import desafio.model.Student;
import desafio.service.PersonService;

import javax.swing.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        StringBuilder menu = new StringBuilder();
        menu.append("******* Welcome to the CRUD *******\n");
        menu.append("1 . Create\n");
        menu.append("2 . Update\n");
        menu.append("3 . Delete\n");
        menu.append("4 . Find All\n");
        menu.append("5 . Exit\n");
        menu.append("Insert the option:\n");

        String answer = "N";
        PersonService personService = new PersonService();

        while("N".equalsIgnoreCase(answer)){
            int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op){
                case 1:
                    var name = JOptionPane.showInputDialog("Nome: ");
                    var dateOfBirth = JOptionPane.showInputDialog("Data de nascimento(dd/MM/yyyy): ");
                    var phone = JOptionPane.showInputDialog("Telefone(xxxx-xxxx): ");

                    String degree = JOptionPane.showInputDialog("Informe a nota: ");
                    var newDegree = Double.parseDouble(degree.equals("") ? String.valueOf(0.0) : degree);

                    String[] date = dateOfBirth.split("/");
                    var day = Integer.parseInt(date[0]);
                    var month = Integer.parseInt(date[1]);
                    var year = Integer.parseInt(date[2]);

                    if(newDegree != 0.0){
                        Student student = new Student(name, phone, LocalDate.of(year, month, day), newDegree);
                        personService.create(student);
                    }else{
                        Person person = new Person(name, phone, LocalDate.of(year, month, day));
                        personService.create(person);
                    }

                    break;

                case 2:
                    var namePerson = JOptionPane.showInputDialog("Informe o nome do aluno para atualizar: ");
                    var dateOfBirthUpdate = JOptionPane.showInputDialog("Data de nascimento(dd/MM/yyyy): ");
                    var phoneUpdate = JOptionPane.showInputDialog("Telefone(xxxx-xxxx): ");

                    String[] dateUpdate = dateOfBirthUpdate.split("/");
                    var dayUpdate = Integer.parseInt(dateUpdate[0]);
                    var monthUpdate = Integer.parseInt(dateUpdate[1]);
                    var yearUpdate = Integer.parseInt(dateUpdate[2]);

                    Person personUpdated = new Person(namePerson, phoneUpdate, LocalDate.of(yearUpdate, monthUpdate, dayUpdate) );
                    personService.update(namePerson, personUpdated);

                    break;

                case 3:
                    var personToDelete = JOptionPane.showInputDialog("Informe o nome do aluno para exlusão: ");
                    personService.delete(personToDelete);
                    break;

                case 4:
                    personService.findAll();
                    break;
                case 5:
                    answer = JOptionPane.showInputDialog("Do you wish exit? [Y]ES or [N]O?\n");
                    break;
            }
        }

    }
}
