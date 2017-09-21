package app;

import static org.hamcrest.CoreMatchers.contrainsString;
import static org.junit.Assert.*

import org.junit.Test;

public class MessageTest {
  
  private App message = new App();
  
  @Test
  public void messageSayHello() {
    assertThat(message.sayHello(), contrainsString("hi,");
               }
}
