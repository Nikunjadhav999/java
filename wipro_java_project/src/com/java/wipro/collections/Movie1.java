package com.java.wipro.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Movie1 {

    private String n;
    private double r;
    private int y;

    public Movie1(String n, double r, int y) {
        this.n = n;
        this.r = r;
        this.y = y;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    static class Rating implements Comparator<Movie1> {
        @Override
        public int compare(Movie1 m1, Movie1 m2) {
            return Double.compare(m1.getR(), m2.getR());
        }
    }


    static class NameCompare implements Comparator<Movie1> {
        @Override
        public int compare(Movie1 m1, Movie1 m2) {
            return m1.getN().compareTo(m2.getN());
        }
    }

    public static void main(String[] args) {
        ArrayList<Movie1> m1 = new ArrayList<>();
        m1.add(new Movie1("Force Awakens", 8.3, 2015));
        m1.add(new Movie1("Star Wars", 8.7, 1977));
        m1.add(new Movie1("Empire Strikes Back", 8.8, 1980));

        System.out.println("Movies sorting by rating");
        Collections.sort(m1, new Rating()); // corrected here
        for (Movie1 m : m1) {
            System.out.println(m.getR() + " " + m.getN() + " " + m.getY());
        }

        System.out.println("\nMovies sorted by name");
        Collections.sort(m1, new NameCompare()); // corrected here
        for (Movie1 m : m1) {
            System.out.println(m.getN() + " " + m.getR() + " " + m.getY());
        }
    }
}

