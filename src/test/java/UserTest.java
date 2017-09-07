import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestNgListener.class})
public class UserTest {

  @Test
  public void hello() {
    System.out.println("hello");
  }
}
