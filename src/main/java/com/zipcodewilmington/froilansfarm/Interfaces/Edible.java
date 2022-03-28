package com.zipcodewilmington.froilansfarm.Interfaces;

public abstract class Edible {
   public static int count = 0;


   public static int consumed() {
      if (count > 0) {
         return count--;
      }
      return count;
   }

   public static int harvested() {
      return count++;
   }

   public static int currentCount() {
      return count;
   }

}
