package klu.Spring_Autowiring_DemoSkill_5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);

        Student s = context.getBean(Student.class);

        // Setting Student details
        s.setId(32578);
        s.setName("SRI AKSHAYA");
        s.setGender('F');

        // Creating and setting Certification details
        Certification c = new Certification();
        c.setId(1);
        c.setName("FULL STACK");
        c.setDateOfCompletion(14);

        // Inject certification into student
        s.setCertification(c);

        // Printing details
        System.out.println("Student ID: " + s.getId());
        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Gender: " + s.getGender());

        System.out.println("Certification ID: " + s.getCertification().getId());
        System.out.println("Certification Name: " + s.getCertification().getName());
        System.out.println("Date Of Completion: " + s.getCertification().getDateOfCompletion());
    }
}
