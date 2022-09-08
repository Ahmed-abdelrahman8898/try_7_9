package runner;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import net.masterthought.cucumber.json.support.Status;
import net.masterthought.cucumber.presentation.PresentationMode;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",glue= {"StepDefinitions"},
plugin = {"pretty", "json:target/cucumber.json", "junit:target/cucumber.xml"},
tags = "@Autom123")





public class Test {
	
	
	
	@AfterClass
    public static void clean()
    {
      List<String> jsonFiles = new ArrayList();
      String path =System.getProperty("user.dir") + "/target/cucumber.json";
      jsonFiles.add(path);

      //utilities.Utilities.generateReport("Test Report",jsonFiles);
    }
 
 
  

	

}
