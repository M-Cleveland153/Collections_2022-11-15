package com.cooksys.ftd.assignments.collections;

import com.cooksys.ftd.assignments.collections.model.Manager;
import com.cooksys.ftd.assignments.collections.model.OrgChart;
import com.cooksys.ftd.assignments.collections.model.Worker;

import ch.qos.logback.core.joran.action.NewRuleAction;

public class Main {

    /**
     * TODO [OPTIONAL]: Students may use this main method to manually test their code. They can instantiate Employees
     *  and an OrgChart here and test that the various methods they've implemented work as expected. This class and
     *  method are purely for scratch work, and will not be graded.
     */
    public static void main(String[] args) {
    	Manager AM = new Manager("AM");
    	Manager B1M = new Manager("B1M", AM);
    	Manager B2M = new Manager("B2M", AM);
    	Manager B3M = new Manager("B3M", AM);
    	Worker B4W = new Worker("B4W", AM);
    	Worker B5W = new Worker("B5W", AM);
    	Worker C1W_B1M = new Worker("C1W_B1M", B1M);
    	Worker C2W_B1M = new Worker("C2W_B1M", B1M);
    	Worker C3W_B2M = new Worker("C3W_B2M", B2M);
    	Worker C4W_B2M = new Worker("C4W_B2M", B2M);
    	Worker C5W_B3M = new Worker("C5W_B3M", B3M);
    	Worker C6W_B3M = new Worker("C6W_B3M", B3M);
    	
    	
    	OrgChart orgChart = new OrgChart();
    	System.out.println("getAllEmployees:");
    	System.out.println(orgChart.getAllEmployees());
    	System.out.println("getAllManagers");
    	System.out.println(orgChart.getAllManagers());  
    	
    	System.out.println("Now adding C6W_B3W");
    	
    	orgChart.addEmployee(C6W_B3M); 
    	
    	System.out.println("getAllEmployees:");
    	System.out.println(orgChart.getAllEmployees());
    	System.out.println("getAllManagers");
    	System.out.println(orgChart.getAllManagers());
    	
    	System.out.println(AM);
    }

}
