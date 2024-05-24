
ArrayList<Ball> ballGroup = new ArrayList<Ball>();



void setup(){
    size(1400,700);
}

void draw(){
    background(70,30,60);

    for (Ball theBall : ballGroup ){

        theBall.move();
        for (Ball otherBall : ballGroup){
            if (theBall != otherBall){
            theBall.collision(otherBall);
            }

        }
        theBall.display();
    }
}

void mousePressed() {

    ballGroup.add(new Ball(mouseX, mouseY, 100, width, height));

}