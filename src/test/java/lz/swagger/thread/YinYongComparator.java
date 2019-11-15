package lz.swagger.thread;

/**
 * create by liu_zhang on 2019/11/15 17:22.
 */
public class YinYongComparator {

    public static int comparatorWithNum(YinYong yy1, YinYong yy2){
        return yy1.getNum() - yy2.getNum();
    }

    public int comparatorWithNumNoStatic(YinYong yy1, YinYong yy2){
        return yy2.getNum() - yy1.getNum();
    }
}
