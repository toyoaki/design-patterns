package com.study.designpatterns.observer;

/**
 * Observer Pattern
 * <br><br>
 * - Defines a one to many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically
 * - This example implements the pull style in which the observer gets data from the subject
 * - Publish/Subscribe and Listener are implementations of this pattern
 */
public class Main {

    public static void main(String[] args) {
	JobBoard jobBoard = new JobBoard();

	JavaJobAgency javaJobAgency = new JavaJobAgency(jobBoard);
	RubyJobAgency rubyJobAgency = new RubyJobAgency(jobBoard);

	jobBoard.postJob("2015-03-19 java Book Store");
	System.out.println("---------------------------");
	jobBoard.postJob("2015-05-10 ruby Car Factory");
	System.out.println("---------------------------");
	jobBoard.postJob("2015-03-19 java Bakery");
	System.out.println("---------------------------");
	jobBoard.removeObserver(javaJobAgency);
	jobBoard.notifyChange();
	System.out.println("---------------------------");
	jobBoard.removeObserver(rubyJobAgency);
	jobBoard.notifyChange();
	System.out.println("---------------------------");
    }

}
