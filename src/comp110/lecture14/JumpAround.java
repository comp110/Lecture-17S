package comp110.lecture14;

public class JumpAround {

    public JumpAround() {
        // Empty -- No Fields
    }

    public int jump0() {
        System.out.println("-> 0");
        int x = 0;
        System.out.println("<- 0");
        return x;
    }

    public int jump1() {
        System.out.println("-> 1");
        int x = 1 + this.jump0();
        System.out.println("<- 1");
        return x;
    }

    public int jump2() {
        System.out.println("-> 2");
        int x = 2 + this.jump1();
        System.out.println("<- 2");
        return x;
    }

    public int recur(int n) {
        System.out.println("-> " + n);
        int x;
        if (n == 0) {
            x = n;
        } else {
            x = n + this.recur(n - 1);
        }
        System.out.println("<- " + n);
        return x;
    }

}
