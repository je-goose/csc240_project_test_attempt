package Model;

/**
 * Project name: csc240_project_test_attempt
 * Package: Model
 * Author: Jae Elizabeth Giesen
 * Date: 3/24/2025
 * Purpose:
 * Modified on:
 */

/*
Outline:
Step 1: Calculate Euclidean Distance.
Step 2: Get Nearest Neighbors.
Step 3: Make Predictions.
 */

import DataHandling.*;
import java.lang.Math;
import java.util.ArrayList;


public class KNNModel extends Model {

    // Public methods

    /**
     * C'tor
     */
    public KNNModel() {}

    /**
     *
     */
    public void predict() {}

    public void train() {}

    public double calculateEuclideanDistance(double[] row1, double[] row2) {
        double distance = 0.0;
        for (int i = 0; i < row1.length; i++) {
            distance += Math.pow(row1[i] - row2[i], 2);
        }
        return Math.sqrt(distance);
    }

    public void getNearestNeighbors(int numNeighbors) {
        ArrayList<Double> distances = new ArrayList<Double>();

        distances.sort();

        for (int i = 0; i < numNeighbors; i++) {
            double distance = distances.get(i);
        }
    }
    public void makePredictions(double[] train, double[] test, int numNeighbors) {}
}
