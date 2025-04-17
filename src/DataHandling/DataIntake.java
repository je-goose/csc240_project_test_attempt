/*
Author: Jae Elizabeth Giesen
Date: 3.12.2025
WCUPA CSC240 SP25 Text Processing Project Solo Attempt
Purpose: Revisit core ideas and best practices with machine learning, text processing, and model construction, and applying
         those ideas in a different language (Python -> Java)
         Read in a given source to a ProcessedDataSet object
 */
package DataHandling;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class DataIntake<T,S> {
    protected static ProcessedDataSet constructPrDataSet(String filename, int labelIndex) {
        try {
            Scanner scanner = new Scanner(new File(filename));
            String[] labels = scanner.nextLine().split(",");
            ArrayList<Double> y_values = new ArrayList<>();
            ArrayList<ArrayList<Double>> x_values = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(",");
                ArrayList<Double> x_row = new ArrayList<>();
                y_values.add(Double.parseDouble(values[labelIndex]));
                for (int i = 0; i < values.length - 1; i++) {
                    if (i == labelIndex) continue;
                    x_row.add(Double.parseDouble(values[i]));
                }
                x_values.add(x_row);
            }
            scanner.close();

            // split dataset
            int sizeOfDataSet = y_values.size();
            int index1 = ( 7 * sizeOfDataSet ) / 10; // 70% of the data
            int index2 = ( 9 * sizeOfDataSet ) / 10; // 20% of the data
            int index3 = sizeOfDataSet; // 10% of the data

            // todo: create the DataSet objects
            DataSet<Double, Boolean> trainingDataSet = new TrainingDataSet();
            DataSet<Double, Boolean> testingDataSet = new TestingDataSet();
            DataSet<Double, Boolean> validationDataSet = new ValidationDataSet();

            return new ProcessedDataSet(trainingDataSet, testingDataSet, validationDataSet);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("In: class DataIntake\n" + "Error reading file: " + filename);
        }

        return null;
    }

    protected static ProcessedDataSet constructPrDataSetText(String filename, int labelIndex) {}

    protected static ProcessedDataSet constructPrDataSetNum(String filename, int labelIndex) {}
}
