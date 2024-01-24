package application;

import domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Locale;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-jpa");
    EntityManager em = emf.createEntityManager();

    // ADD TABLE OR ENTITY
//    Person p1 = new Person(null, "Greg", "greg@gmail.com");
//    Person p2 = new Person(null, "John", "john@gmail.com");
//    Person p3 = new Person(null, "Chris", "chris@gmail.com");
//    em.getTransaction().begin();
//    em.persist(p1);
//    em.persist(p2);
//    em.persist(p3);
//    em.getTransaction().commit();

    // SELECT ENTITY AND CONVERT TO CLASS
//    Person p = em.find(Person.class, 2);
//    System.out.println(p);

    // REMOVE ENTITY
    // this will not work because is not monitored
//    Person p18 = new Person(2, null, null);
//    em.remove(p18);
    // this will work! because you used "find" make entity being monitored
//    Person p19 = em.find(Person.class, 2);
//    em.getTransaction().begin();
//    em.remove(p19);
//    em.getTransaction().commit();

    System.out.println("Done!");
    em.close();
    emf.close();
  }
}
