package hibernate.one2one.bidirectional;

import java.time.LocalDate;
import java.time.Month;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.entity.bi.one2one.User;
import hibernate.entity.bi.one2one.UserDetail;
import hibernate.util.HibernateUtil;


public class BiDirectionalOneToOne {
   public static void main(String[] args) {
      Session session = null;
      Transaction transaction = null;
      try {
         session = HibernateUtil.getSessionFactory().openSession();
         transaction = session.getTransaction();
         transaction.begin();

         User user = new User();
         user.setUsername("namanbharti");
         user.setPassword("naman123");

         UserDetail userDetail = new UserDetail();
         userDetail.setFirstName("Aman");
         userDetail.setLastName("Bharti");
         userDetail.setEmail("aman.bharti@gmail.com");
         userDetail.setDob(LocalDate.of(1989, Month.MARCH, 15));
         userDetail.setUser(user);
         
         user.setUserDetail(userDetail);

         session.persist(user);
         transaction.commit();

         System.out.println("User saved successfully");

      } catch (Exception e) {
         if (transaction != null) {
            System.out.println("Transaction is being rolled back.");
            transaction.rollback();
         }
         e.printStackTrace();
      } finally {
         if (session != null) {
            session.close();
         }
      }
      HibernateUtil.shutdown();
   }
}
