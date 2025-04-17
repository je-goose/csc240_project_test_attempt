/*
Author: Jae Elizabeth Giesen
Date: 3.12.2025
WCUPA CSC240 SP25 Text Processing Project Solo Attempt
Purpose: Revisit core ideas and best practices with machine learning, text processing, and model construction, and applying
         those ideas in a different language (Python -> Java)
 */
package DataHandling;

import java.util.ArrayList;

class TrainingDataSet<T,S> extends DataSet<T,S> {
    protected TrainingDataSet(ArrayList<String> labels, ArrayList<T> x_values, ArrayList<S> y_values) {
    }

    public String[] getLabels() {
        return new String[] {""};
    };
    public T[] getDependentValues() {
        return null;
    };
    public S[] getIndependentLabels() {
        return null;
    };

    public void setLabels(String[] labels) {
        this.labels = labels;
    };
    public void setDependentValues(ArrayList<T> dependentValues) {
        this.x_values = dependentValues;
    };
    public void setIndependentLabels(ArrayList<S> independentLabels) {
        this.y_values = independentLabels;
    };
}
