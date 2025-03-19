package DataHandling;

/**
 * Author: Jae Elizabeth Giesen
 * Date: 2.20.2025 WCUPA CSC240 HW4
 * Purpose: Implement DataRow from UML for HW4
 */
/*
 Extended by: Jae Elizabeth Giesen
 Data: 3.12.2025
 Purpose: Repurpose DataRow from HW4 for Text Processing Project.
 */


public class DataRow {
    protected double[] x;

    /**
     * @param x the array of independent variables
     */
    public DataRow(double[] x)
    {
        // initialize fields here
        this.x = x;
    }

    /**
     * @return the array of independent variables
     */
    public double[] getDependentVariables() {
        return this.x;
    }
}
