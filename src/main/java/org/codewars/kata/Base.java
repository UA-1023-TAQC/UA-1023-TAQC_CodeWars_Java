package org.codewars.kata;

public abstract class Base {
    @Override
    public String toString(){
        String[] names = this.getClass().toString().split("\\.");
        System.out.println(this.getClass().toString());
        return names[names.length - 2];
    }
}
