package mt.logistics.tensorflow.usecase.controllers;

import org.tensorflow.Graph;
import org.tensorflow.Tensor;
import org.tensorflow.TensorFlow;

import java.net.URL;
import java.util.ResourceBundle;

public class LearnController extends MainController {

    public void initialize(URL location, ResourceBundle resources) {
        String value = "Hello from " + TensorFlow.version();
        Graph g = new Graph();
        //Tensor t = new Tensor.create();
    }
}
