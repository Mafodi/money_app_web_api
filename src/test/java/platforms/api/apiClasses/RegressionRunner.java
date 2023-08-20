package platforms.api.apiClasses;

import com.intuit.karate.cucumber.CucumberRunner;
import com.intuit.karate.cucumber.KarateStats;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * an alternative way to run selected paths, tags and even features using the
 * java api here you don't need to use the CucumberOptions and you can
 * dynamically determine the features that need to be executed
 *
 * @author pthomas3
 */
public class RegressionRunner {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Initializing Test and running security token to run test");
        SecurityTokenRunner str = new SecurityTokenRunner();
        str.securityToken();
        System.out.println("Now running the test");
    }

    @Test
    public void regressionTest() {
        try{
            List<String> tags = Arrays.asList("@OrderAPI,@RefApi,@ConfigAPI");
//            List<String> tags = Arrays.asList("~@VASSecurityToken");
            List<String> features = Arrays.asList("src/test/feature/api/");
            String karateOutputPath = "target/surefire-reports";
            KarateStats stats = CucumberRunner.parallel(tags, features, 1, karateOutputPath);
            System.out.println("Pringitng out Karate Output :::: "+karateOutputPath);
            KarateUtil.generateReport(karateOutputPath, KarateUtil.getMethodName());
            Assert.assertEquals(0, stats.getFailCount());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

//    @BeforeClass
//    public static void beforeClass() {
//        System.out.println("Initializing RegressionRunner to run test");
//
//    }
//
//    @Test
//    public void regressionTest() {
//        try{
//            List<String> tags = Arrays.asList("@OrderAPI");
//            List<String> features = Arrays.asList("src/test/feature/api/");
//            String karateOutputPath = "target/surefire-reports";
//            KarateStats stats = CucumberRunner.parallel(tags, features, 1, karateOutputPath);
//            System.out.println("Printing out Karate Output :::: "+karateOutputPath);
//            KarateUtil.generateReport(karateOutputPath, KarateUtil.getMethodName());
//            Assert.assertEquals(0, stats.getFailCount());
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//    }
}
