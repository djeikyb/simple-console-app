package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main
{
  private static final Logger log = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args)
  {
    System.out.println("hello world from main()");
    log.trace("hello world trace");
  }
}
