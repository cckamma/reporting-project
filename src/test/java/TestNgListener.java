import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Listeners;

import java.util.Date;

@Listeners
public class TestNgListener extends TestListenerAdapter {
  public void onTestStart(ITestResult result) {
    System.out.println(String.format("method %s", result.getMethod().getMethodName()));
  }

  public void onTestSuccess(ITestResult result) {
    System.out.println(String.format("onTestSuccess - Name:%s, Host:%s instance:%s", result.getName(), result.getHost(),
      result.getInstanceName()));
  }

  public void onTestFailure(ITestResult result) {
    System.out.println(String.format("onTestFailure - Name:%s, Host:%s instance:%s", result.getName(), result.getHost(), result.getInstanceName()));
  }

  public void onStart(ITestContext context) {
    System.out.println(String.format("Testing Started for %s @%s", context.getName(), new Date()));
  }

  public void onFinish(ITestContext context) {
    System.out.println(String.format("Testing Finished for %s @%s", context.getName(), new Date()));  }
}
