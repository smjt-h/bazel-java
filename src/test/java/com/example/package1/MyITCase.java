package com.example.package1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/nbn
@RunWith(JUnit4.class)
public class MyITCase {

  @Test
  public void testEverything() throws Exception {
    Main.main(MyLibrary.TEST_DATA);
  }
}
