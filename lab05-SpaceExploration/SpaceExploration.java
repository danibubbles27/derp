//Emily Wilkinson
//
// Space Exploration java program
//
//output timeline of significant space explorations btwn 2000-2010
//generate random number to select yr within decade
//output all events in timeline occurring from 2000 till random yr
//if yr is not listed in chart, output 'N/A'

//  define class
public class SpaceExploration {
    
//  add main method
    public static void main (String[] args){
        
//  generate random number
    int randomYear;
    int year = 77;
    randomYear = (int)(11*Math.random()+2000);
    
    if (randomYear == 2010){
        year = 0;
    }
    else if (randomYear == 2008){
        year = 1;
    }
    else if (randomYear == 2006){
        year = 2;
    }
    else if (randomYear == 2005){
        year = 3;
    }
    else if (randomYear == 2003){
        year = 4;
    }
    else if (randomYear == 2001){
        year = 5;
    }
    else if (randomYear == 2000){
        year = 6;
    }
    
    System.out.println(" Here is a timeline of space exploration events from "+randomYear+" to 2000: ");

//  switch statement
    switch (year){
        case 0:
            System.out.println(" 2010: SpaceX successfully sends spacecraft to orbit and back ");
        case 1:
            System.out.println(" 2008: Kepler launched to study deep space ");
        case 2:
            System.out.println(" 2006: Spacecraft returns with collections from a comet ");
        case 3:
            System.out.println(" 2005: Spacecraft collides with comet ");
        case 4:
            System.out.println(" 2003: Largest infrared telescope released ");
        case 5:
            System.out.println(" 2001: First spacecraft lands on asteroid ");
        case 6:
            System.out.println(" 2000:First spacecraft orbits an asteroid ");
  //      default:
  //          System.out.println(" N/A ");
    }
    } 
}