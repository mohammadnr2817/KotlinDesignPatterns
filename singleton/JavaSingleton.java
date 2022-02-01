package dev.radis.kotlindesignpatterns.patterns.singleton;

public class JavaSingleton {
    public int someValue = 1001;
    private static JavaSingleton instance;

    private JavaSingleton() {
    }

    public static JavaSingleton getInstance() {
        if (instance == null)
            instance = new JavaSingleton();
        return instance;
    }

    public static String customDoubleString(String input) {
        return input + " [|] " + input;
    }
}

class JavaUsage {
    int thisValue = JavaSingleton.getInstance().someValue;
    // output -> 1001

    String thisStringValue = JavaSingleton.customDoubleString("myString");
    // output -> myString [|] myString
}