/*
Author: Jae Elizabeth Giesen
Date: 3.12.2025
WCUPA CSC240 SP25 Text Processing Project Solo Attempt
Purpose: Revisit core ideas and best practices with machine learning, text processing, and model construction, and applying
         those ideas in a different language (Python -> Java)
 */
package DataHandling;

import java.util.ArrayList;

/**
 * Class implementing a validation dataset.
 * @param <T> - The type of the independent variable (x-values)
 * @param <S> - The type of the dependent variable (y-values)
 */
class ValidationDataSet<T,S> extends DataSet<T,S> {

    protected ValidationDataSet(ArrayList<String> labels, ArrayList<T> x_values, ArrayList<S> y_values) {

    }

    public String[] getLabels() {
        return new String[] {""};
    };
    public ArrayList<T> getDependentValues() {
        return new ArrayList<>();
    };
    public S[] getIndependentLabels() {
        return new double[0];
    };

    public void setLabels(String[] labels) {

    };
    public void setDependentValues(double[] dependentValues) {

    };
    public void setIndependentLabels(double[] independentLabels) {

    };
}
