package application;

import domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Locale;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);



    Person p1 = new Person(null, "Greg", "greg@gmail.com");
    Person p2 = new Person(null, "John", "john@gmail.com");
    Person p3 = new Person(null, "Chris", "chris@gmail.com");

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-jpa");
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    em.persist(p1);
    em.persist(p2);
    em.persist(p3);
    em.getTransaction().commit();
    System.out.println("Done!");

  }
}
