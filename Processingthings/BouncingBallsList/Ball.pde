class Ball {
    int x, y, d;
    int cr, cg, cb;
    int dx, dy;
    int width, height;

    Ball(int ballx, int bally, int balld, int windowW, int windowH){
        x = ballx;
        y = bally;
        d = balld;
        cr = int( random(0, 255));
        cg = int( random(0, 255));
        cb = int( random(0, 255));
        width = windowW;
        height = windowH;

        dx = int( random(-10,10));
        dy = int( random(-10,10));
    }

    void display(){
        fill(cr,cg,cb);
        circle(x,y,d);
    }
    void move(){
        x = x+dx;
        y = y+ dy;

        if(x <= 0 + (d/2) || x >= width-(d/2) ){
            dx = dx*-1;
        }
        if (y <= 0 +(d/2) || y>= height-(d/2) ){
            dy = dy*-1;
        }
    }
    void collision(Ball otherBall){
        double distanceApart = dist(x, y, otherBall.x, otherBall.y);

        if (distanceApart <= d){
            int tempdx = dx;
            int tempdy = dy;

            dx = otherBall.dx;
            dy = otherBall.dy;

            otherBall.dx = tempdx;
            otherBall.dy = tempdy;
        }
    }
}