$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/home.feature");
formatter.feature({
  "name": "Homepage",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@vip"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User checks the item of the home page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to Contacts Page",
  "keyword": "When "
});
formatter.step({
  "name": "User should see following titles on Contacts Page",
  "keyword": "Then ",
  "rows": [
    {
      "cells": [
        "FUSE"
      ]
    },
    {
      "cells": [
        "Charlie Adams"
      ]
    },
    {
      "cells": [
        "adams.charlie@mail.com"
      ]
    },
    {
      "cells": [
        "APPLICATIONS"
      ]
    },
    {
      "cells": [
        "Sample"
      ]
    },
    {
      "cells": [
        "Contacts"
      ]
    },
    {
      "cells": [
        "CUSTOM FUNCTION"
      ]
    },
    {
      "cells": [
        "Customize"
      ]
    },
    {
      "cells": [
        "Documentation"
      ]
    },
    {
      "cells": [
        "Changelog"
      ]
    }
  ]
});
formatter.step({
  "name": "User should see \"\u003cPage Heading\u003e\" \"\u003cPage URL\u003e\" \"\u003cPage Title\u003e\" is as expected",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Page Heading",
        "Page URL",
        "Page Title"
      ]
    },
    {
      "cells": [
        "Contacts",
        "https://mohammedzakaria2.github.io/contacts-list/apps/contacts",
        "Fuse Angular - Material Design Admin Template"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the Contact page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.Pro247.stepDefinitions.HomeStepdefs.userIsOnTheContactPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User checks the item of the home page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@vip"
    }
  ]
});
formatter.step({
  "name": "User navigates to Contacts Page",
  "keyword": "When "
});
formatter.match({
  "location": "com.Pro247.stepDefinitions.HomeStepdefs.userNavigatesToContactsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see following titles on Contacts Page",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.Pro247.stepDefinitions.HomeStepdefs.userShouldSeeFollowingTitlesOnContactsPage(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see \"Contacts\" \"https://mohammedzakaria2.github.io/contacts-list/apps/contacts\" \"Fuse Angular - Material Design Admin Template\" is as expected",
  "keyword": "And "
});
formatter.match({
  "location": "com.Pro247.stepDefinitions.HomeStepdefs.userShouldSeeIsAsExpected(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[https://mohammedzakaria2.github.io/contacts-list/apps/contacts]\u003e but was:\u003c[Fuse Angular - Material Design Admin Template]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.Pro247.stepDefinitions.HomeStepdefs.userShouldSeeIsAsExpected(HomeStepdefs.java:66)\r\n\tat ✽.User should see \"Contacts\" \"https://mohammedzakaria2.github.io/contacts-list/apps/contacts\" \"Fuse Angular - Material Design Admin Template\" is as expected(file:///C:/Users/Freedom/IdeaProjects/StudyCase_247Pro/src/test/resources/features/home.feature:28)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the Contact page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.Pro247.stepDefinitions.HomeStepdefs.userIsOnTheContactPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User checks language item works properly",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@vip"
    }
  ]
});
formatter.step({
  "name": "User clicks the language buttom",
  "keyword": "When "
});
formatter.match({
  "location": "com.Pro247.stepDefinitions.HomeStepdefs.userClicksTheLanguageButtom()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see following languages options",
  "rows": [
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.Pro247.stepDefinitions.HomeStepdefs.userShouldSeeFollowingLanguagesOptions()"
});
formatter.result({
  "error_message": "io.cucumber.core.exception.CucumberException: Step [User should see following languages options] is defined with 0 parameters at \u0027com.Pro247.stepDefinitions.HomeStepdefs.userShouldSeeFollowingLanguagesOptions()\u0027.\nHowever, the gherkin step has 1 arguments:\n * Table:\n      | English |\n      | Turkish |\n\nStep text: User should see following languages options\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.arityMismatch(PickleStepDefinitionMatch.java:134)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:42)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.apache.maven.surefire.junitcore.pc.Scheduler$1.run(Scheduler.java:405)\r\n\tat org.apache.maven.surefire.junitcore.pc.InvokerStrategy.schedule(InvokerStrategy.java:54)\r\n\tat org.apache.maven.surefire.junitcore.pc.Scheduler.schedule(Scheduler.java:362)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.apache.maven.surefire.junitcore.pc.Scheduler$1.run(Scheduler.java:405)\r\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)\r\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\r\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)\r\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)\r\n\tat java.base/java.lang.Thread.run(Thread.java:830)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User clicks unselected option and checks the page\u0027s language is changed",
  "keyword": "And "
});
formatter.match({
  "location": "com.Pro247.stepDefinitions.HomeStepdefs.userClicksUnselectedOptionAndChecksThePageSLanguageIsChanged()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png", "screenshot");
formatter.after({
  "status": "passed"
});
});