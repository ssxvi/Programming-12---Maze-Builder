public class mazeObject {
 
    int row;
    int column;
    boolean wall;
    
    mazeObject(int rowP, int columnP, boolean wallP){
        row = rowP;
        column = columnP;
        wall = wallP;
    }


    public boolean wall(){

        if (wall == false){
            
            wall = true;
            
            return true;

        } else {
            
            return false;
        }

    }

    public boolean unWall(){


        if (wall == true){
            
            wall = false;
            return true;

        } else {

            return false;
        }
    }

}
