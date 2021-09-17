/*
Lab 4
Partners: 
Parker Cann
Date: (whatever date you turn it in)
*/

import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println("This is Lab 4");

    Random rand = new Random();

    int maxVal = 50;

    int randomNum = rand.nextInt(maxVal +1);
    System.out.println("The random number is: " + randomNum);

    int decNum = randomNum;

    while(decNum != 0){
      decNum--;
      System.out.println(decNum);
    }

    if(randomNum <= 5){
      System.out.println("Ahoy mateys!");
    }
    else if(randomNum > 25 && randomNum < 42){
      System.out.println("Cannonball!");
    }
    else{
      System.out.println("Blast off!");
    }

  }
}