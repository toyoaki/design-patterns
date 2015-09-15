package com.study.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectHelper {

    private List<Observer> observers;

    public SubjectHelper() {
	this.observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer observer) {
	observers.add(observer);
    }

    public void removeObserver(Observer observer) {
	observers.remove(observers.indexOf(observer));
    }

    public void notifyChange() {
	observers.stream().forEach(o -> o.onChange());
    }

}
