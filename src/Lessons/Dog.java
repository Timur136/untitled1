package Lessons;

public class Dog {

    private static int dogsCount;

    public static final int PAWS = 4;
    public static final int TAIL = 1;
    private String name;
    private String breed;
    private Size size = Size.UNSIZE;

    public Dog() {
        dogsCount++;
        System.out.println("Dog's count is"
                + dogsCount);
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setName() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void bark() {
        switch (size) {
            case BIG:
            case VERY_BIG:
                System.out.println("Wof - Wof");
                break;
            case AVERAGE:
                System.out.println("Raf - Raf");
                break;
            case SMALL:
            case VERY_SMALL:
                System.out.println("Tiaf - Tiaf");
                break;
            default:
                System.out.println("Undefinded");
        }
    }

}
