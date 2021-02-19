package com.oops.thread;
public class ThreadGroupDemo implements Runnable{  
    public void run() {  
          System.out.println(Thread.currentThread().getName());  
    }  
   public static void main(String[] args) {  
      ThreadGroupDemo runnable = new ThreadGroupDemo();  
          ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");  
            
          Thread t1 = new Thread(tg1, runnable,"one");  
          t1.start(); 
          Thread.currentThread().getThreadGroup().interrupt();
          Thread t2 = new Thread(tg1, runnable,"two");  
          t2.start(); 
          Thread.currentThread().getThreadGroup().interrupt();
          Thread t3 = new Thread(tg1, runnable,"three");  
          t3.start();  
          Thread.currentThread().getThreadGroup().interrupt();  
          System.out.println("Thread Group Name: "+tg1.getName());  
         tg1.list();  
  
    }  
   }  