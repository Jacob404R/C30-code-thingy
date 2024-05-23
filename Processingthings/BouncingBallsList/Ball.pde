class Ball {
    int x, y, r;
    int cr, cg, cb;
    int dx, dy;

    Ball(int ballx, int bally, int ballr){
        x = ballx;
        y = bally;
        r = ballr;
        cr = int( random(0, 255));
        cg = int( random(0, 255));
        cb = int( random(0, 255));

        dx = int( random(-10,10));
        dy = int( random(-10,10));
    }

    void display(){
        fill(cr,cg,cb);
        circle(x,y,r);
    }
    void move(){
        x = x+dx;
        y = y+ dy;

        if(x <= 50 || x >= 1350){
            dx = dx*-1;
        }
        if (y <= 50 || y>= 650){
            dy = dy*-1;
        }
    }
}