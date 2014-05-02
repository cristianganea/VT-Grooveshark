package org.graphwallker.examples;

import org.graphwalker.conditions.EdgeCoverage;
import org.graphwalker.examples.modelAPI.Amazon;
import org.graphwalker.examples.modelAPI.Grooveshark;
import org.graphwalker.exceptions.StopConditionException;
import org.graphwalker.generators.A_StarPathGenerator;
import org.graphwalker.multipleModels.ModelHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

public class GroovesharkTest {

    @Test
    public void walk() throws InterruptedException, URISyntaxException, StopConditionException {
        ModelHandler modelhandler = new ModelHandler();

        // Get the model from resources
        URL url = MultiModelTest.class.getResource("/model/MusicQueue.graphml");
        System.out.println(url);
        File file = new File(url.toURI());

        // Connect the model to a java class, and add it to graphwalker's modelhandler.
        // The model is to be executed using the following criteria:
        // EFSM: Extended finite state machine is set to true, which means we are using the data domain
        // in the model
        // Generator: a_star, we want to walk through the model using shortest possible path.
        // Stop condition: Edge coverage 100%, we want to walk every edge in the model.
        modelhandler.add("Grooveshark", new Grooveshark(file, true, new A_StarPathGenerator(new EdgeCoverage(1.0)), false));

        // Start executing the test
        modelhandler.execute("Grooveshark");

        // Verify that the execution is complete, fulfilling the criteria from above.
        Assert.assertTrue(modelhandler.isAllModelsDone(), "Not all models are done");

        // Print the statistics from graphwalker
        String actualResult = modelhandler.getStatistics();
        System.out.println(actualResult);
    }
}
