package org.graphwallker.examples;

import org.graphwalker.conditions.EdgeCoverage;
import org.graphwalker.conditions.ReachedVertex;
import org.graphwalker.conditions.VertexCoverage;
import org.graphwalker.examples.modelAPI.Grooveshark;
import org.graphwalker.exceptions.StopConditionException;
import org.graphwalker.generators.A_StarPathGenerator;
import org.graphwalker.generators.CombinedPathGenerator;
import org.graphwalker.generators.RandomPathGenerator;
import org.graphwalker.multipleModels.ModelHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

public class GroovesharkTest {

    @Test
    public void walk_a_star() throws InterruptedException, URISyntaxException, StopConditionException {
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
    
    @Test
    public void walk_random() throws InterruptedException, URISyntaxException, StopConditionException {
        ModelHandler modelhandler = new ModelHandler();

        // Get the model from resources
        URL url = MultiModelTest.class.getResource("/model/MusicQueue.graphml");
        System.out.println(url);
        File file = new File(url.toURI());

        // Connect the model to a java class, and add it to graphwalker's modelhandler.
        // The model is to be executed using the following criteria:
        // EFSM: Extended finite state machine is set to true, which means we are using the data domain
        // in the model
        // Generator: random, walk through the model randomly
        // Stop condition: Edge coverage 100%, we want to walk every edge in the model.
        modelhandler.add("Grooveshark", new Grooveshark(file, true, new RandomPathGenerator(new EdgeCoverage(1.0)), false));

        // Start executing the test
        modelhandler.execute("Grooveshark");

        // Verify that the execution is complete, fulfilling the criteria from above.
        Assert.assertTrue(modelhandler.isAllModelsDone(), "Not all models are done");

        // Print the statistics from graphwalker
        String actualResult = modelhandler.getStatistics();
        System.out.println(actualResult);
    }
    
    @Test
    public void walk_album() throws InterruptedException, URISyntaxException, StopConditionException {
        ModelHandler modelhandler = new ModelHandler();

        // Get the model from resources
        URL url = MultiModelTest.class.getResource("/model/MusicQueue.graphml");
        System.out.println(url);
        File file = new File(url.toURI());

        // Connect the model to a java class, and add it to graphwalker's modelhandler.
        // The model is to be executed using the following criteria:
        // Go the fastest path to the vertex v_ShoppingCart.
        modelhandler.add("Grooveshark", new Grooveshark(file, true, new A_StarPathGenerator(new ReachedVertex("v_SongDisplay")), false));

        // Start executing the test
        modelhandler.execute("Grooveshark");

        // Verify that the execution is complete, fulfilling the criteria from above.
        Assert.assertTrue(modelhandler.isAllModelsDone(), "Not all models are done");

        // Print the statistics from graphwalker
        String actualResult = modelhandler.getStatistics();
        System.out.println(actualResult);
    }
    
    @Test
    public void multipleStopConditions() throws InterruptedException, StopConditionException, URISyntaxException {
        ModelHandler modelhandler = new ModelHandler();

        // Get the model from resources
        URL url = MultiModelTest.class.getResource("/model/MusicQueue.graphml");
        File file = new File(url.toURI());

        /*  This setup does following:
         *    Execute a test that covers all vertices. After that, execute until
         *    we have reached the vertex with label:  v_ShoppingCart
         */
        CombinedPathGenerator generator = new CombinedPathGenerator();
        generator.addPathGenerator(new RandomPathGenerator(new VertexCoverage(1.0)));
        generator.addPathGenerator(new RandomPathGenerator(new ReachedVertex("v_ArtistDisplay")));
        modelhandler.add("Grooveshark", new Grooveshark(file, true, generator, false));

        // Start executing the test
        modelhandler.execute("Grooveshark");

        // Verify that the execution is complete, fulfilling the criteria from above.
        Assert.assertTrue(modelhandler.isAllModelsDone(), "Not all models are done");

        // Print the statistics from graphwalker
        String actualResult = modelhandler.getStatistics();
        System.out.println(actualResult);
    }
}
