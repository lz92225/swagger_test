package lz.swagger.thread;

import java.util.function.Supplier;

/**
 * create by liu_zhang on 2019/11/15 11:22.
 */
public class Test1 {

    public static void main(String[] args) {
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public synchronized void run() {
//                for (int i = 1; i <= 100; i += 2) {
//                    System.out.println(i);
//                    this.notify();
//                    try {
//                        this.wait();
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public synchronized void run() {
//                for (int i = 0; i <= 100; i += 2) {
//                    System.out.println(i);
//                    this.notify();
//                    try {
//                        this.wait();
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//
//        t1.start();
//        t2.start();

//        String[] arr = {"zhangsan","lisi","wangwu","zhaoliu"};
//        List<String> strings = Arrays.asList(arr);
//        strings.forEach(o -> System.out.println(o));
//        System.out.println("--------------");
//        strings.forEach(System.out::println);

//        List<YinYong> list2 = new ArrayList<>();
//        list2.add(new YinYong().setNum(2));
//        list2.add(new YinYong().setNum(1));
//        list2.add(new YinYong().setNum(7));
//        list2.add(new YinYong().setNum(5));
//        list2.add(new YinYong().setNum(3));
//
////        list2.sort(YinYong::compareWithNum);
//        YinYongComparator yinYongComparator = new YinYongComparator();
////        list2.sort(YinYongComparator::comparatorWithNum);
////        list2.sort(yinYongComparator::comparatorWithNumNoStatic);
//        list2.sort(YinYong::compareWithNum);
//
//        list2.forEach(yinYong -> System.out.println(yinYong.getNum()));

        Supplier<YinYong> supplier = () -> new YinYong();
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());

//        Consumer a = System.out::println;
//        Consumer b = n -> System.out.println(n + ":test");
//
//        a.accept("consimer");
//        a.andThen(b).accept("consumer");
    }

    public synchronized void print2() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
            this.notify();
            try {
                this.wait();
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
    }

    public synchronized void print1() {
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
            this.notify();
            try {
                this.wait();
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
    }
}
