package com.test;

import org.apache.log4j.Logger;

public class SonarMaven {

   static  Logger log = Logger.getLogger(SonarMaven.class);
  public static void main(String[] all){
      log.error("OK");
    }

    public static String getHelloWorld() {
        return "Hello World";
    }

    public static String getHelloWorld2() {
        return "Hello World 2";
    }

    public static String getHelloWorld3() {
        return "Hello World 3";
    }

    class Sample{

      public void test(int x){

          if(x == 0){
             log.info("OK");
          }
      }
    }
}
