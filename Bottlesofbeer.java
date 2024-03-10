//Create an application that prints all of the lyrics to '99 bottles of beer' 

//Neil McCarthy - x23319828
public class Bottlesofbeer {
    public static void main(String[] args) {
        //Declare variables
            int numBottles = 99;
            //Loop to print the lyrics
            while (numBottles > 1) {
                System.out.println(numBottles + " bottles of beer on the wall, " + numBottles + " bottles of beer");
                System.out.println("Take one down, pass it around, " + (numBottles - 1) + " bottles of beer on the wall");
                numBottles--;
                //If statement to change the bottle lyric to singular
                if (numBottles == 2) {
                    System.out.println(numBottles + " bottles of beer on the wall, " + numBottles + " bottles of beer");
                    System.out.println("Take one down, pass it around, " + (numBottles - 1) + " bottle of beer on the wall");
                    numBottles--;
                } 
                //If statement for the final verses
                if (numBottles == 1) {
                    System.out.println(numBottles + " bottle of beer on the wall, " + numBottles + " bottle of beer");
                    System.out.println("Take one down, pass it around, no more bottles of beer on the wall");
                    System.out.println("No more bottles of beer on the wall, no more bottles of beer");
                    System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall"); 
                    System.exit(0);      
                
            }
        }
    }
}
