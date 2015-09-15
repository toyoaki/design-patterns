package com.study.designpatterns.observer;

import java.util.List;

public class JavaJobAgency implements Observer {

    private JobBoard jobBoard;

    public JavaJobAgency(JobBoard jobBoard) {
	this.jobBoard = jobBoard;
	jobBoard.addObserver(this);
    }

    @Override
    public void onChange() {
	List<String> jobs = jobBoard.getJobs();
	jobs.stream().filter(j -> j.contains("java")).forEach(j -> System.out.println("[JBA] " + j));
    }

}
