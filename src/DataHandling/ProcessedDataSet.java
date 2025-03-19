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

    ProcessedDataSet(String filename) {
        try {
            Scanner readIn = new Scanner(new File(filename)).useDelimiter("\\Z");

            String[] labels = readIn.nextLine().split(",");

            while (readIn.hasNextLine()) {
                String line = readIn.nextLine();
            }

            // 1st line: labels
            // 2nd-n lines: index 0: y-values (dependent)
            // 2nd-nd lines: index 1-m: x-values (independent)
            //

        } catch (FileNotFoundException e) {

        }
    }

    public static ProcessedDataSet constructProcessedDataSet(String filename) {
        ProcessedDataSet processedDataSet = new ProcessedDataSet(filename);
        return processedDataSet;
    }
}
