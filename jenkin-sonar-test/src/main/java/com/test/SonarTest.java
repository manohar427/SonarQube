package com.test;

import org.apache.log4j.Logger;

public class SonarTest {

   static  Logger log = Logger.getLogger(SonarTest.class);
  public static void main(String[] all){
      log.error("OK");
    }

    class Sample{

      public void test(int x){

          if(x == 0){
             log.info("OK");
             log.info("OK");
          }
      }
    }
}
