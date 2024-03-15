// Start screen
// Jacob Rivera
// 14 March 2024
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"

let buttonpress = false;
let button = {x: 0, y: 0, w: 0, h:0, color: ""}

function setup() {
  createCanvas(windowWidth, windowHeight);
  button.w = 120;
  button.h = 40;
  button.x = width/2 - button.w/2;
  button.y = height/2 - button.h/2;
  button.color = "black";
}

function draw() {
  background(220);
  if (buttonpress === false){
    drawButton();
  }
  if (buttonpress === true){
    let x = width;
    let y = height;
    stroke(5);
    fill("white");
    circle(x/2,y/8,100);

    strokeWeight(20);
    line(x/2, y/5.5, x/2, y/2);
    triangle(x/2, y/2, 200, y -20, x - 200, y -20);

    rect(x/4, y/4, (x/4)*2, 40);
    rect(x/4,(y/4)+40, 40, 100);
    rect((x/4)*3-40,(y/4)+40, 40, 100);

    fill("black");
    triangle(x/4,y/4+140, x/4+40,y/4+140, x/4,y/4+200);
    triangle((x/4)*3-40,y/4+140, (x/4)*3,y/4+140, (x/4)*3,y/4+200);

    fill("black");
    stroke("white");
    circle(x/2,y/8,50);

    fill("red");
    stroke("red");
    ellipse(x/2, y/8, 10, 30);
    
    textSize(32);
    fill(255);
    stroke(0);
    strokeWeight(4);
    text('thou shalt not touch thy button', width/3.5, height/13);

  }
}

function mousePressed(){
  if (mouseX > button.x && mouseX < (button.x + button.w)){
    if (mouseY > button.y && mouseY < (button.y + button.h)){
      buttonpress = true;
    }
  }
}

function drawButton(){
  fill (button.color);
  rect(button.x, button.y, button.w, button.h);
}


