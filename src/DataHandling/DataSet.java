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

/**
 * Abstract class representing a dataset.
 * @param <T> - The type of the independent variable (x-values)
 * @param <S> - The type of the dependent variable (y-values)
 */
public abstract class DataSet<T,S> {
    // Member variables
    protected String[] labels;
    protected ArrayList<T> x_values;
    protected ArrayList<S> y_values;

    protected DataSet(String[] labels, ArrayList<T> x_values, ArrayList<S> y_values) {
        this.labels = labels;
        this.x_values = x_values;
        this.y_values = y_values;
    }

    // Getter Methods (Public)
    public abstract String[] getLabels();
    public abstract T[] getDependentValues();
    public abstract S[] getIndependentLabels();

    // Setter Methods (Private)
    protected abstract void setLabels(String[] labels);
    protected abstract void setDependentValues(ArrayList<T> dependentValues);
    protected abstract void setIndependentLabels(ArrayList<S> independentLabels);

    // Add'l Public Methods
    // Add'l Private Methods
}
