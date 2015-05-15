package lab19;

/**
 * Created by Master on 08.05.2015.
 */
public class AdditionString {

    public long addString(String str) {
        long start = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            str = str + str;
        }
        return System.nanoTime() - start;
    }

    public long addStringBuilder(String str) {
        StringBuilder strBuild = new StringBuilder(str);
        long start = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            strBuild.append(str);
        }
        return System.nanoTime() - start;
    }

    public long addStringBuffer(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        long start = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            stringBuffer.append(str);
        }
        return System.nanoTime() - start;
    }
}


