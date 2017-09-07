import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

@Listeners({TestNgListener.class})
public class UserTest {

  @Test
  public void successMethod() {

  }
  @Test
  public void failureMethod() {
    fail();
  }
}
