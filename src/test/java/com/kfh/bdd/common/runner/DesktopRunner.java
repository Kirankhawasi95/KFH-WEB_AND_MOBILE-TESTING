package com.kfh.bdd.common.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.kfh.bdd.integrations.NG_listners.APIEvent;
import com.kfh.bdd.integrations.NG_listners.DesktopEvent;
import com.kfh.bdd.integrations.NG_listners.SuiteEvent;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;



@Listeners({ SuiteEvent.class, DesktopEvent.class })
@CucumberOptions(features = { "src/test/java/com/kfh/bdd/desktop/features" }, glue = {
		"com/kfh/bdd/desktop/step_definitions", "com/kfh/bdd/common/hooks" },
         tags = "@GFS_Desktop",plugin = { "pretty", "json:target/cucumber/Desktopcucumber.json", "html:target/site/cucumber-pretty/cucumberDesktop.html",
				"rerun:target/api_rerun.txt","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" },monochrome = true, publish = true, dryRun = false)
public class DesktopRunner {
	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		System.out.println("@Before class");
	}

	@Test(groups = "cucumber", description = "Run Cucumber Scenario", dataProvider = "scenarios")
	public void scenario(PickleWrapper pickleEventWrapper, FeatureWrapper cucumberFeatureWrapper) throws Throwable {
		testNGCucumberRunner.runScenario(pickleEventWrapper.getPickle());
	}

	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		System.out.println("@Data provider");
		if (testNGCucumberRunner == null) {
			testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		}

		return testNGCucumberRunner.provideScenarios();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() {
		System.out.println("@Afterclass");
		testNGCucumberRunner.finish();
	}

}
