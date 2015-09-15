package com.study.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class JobBoard implements Subject {

    private SubjectHelper subjectHelper;

    private List<String> jobs;

    public JobBoard() {
	this.subjectHelper = new SubjectHelper();
	jobs = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
	subjectHelper.addObserver(observer);
    }

    public void removeObserver(Observer observer) {
	subjectHelper.removeObserver(observer);
    }

    public void notifyChange() {
	subjectHelper.notifyChange();
    }

    public void postJob(String job) {
	jobs.add(job);
	notifyChange();
    }

    public List<String> getJobs() {
	return jobs;
    }

}
