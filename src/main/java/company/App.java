package company;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App {

    public static void main(String[] args){

        Dog dog = new Dog();
        DogName dname = new DogName();

        dog.setId(1);
        dog.setColor("White");
        dog.setBreed("Samoyed");
        dname.setFname("Snow");
        dname.setMname("Blizzard");
        dname.setLname("White");
        dog.setName(dname);

        Configuration con = new Configuration().configure().addAnnotatedClass(Dog.class);

        SessionFactory sf = con.buildSessionFactory();

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

//        dog = (Dog)session.get(Dog.class, 1);
        session.save(dog);

        tx.commit();

        System.out.println(dog);

    }
}
