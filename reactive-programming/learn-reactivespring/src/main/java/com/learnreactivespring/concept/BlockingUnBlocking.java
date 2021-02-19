package com.learnreactivespring.concept;

public class BlockingUnBlocking {
/*
	// Blocking code
	Product p = db.getProduct(id);
	show(p);
	
	// Callbacks
	db.getProduct(id, (p,error) -> {
		show(p);
	});
	
	//Callback Hell
	 db.getProduct(id, (p,error) -> {
		 if(error) {
		 //...
		  }
		  else{
			  show(p);
			  db.getProductDetails(p,(d,error) -> {
				  if(error) {
				  //..
				   }
				   else{
				   //...
				    }
			    });
		    }
	    });
	    Async in Java
	    Thread pools
	    Fork/Join framework
	    Parallel streams
	    CompletableFuture
	    
	    CompletableFuture
	    in java
	    CompletableFuture.supplyAsync(this::processOperation)
	    				 .thenApply(this::sendEmail)
	    				 .thenAccept(this::completeOperation)
	    
	    in js's async/await
	    async function getProductDetails(id){
		    const p = await db.getProduct(id);
		    const d = await db.getProductDetails(p);
		    return d;
	    }
	    
	    Functional Programming
	    Pure Functitons
	    Lambda expression
	    Immutablity
	    Testable
	    Declarative
	    Maintainable
	    
	    Imperative Code
	    What to do
	    How to do
	    
	    Declarative Code
	    What to do
	    
	    
	
*/
}
