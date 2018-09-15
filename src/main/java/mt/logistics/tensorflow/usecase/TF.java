package mt.logistics.tensorflow.usecase;

import org.tensorflow.Session;
import org.tensorflow.TensorFlow;
import org.tensorflow.Graph;

public class TF {
    public static void probe() {
        System.out.println(TensorFlow.version());
    }

    public void createTFModel() {
        //Session session = new Session();
        Graph graph = new Graph();

    }
}
