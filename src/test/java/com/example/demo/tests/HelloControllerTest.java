package com.example.demo.tests;

import org.junit.jupiter.api.Test;

import com.example.demo.controller.HelloController;

import static org.junit.jupiter.api.Assertions.*;

public class HelloControllerTest {

 @Test
 public void testHello() {

  HelloController controller = new HelloController();

  assertEquals("Hello, World!", controller.hello());

 }

}