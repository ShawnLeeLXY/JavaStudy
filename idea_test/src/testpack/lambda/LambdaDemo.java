package testpack.lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        useLambda(() -> {
            System.out.println("Lambda表达式测试成功");
        });
    }

    private static void useLambda(LambdaItf ld) {
        ld.myPrint();
    }
}
