package lz.swagger.thread;

/**
 * create by liu_zhang on 2019/11/15 15:22.
 */
public class YinYong {

    private int num;

    private String str;

    public int getNum() {
        return num;
    }

    public YinYong setNum(int num) {
        this.num = num;
        return this;
    }

    public String getStr() {
        return str;
    }

    public YinYong setStr(String str) {
        this.str = str;
        return this;
    }

//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("YinYong{");
//        sb.append("num=").append(num);
//        sb.append(", str='").append(str).append('\'');
//        sb.append('}');
//        return sb.toString();
//    }

    public static int compareWithNum(YinYong yy1, YinYong yy2){
        return yy2.num - yy1.num;
    }

    public int comparatorWithNum(YinYong yy){
        return this.num - yy.num;
    }
}
