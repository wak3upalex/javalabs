public class Hero {

    public Hero() {} //constructor

    int destination = 0; //destination
    Movement movement; //strategy


    //setter for moving strategy
    public void setMovement(Movement movement) {
        this.movement = movement;
    }

    public void moving(){
        movement.move();
        this.changeDestination();
    }

    private void changeDestination() {
        destination = (destination + 1) % 2;
    }
}
