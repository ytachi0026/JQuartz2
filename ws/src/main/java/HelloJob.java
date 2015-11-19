import org.quartz.*;

/**
 * Created by yborja on 11/19/2015.
 */
public class HelloJob implements Job{
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("Hello Job");
    }
}
