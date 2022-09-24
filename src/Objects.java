public class Objects {
    
    class Point{
        int x;
        int y;
    }

    Point p = new Point();
}

class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    
}
}

class Point2{
    int x;
    int y;
    
    Point2(){
        this(0,0);
    }
    Point2(int x, int y){
        this.x = x;
        this.y = y;
    }
}