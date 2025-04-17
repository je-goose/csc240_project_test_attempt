/*
Author: Jae Elizabeth Giesen
Date: 3.12.2025
WCUPA CSC240 SP25 Text Processing Project Solo Attempt
Purpose: Revisit core ideas and best practices with machine learning, text processing, and model construction, and applying
         those ideas in a different language (Python -> Java)
         Implement a DataSet. Composed of Training, Testing, Validation subsets, to be split on construction.
 */
package DataHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProcessedDataSet {
    private TestingDataSet testingDataSet;
    private TrainingDataSet trainingDataSet;
    private ValidationDataSet validationDataSet;

    protected ProcessedDataSet(DataSet<> test, DataSet<> train, DataSet<> validate) {
        this.testingDataSet = (TestingDataSet) test;
        this.trainingDataSet = (TrainingDataSet) train;
        this.validationDataSet = (ValidationDataSet) validate;
    }

    public ProcessedDataSet constructProcessedDataSet(String filename) {
        return DataIntake.constructPrDataSet(filename);
    }

    public DataSet getTestingDataSet() {}

    public DataSet getTrainingDataSet() {}

    public DataSet getValidationDataSet() {}
}
