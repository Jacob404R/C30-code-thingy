
ArrayList<Ball> ballGroup = new ArrayList<Ball>();



void setup(){
    size(1400,700);
}

void draw(){
    background(70,30,60);
    for (int i = 0; i < ballGroup.size(); i++){

        ballGroup.get(i).display();
        ballGroup.get(i).move();
    }
}

void mousePressed() {

    ballGroup.add(new Ball(mouseX, mouseY, 100));

}