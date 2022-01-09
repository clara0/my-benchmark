# my-benchmark

### Using method.getParameterTypes().length vs using method.getParameterCount() to get the number of parameters in a method
|**Benchmark**               |**Mode**|**Cnt**|**Score** |**Error**  |**Units**|
|----------------------------|--------|-------|----------|-----------|---------|
|ParameterCount.testCount    |thrpt   |10     |321193.65 |± 71597.222|ops/ms   |
|ParameterCount.testTypes    |thrpt   |10     |112423.710|± 13811.354|ops/ms   |

### Using Iterator vs ListIterator to traverse an integer ArrayList and remove all elements that equal 0
|**Benchmark**               |**Mode**|**Cnt**|**Score** |**Error**  |**Units**|
|----------------------------|--------|-------|----------|-----------|---------|
|Iterations.testIterator     |thrpt   |10     |7192.097  |±  4539.515|ops/ms   |
|Iterations.testListIterator |thrpt   |10     |8858.368  |±   361.131|ops/ms   |
