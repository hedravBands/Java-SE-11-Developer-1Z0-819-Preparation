// A simple test class with a few attributes, a constructor and
// a method.
class TestClass {

    private String a = "a";
    private String b = "b";

    // Constructor
    TestClass(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return a + "-" + b;
    }
}
