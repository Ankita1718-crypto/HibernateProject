package com.code.hb;

/**
 * Hello world!
 *
 */
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.code.entity.Category;
import com.code.entity.Order;
import com.code.entity.OrderDetails;
import com.code.entity.Product;
import com.code.entity.User;

public class App {
    public static void main(String[] args) {
        // Create the session factory
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Category.class)
                .addAnnotatedClass(Order.class)
                .addAnnotatedClass(OrderDetails.class)
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        // Create the object of AddProduct to insert  data
        new AddProduct(sessionFactory);

        // Create the object of ReadProduct to read inserted data
        new ReadProduct(sessionFactory);
        
        // Create the object of AddUser insert data
        new AddUser(sessionFactory);
        
        // Create the object of ReadUser to read inserted data
        new ReadUser(sessionFactory);
        
        //Create the object of Admin to see all users
        new Admin(sessionFactory);

        // Close the sessionFactory after all tasks
        sessionFactory.close();
    }
}
