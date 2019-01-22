package edu.cnm.deepdive;

public class Demo {

  public static void main (String[] args) {
    System.out.println("Hello, World!");
    long msSinceStartOfTime = System.currentTimeMillis();
    double secondsSinceStartOfTime = msSinceStartOfTime/1000.0;
    long truncated = (long) secondsSinceStartOfTime; // removes the fraction
    long rounded = Math.round(secondsSinceStartOfTime);
      // rounds to nearest int up or down
    System.out.println(secondsSinceStartOfTime);
    System.out.println(truncated);
    System.out.println(rounded);
  }

}
