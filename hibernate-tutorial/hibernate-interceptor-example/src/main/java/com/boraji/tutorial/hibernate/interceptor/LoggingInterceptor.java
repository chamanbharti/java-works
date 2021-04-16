package com.boraji.tutorial.hibernate.interceptor;

import java.io.Serializable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

import com.boraji.tutorial.hibernate.entity.Book;

public class LoggingInterceptor extends EmptyInterceptor {

   private static final long serialVersionUID = 1L;
   // Define a static logger
   private static Logger logger = LogManager.getLogger(LoggingInterceptor.class);

   @Override
   public boolean onSave(Object entity, Serializable id, Object[] state,
            String[] propertyNames, Type[] types) {
      logger.info("onSave method is called.");
      if (entity instanceof Book) {
         Book book = (Book) entity;
         logger.info(book.toString());
      }
      return super.onSave(entity, id, state, propertyNames, types);
   }
   // Logging SQL statement
   @Override
   public String onPrepareStatement(String sql) {
      logger.info(sql);
      return super.onPrepareStatement(sql);
   }

}
