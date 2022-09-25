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

p.x = 3;
p.y = 6;


class Point{
    void printPoint(){
        System.out.println("("+x+","+y+")");
    }

    Point center(Point other){
        return new Point((x + other.x)/2, (y+other.y)/2);
    }
}