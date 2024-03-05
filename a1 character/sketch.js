// A1 Character
// Jacob Rivera
// 29 Feb 2024
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"


function setup() {
  createCanvas(windowWidth, windowHeight);
}

function draw() {
  background(220);
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
  ellipse(x/2, x/6.5, 10, 30);
  
}
