package Introduction_to_java.Threads;

class Test {
    public static void main(String argsp[]) {
        MyThread t = new MyThread();
        t.start();
        int i = 1;
        while (i < 10) {
            System.out.print(i + "world");
        }
    }
}
