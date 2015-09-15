package com.study.designpatterns.observer;

public interface Subject {

    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyChange();

}
