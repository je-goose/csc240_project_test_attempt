/*
Author: Jae Elizabeth Giesen
Date: 3.12.2025
WCUPA CSC240 SP25 Text Processing Project Solo Attempt
Purpose: Revisit core ideas and best practices with machine learning, text processing, and model construction, and applying
         those ideas in a different language (Python -> Java)
 */
package DataHandling;

import java.util.ArrayList;

class TestingDataSet<T,S> extends DataSet<T,S> {

    public TestingDataSet(ArrayList<String> labels, ArrayList<T> x_values, ArrayList<S> y_values) {

    }

    public String[] getLabels() {
        return this.labels;
    };

    public T[] getDependentValues() {
        return this.x_values;
    };

    public S[] getIndependentLabels() {
        return null;
    };

    public void setLabels(String[] labels) {

    };
    public void setDependentValues(double[] dependentValues) {

    };
    public void setIndependentLabels(double[] independentLabels) {

    };
}
