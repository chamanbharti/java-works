package hibernate.one2one.unidirectional;

import java.time.LocalDate;
import java.time.Month;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.entity.uni.one2one.User;
import hibernate.entity.uni.one2one.UserDetail;
import hibernate.util.HibernateUtil;


public class UniDirectionalOneToOne {
   public static void main(String[] args) {
      Session session = null;
      Transaction transaction = null;
      try {
         session = HibernateUtil.getSessionFactory().openSession();
         transaction = session.getTransaction();
         transaction.begin();

         User user = new User();
         user.setUsername("bharti");
         user.setPassword("naman123");

         UserDetail userDetail = new UserDetail();
         userDetail.setFirstName("Ryaan");
         userDetail.setLastName("Bharti");
         userDetail.setEmail("ryaan.bharti@gmail.com");
         userDetail.setDob(LocalDate.of(1989, Month.MARCH, 15));

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
