package Module8;

import java.util.Comparator;

public class Compare  implements Comparator<File> {


    @Override
    public int compare(File o1, File o2) {
        return o1.getType().compareTo(o2.getType());
    }
}
