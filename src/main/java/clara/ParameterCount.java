
package clara;

import org.openjdk.jmh.annotations.*;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class ParameterCount {
    @State(Scope.Thread)
    public static class GetMethod {
        public Method getMethod(){
            Method m = null;
            try {
                m = String.class.getDeclaredMethod("equals", Object.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return m;
        }

        Method method = getMethod();
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Fork(value = 2)
    public int testCount(GetMethod getMethod) {
        return getMethod.method.getParameterCount();
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Fork(value = 2)
    public int testTypes(GetMethod getMethod) {
        return getMethod.method.getParameterTypes().length;
    }
}
