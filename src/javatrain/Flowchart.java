package javatrain;

public class Flowchart {

	public static void flowchart(int a) {
        if (a > 2000) {
            System.out.println("A");
            if (a > 6000) {
                System.out.println("C");
                // THE END            } else {
                System.out.println("B");
                if (a > 4000) {
                    System.out.println("D");
                    // THE END                } else {
                    System.out.println("E");
                    // THE END                }
            }
        } else {
            System.out.println("1");
            if (a > 100) {
                System.out.println("3");
                if (a > 600) {
                    System.out.println("5");
                    // THE END                } else {
                    System.out.println("4");
                    if (a > 500) {
                        System.out.println("6");
                        // THE END                    } else {
                        System.out.println("7");
                        // THE END                    }
                }
            } else {
                System.out.println("2");
                // THE END            }
        }
    }

	}

}
        
        
        
    	/* Flowcharts
        Recreate the following flowchart as a project.

        IterationFlowChart1Exercise

        Recreate the following flowchart as a project.

        IterationFlowChart2Exercise

        Create a method that can print out the numbers 1-10 10 times each.

        If you have used a while()-loop at any point in these exercises, replace them with for()-loops. Remember you should use a for()-loop when you know when the iteration should end.

        Create a method to print the numbers 1 to 10 as many times as the value of that number.
        For example; you will print 1 once, and 10 ten times. */
        	
        	/* Flowcharts
        Create a method which accepts 3 parameters, 2 integers and a boolean.

        If the boolean is true, the method will return a sum of the two numbers, and it if is false it will return the multiplication of the two numbers.
        For example:

        Input (1, 2, true) -> 3
        Input (3, 3, false) -> 9
        Input (1, 1, true) -> 2
        Recreate the following flowchart as a project. Ensure that your logic and outputs match that of the flowchart.
        ConditionalFlowChartExercise

        Create a method that takes a single integer A as a parameter.

        First evaluate if A is greater than 2000. If true, print "A", if false, print "1"

        Next, Directly under print 1 but not outside of the if statement, make another if statement that elaluates if A is greater that 100. If true, print "2", if false, print "3"

        And so on. Be sure to check you are nesting the new if statements in the correct place.

         */
