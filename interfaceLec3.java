// functional interface:this interface has only one methods. it is also called sam.we can use lambda statement in this function.
// @FunctionalInterface
interface A {
    // public void show();
    public int add(int i, int j);
}

// for instantanciate
// class B implements A {
// // @Override
// public void show() {
// System.out.println("in show 1");
// }
// }

public class interfaceLec3 {
    public static void main(String[] args) {
        // A obj = () -> System.out.println("in show 2");
        // obj.show();
        A obj1 = (i, j) -> i + j;
        // System.out.println("in show 3", +i )
        int result = obj1.add(5, 8);
        System.out.println(result);

    }

}
