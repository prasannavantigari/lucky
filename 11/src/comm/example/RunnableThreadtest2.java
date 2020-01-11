package comm.example;

public class RunnableThreadtest2 {

	 public static void main(String args[]) {
	        
	        // Since the constructor of the PrintNameRunnable
	        // object creates a Thread object and starts it,
	        // there is no need to do it here.
	        new PrintNameRunnable("Thread1");
	        
	        new PrintNameRunnable("Thread2");
	        new PrintNameRunnable("thread3");
	    }
	}

