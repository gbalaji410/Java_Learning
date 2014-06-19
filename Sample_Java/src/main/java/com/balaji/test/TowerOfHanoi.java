package com.balaji.test;

/**
 * Towers of Hanoi
 * Pole are labeled 1, 2,3
 * Each disk is also labeled
 * @author Lars Vogel
 *
 */

public class TowerOfHanoi {
  public static void move(int n, int startPole, int endPole) {
    if (n== 0){
      return; 
    }
    int intermediatePole = 6 - startPole - endPole;
    move(n-1, startPole, intermediatePole);
    System.out.println("Move " +n + " from " + startPole + " to " +endPole);
    move(n-1, intermediatePole, endPole);
  }
  
  public static void main(String[] args) {
    move(3, 1, 3);
  }

  
} 
