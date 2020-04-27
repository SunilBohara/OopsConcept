package javaapplication22;
public class OneDArray{
    
    public static void main( String args [])
    {
        //Multi Value Container
        //int[] statePopulation = {444,556,564,456,547}; // Elements have some default initial value
        int[] statePopulation = new int[5]; // All Elements were be default 0
        System.out.println("statePopuulation is: " +statePopulation);
        
        //Read the element in Array
        System.out.println("statePopulation[0] is: "+statePopulation[0]);
        System.out.println("statePopulation[4] is: "+statePopulation[4]);
        
        for(int i = 0; i<statePopulation.length; i++)
        {
            System.out.println("statePopulation["+i+"] is :" +statePopulation[i]);
        }
        // Write //Update Operation
        statePopulation[0] = 444;
        statePopulation[1] = 556;
        statePopulation[2] = 564;
        statePopulation[3] = 456;
        statePopulation[4] = 547;
        
        System.out.println();
        System.out.println("==Re Reading After Write Opreation==");
        for(int i = 0; i<statePopulation.length; i++)
        {
            System.out.println("statePopulation["+i+"] is :" +statePopulation[i]);
        }
        
        for(int Storing : statePopulation)
        {
            System.out.println(Storing);
        }
    }
}
