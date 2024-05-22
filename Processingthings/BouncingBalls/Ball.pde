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

        dx = 10;
        dy = 10;
    }

    void display(){
        fill(cr,cg,cb);
        circle(x,y,r);
    }
    void move(){
        x = x+dx;
        y = y+ dy;
    }
}