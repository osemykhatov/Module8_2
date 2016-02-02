package Module8;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Dir {

     // private List<File> files = new ArrayList<>();

    private Set<File>  set = new TreeSet<File>(new Compare());



    public Dir() {
        set.add(new TextFile());
        set.add(new AudioFile());
        set.add(new ImageFile());

    }

    @Override
    public String toString() {

        String output = "Files are ordered by alphabet: \n";

            for (File files : set) {

                output = output  +  files.getType() + "\n";

        }

        return output;
    }
}

