package Lessons;

public class goToBreak {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("\ni равно " + i);
                        if(i==1) break one;
                        if(i==2) break two;
                        if(i==3) break three;
                        System.out.println("NO");
                    }
                    System.out.println("Last 3");
                }
                System.out.println("Last 2");
            }
            System.out.println("Last 1");
        }
        System.out.println("Last for");
    }
}
