# my-benchmark

### Using method.getParameterTypes().length vs using method.getParameterCount() to get the number of parameters in a method
|**Benchmark**            |**Mode**|**Cnt**|**Score** |**Error**  |**Units**|
|-------------------------|--------|-------|----------|-----------|---------|
|ParameterCount.testCount |thrpt   |10     |321193.65 |± 71597.222|ops/ms   |
|ParameterCount.testTypes |thrpt   |10     |112423.710|± 13811.354|ops/ms   |

