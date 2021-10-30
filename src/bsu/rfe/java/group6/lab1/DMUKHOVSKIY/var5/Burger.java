package bsu.rfe.java.group6.lab1.DMUKHOVSKIY.var5;

import java.util.Objects;

public class Burger extends Food {
    private String size;

    public Burger(String size) {
        super("Бургер");
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void consume() {
        System.out.println(this + "съедено");
    }

    @Override
    public String toString() {
        return super.toString()+" размера '"+ size.toUpperCase()+"'";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Burger burger = (Burger) o;
        return Objects.equals(size, burger.size);
    }

}
