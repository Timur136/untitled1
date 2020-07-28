package OOP;

public class Array {
    int x, y;
    float radius;
    public Array(int x) {
        this.x = x;
    }

    float perimetr(float radius){
        return  (float) (3.14*radius*radius);
    }


    float square(float radius){
        return  (float) (2*3.14*radius);
    }
}
