Ball[] ballGroup;
int pos = 0;

void setup(){
    size(1400,700);
    Gallgroup = new Ball[500];
}

void draw(){
    background(70,30,60);
    for (int i = 0; i < pos; pos++){
        ballGroup[i].display();
        ballGroup[i].move();
    }
}

void mousePressed() {


    if (pos< ballGroup.length){
        ballGroup[pos] = new Ball(mouseX, mouseY, 100);
        pos++;
    }
}