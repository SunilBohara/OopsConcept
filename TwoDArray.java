package javaapplication22;
public class TwoDArray 
{
    public static void main (String args [])
    {
        int[][] worldPopulation = {//Elements      1E   2E   3E   4E  5E
                   // States for Country1->   0    1    2    3    4   5
                                            {1234,5468,7894,1241,145,456}, //0 ->Country1 (ONE DIMENSIONAL ARRAY)
                                            {1247,2544,5556,578,145,1544}, //0 ->Country2 (ONE DIMENSIONAL ARRAY)
                                            {0123,145,7744,154,147,15,17}  //0 ->Country3 (ONE DIMENSIONAL ARRAY) 
                                  };
        System.out.println("worldPopulation is: "+worldPopulation+" and length is: "+worldPopulation.length);
        System.out.println("worldPopulation[0] is: "+worldPopulation[0]+" and length is: "+worldPopulation[0].length);
        System.out.println("worldPopulation[0] is: "+worldPopulation[1]+" and length is: "+worldPopulation[1].length);
        System.out.println("worldPopulation[0] is: "+worldPopulation[2]+" and length is: "+worldPopulation[2].length);
        
        //Read Single Element 
        System.out.println("worldPopulation[1][2] : " +worldPopulation[1][2]);
        
        // Write/Update Data
        worldPopulation[1][2] = 12345;
        
        System.out.println("==Re Reading==");
        System.out.println("worldPopulation[1][2] : "+worldPopulation[1][2]);
        
        for(int i = 0; i<worldPopulation.length; i++)
        {
            for(int j=0; j<worldPopulation[i].length; j++)
            {
                System.out.print(worldPopulation[i][j]+"  ");
            }
            System.out.println();
        }
        
        int[][] myarray = new int[4][7];
        // 4 1-D arrays with 7 Elements each
        
        for(int a = 0; a<4; a++)
        {
            for(int e = 0; e<7; e++) 
            {
                myarray[a][e] = 1;
            }
        }
        
        System.out.println("myarray: " +myarray);
        for(int k = 0; k<myarray.length; k++)
        {
            for(int m = 0; m<myarray[k].length; m++)
            {
                System.out.print(myarray[k][m]+"  ");
            }
            System.out.println();
        }
        
    }
    
}
