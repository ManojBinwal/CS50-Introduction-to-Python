package Introduction_to_java.Threads;

class MyThread extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.print("Hello");
            i++;
        }
    }
}
