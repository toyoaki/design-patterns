package com.study.designpatterns.observer;

import java.util.List;

public class RubyJobAgency implements Observer {

    private JobBoard jobBoard;

    public RubyJobAgency(JobBoard jobBoard) {
	this.jobBoard = jobBoard;
	jobBoard.addObserver(this);
    }

    @Override
    public void onChange() {
	List<String> jobs = jobBoard.getJobs();
	jobs.stream().filter(j -> j.contains("ruby")).forEach(j -> System.out.println("[RJA] " + j));
    }

}
