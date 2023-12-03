public class Main {
    public static void main(String[] args) {
        System.out.println(move(3, 'A', 'B', 'C'));
    }

    public static String move(int n, char orig, char dest, char temp) {
        final String DIRECT_MOVE =
                "Move disk " + n + " from " + orig + " to " + dest + "\n";
        if(n<=0)
            throw new IllegalArgumentException();
        if(n==1)
            return DIRECT_MOVE;
        String result = move(n-1, orig, temp, dest);
        result += DIRECT_MOVE;
        result += move(n-1, temp, dest, orig);
        return result;
    }
}
