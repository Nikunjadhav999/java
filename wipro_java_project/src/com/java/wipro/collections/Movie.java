package com.java.wipro.collections;
import java.util.ArrayList;
import java.util.Collections; 

/**
 * @author Nikunj
 */

 public class Movie implements Comparable<Movie> 
 {
	 private String n;
	 private double r;
	 private int y;
	 
	 
	 public Movie(String n,double r,int y )
	 {
		 this.n=n;
		 this.r=r;
		 this.y=y;
	 }
	 public int compareTo(Movie m)
     {
		 return this.y - m.y;
	 }
	 public  String getName()
	 {
		 return n;
	 }
	 public  double getRating()
	 {
		 return r;
	 }

	 public  int getYear()
	 {
		 return y;
	 }

	public static void main(String[] args) {
		// TODOAuto-generated method stub
		ArrayList<Movie> l = new ArrayList<>();
		l.add(new Movie("Star Wars", 8.7, 1977));
		l.add(new Movie("Empire Strike Back", 8.8, 1990));
		l.add(new Movie("Return of the Jedi", 8.4, 1982));
		
		Collections.sort(l);
		
		System.out.println("Movies after sorting by Year");
		for(Movie m :l) {
			System.out.println(m.getName()+" "+m.getRating()+" "+m.getYear());
		}
		

	}

}
