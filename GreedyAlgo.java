package Practice_Que;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
//Example 1:
/*public class GreedyAlgo {
    public static void main(String[]args){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        int activities[][]= new int [start.length][3];
        for(int i=0; i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]= end[i];
        }
        //lambda function->shortform
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));


        //end time basis sorted
        int maxAct=0;
        ArrayList<Integer> ans= new ArrayList<>();

        //1st activity 
        maxAct =1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i=1; i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("max activity =" +maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A" +ans.get(i)+ " ");
        }
        System.out.println();
    }
}*/

//Example:2
/*
 import java.util.*;
public class Activitysel {
    public static void main(String[]args){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        //end time basis sorted
        int maxAct=0;
        ArrayList<Integer> ans= new ArrayList<>();

        //1st activity 
        maxAct =1;
        ans.add(0);
        int lastEnd = end[0];
        for(int i=1; i<end.length;i++){
            if(start[i]>=lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("max activity =" +maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A" +ans.get(i)+ " ");
        }
        System.out.println();
    }
    
}
*/

//Example 3:

/*
 import java.util.*;
import java.util.Comparator;

public class Indiancoins {
    public static void main(String[]args){
        Integer coins[]={1,2,5,10,20,50,100,500,1000,2000};

        Arrays.sort(coins, Comparator.reverseOrder());
        int countOfCoins=0;
        int amount=590;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            if(coins[i] <=amount){
                while(coins[i]<=amount){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount-=coins[i];

                }
            }

        }
        System.out.println("count of coins:" +countOfCoins);

        for(int i=0; i<ans.size();i++){
            System.out.print(ans.get(i)+ " ");
        }
        System.out.println();

    }
    
}
 */


    



    

