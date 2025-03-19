/*
Author: Jae Elizabeth Giesen
Date: 3.12.2025
WCUPA CSC240 SP25 Text Processing Project Solo Attempt
Purpose: Revisit core ideas and best practices with machine learning, text processing, and model construction, and applying
         those ideas in a different language (Python -> Java)
         Abstract base class
 */
package DataHandling;

import java.util.ArrayList;

abstract class DataSet<T> {
    // Member variables
    protected ArrayList<String> labels;
    protected ArrayList<DataRow> x_values;
    protected ArrayList<Double> y_values;

    private DataSet() {
        this.labels = new ArrayList<String>();
    }

    // Getter Methods (Public)
    public abstract String[] getLabels();
    public abstract double[] getDependentValues();
    public abstract double[] getIndependentLabels();

    // Setter Methods (Private)
    abstract void setLabels(String[] labels);
    abstract void setDependentValues(double[] dependentValues);
    abstract void setIndependentLabels(double[] independentLabels);

    // Add'l Public Methods
    // Add'l Private Methods
}
