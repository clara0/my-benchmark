package clara;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

public class Iterations {
    @State(Scope.Thread)
    public static class ListData {
        public static List<Integer> getList(){
            return new ArrayList<>(Arrays.asList(1, 0, 4, 3, 1, 5, 0, 9, 7, 0, 5));
        }
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Fork(value = 2)
    public List<Integer> testIterator() {
        List<Integer> l = ListData.getList();
        Iterator<Integer> iterator = l.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == 0) {
               iterator.remove();
            }
        }

        return l;
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Fork(value = 2)
    public List<Integer> testListIterator() {
        List<Integer> l = ListData.getList();
        ListIterator<Integer> listIterator = l.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next() == 0) {
                listIterator.remove();
            }
        }

        return l;
    }
}
