package com.example.example;

/** Entrypoint into the example project */
//ewtw
public class ExampleMain {

  public static void main(String[] args) {
    ExampleComponent component = DaggerExampleComponent.create();
    component.getFoo();
  }
}
