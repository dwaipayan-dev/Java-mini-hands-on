public class Main {

    public static void main(String[] args) {
        ArrayList1<Integer> a = new ArrayList1<>();
        for(int i = 0; i <= 20; i++) {
            System.out.println(a.size());
            a.add(i);
            System.out.println(a.size());
            System.out.println(a);
            System.out.println(a.get(i));
        }

        a.set(3, 20);
        a.remove(5);
        System.out.println(a);
    }
    
}
