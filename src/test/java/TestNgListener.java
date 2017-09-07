import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Listeners;

@Listeners
public class TestNgListener extends TestListenerAdapter {
  public void onTestStart(ITestResult result) {
    System.out.println("onTestStart");
  }

  public void onTestSuccess(ITestResult result) {
    System.out.println(String.format("onTestSuccess - Name:%s, Host:%s instance:%s", result.getName(), result.getHost(),
      result.getInstanceName()));
  }

  public void onTestFailure(ITestResult result) {
    System.out.println(String.format("onTestFailure - Name:%s, Host:%s instance:%s", result.getName(), result.getHost(), result.getInstanceName()));
  }

  public void onStart(ITestContext context) {
    System.out.println(String.format("%s onStart on %s", context.getName(), context.getHost()));
  }

  public void onFinish(ITestContext context) {
    System.out.println(String.format("%s onFinish on %s", context.getName(), context.getHost()));
  }
}
