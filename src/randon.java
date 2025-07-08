public class randon {
    public static void main(String[] args) {
        int min=500,max=600;
        double a=Math.random()*(max-min+1)+min;
        System.out.println(Math.round(a));
        System.out.println("1st Random Number: " + Math.random());
        System.out.println("2nd Random Number: " + Math.random());
        System.out.println("3rd Random Number: " + Math.random());
        System.out.println("4th Random Number: " + Math.random());
    }
}
