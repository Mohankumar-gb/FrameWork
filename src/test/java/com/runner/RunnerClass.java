package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources"},glue= {"com.stepdefinition"},
tags= {"@SanityTest,@SmokeTest"},monochrome=true,dryRun=false,snippets = SnippetType.CAMELCASE,
plugin = {"pretty","html:c:/home/qq429/eclipse-workspace/newcucumber/target/cucumber-reports/Cucumber.html"})

public class RunnerClass {

}
