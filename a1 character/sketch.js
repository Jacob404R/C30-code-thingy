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
  circle(x/2,y/8,100);
  line(x/2, y/5.5, x/2, y/2);
  triangle(x/2, y/2, 200, y -20, x - 200, y -20);
  rect(x/4, y/4, (x/4)*2, 40);
  rect(x/4,(y/4)+40, 40, 100);
  rect(512,(y/4)+40, 40, 100);

}
