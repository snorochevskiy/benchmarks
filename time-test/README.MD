To run and see the results:

```
mvn clean install
java -jar target/benchmarks.jar
```

My results:
```
java -jar target/benchmarks.jar
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by org.openjdk.jmh.util.Utils (file:/home/stas/dev/proj/benchmarks/time-test/target/benchmarks.jar) to field java.io.Console.cs
WARNING: Please consider reporting this to the maintainers of org.openjdk.jmh.util.Utils
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
# JMH version: 1.25
# VM version: JDK 11.0.8, OpenJDK 64-Bit Server VM, 11.0.8+10-post-Ubuntu-0ubuntu120.04
# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
# VM options: <none>
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: snorochevskiy.DateParserBenchmark.testDateTimeFormatter1

# Run progress: 0.00% complete, ETA 00:25:00
# Fork: 1 of 5
# Warmup Iteration   1: 484475.598 ops/s
# Warmup Iteration   2: 534400.730 ops/s
# Warmup Iteration   3: 516485.952 ops/s
# Warmup Iteration   4: 501914.073 ops/s
# Warmup Iteration   5: 508585.751 ops/s
Iteration   1: 520439.773 ops/s
Iteration   2: 502362.722 ops/s
Iteration   3: 518845.651 ops/s
Iteration   4: 526224.481 ops/s
Iteration   5: 524334.722 ops/s

# Run progress: 6.67% complete, ETA 00:23:24
# Fork: 2 of 5
# Warmup Iteration   1: 501334.662 ops/s
# Warmup Iteration   2: 531515.001 ops/s
# Warmup Iteration   3: 504321.904 ops/s
# Warmup Iteration   4: 519995.512 ops/s
# Warmup Iteration   5: 524489.795 ops/s
Iteration   1: 524397.019 ops/s
Iteration   2: 533038.233 ops/s
Iteration   3: 532192.192 ops/s
Iteration   4: 509401.260 ops/s
Iteration   5: 518261.813 ops/s

# Run progress: 13.33% complete, ETA 00:21:43
# Fork: 3 of 5
# Warmup Iteration   1: 462568.423 ops/s
# Warmup Iteration   2: 504041.867 ops/s
# Warmup Iteration   3: 520778.445 ops/s
# Warmup Iteration   4: 504089.283 ops/s
# Warmup Iteration   5: 518647.357 ops/s
Iteration   1: 519760.345 ops/s
Iteration   2: 447289.735 ops/s
Iteration   3: 413931.233 ops/s
Iteration   4: 472827.503 ops/s
Iteration   5: 476550.856 ops/s

# Run progress: 20.00% complete, ETA 00:20:03
# Fork: 4 of 5
# Warmup Iteration   1: 423533.080 ops/s
# Warmup Iteration   2: 486255.627 ops/s
# Warmup Iteration   3: 533043.629 ops/s
# Warmup Iteration   4: 550423.393 ops/s
# Warmup Iteration   5: 541983.035 ops/s
Iteration   1: 548770.011 ops/s
Iteration   2: 556470.152 ops/s
Iteration   3: 536947.589 ops/s
Iteration   4: 515225.300 ops/s
Iteration   5: 523735.807 ops/s

# Run progress: 26.67% complete, ETA 00:18:22
# Fork: 5 of 5
# Warmup Iteration   1: 479854.198 ops/s
# Warmup Iteration   2: 551176.891 ops/s
# Warmup Iteration   3: 526199.927 ops/s
# Warmup Iteration   4: 537107.160 ops/s
# Warmup Iteration   5: 552536.512 ops/s
Iteration   1: 516019.554 ops/s
Iteration   2: 521840.615 ops/s
Iteration   3: 547720.976 ops/s
Iteration   4: 545232.452 ops/s
Iteration   5: 510113.307 ops/s


Result "snorochevskiy.DateParserBenchmark.testDateTimeFormatter1":
  514477.332 ±(99.9%) 24038.406 ops/s [Average]
  (min, avg, max) = (413931.233, 514477.332, 556470.152), stdev = 32090.584
  CI (99.9%): [490438.926, 538515.738] (assumes normal distribution)


# JMH version: 1.25
# VM version: JDK 11.0.8, OpenJDK 64-Bit Server VM, 11.0.8+10-post-Ubuntu-0ubuntu120.04
# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
# VM options: <none>
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: snorochevskiy.DateParserBenchmark.testDateTimeFormatter2

# Run progress: 33.33% complete, ETA 00:16:42
# Fork: 1 of 5
# Warmup Iteration   1: 726792.724 ops/s
# Warmup Iteration   2: 758695.996 ops/s
# Warmup Iteration   3: 781835.751 ops/s
# Warmup Iteration   4: 762240.350 ops/s
# Warmup Iteration   5: 796362.664 ops/s
Iteration   1: 758542.436 ops/s
Iteration   2: 752143.372 ops/s
Iteration   3: 773094.499 ops/s
Iteration   4: 758988.977 ops/s
Iteration   5: 755324.084 ops/s

# Run progress: 40.00% complete, ETA 00:15:02
# Fork: 2 of 5
# Warmup Iteration   1: 729452.541 ops/s
# Warmup Iteration   2: 755389.217 ops/s
# Warmup Iteration   3: 742319.504 ops/s
# Warmup Iteration   4: 781576.257 ops/s
# Warmup Iteration   5: 771834.408 ops/s
Iteration   1: 785613.297 ops/s
Iteration   2: 793902.833 ops/s
Iteration   3: 809726.335 ops/s
Iteration   4: 756977.087 ops/s
Iteration   5: 823651.230 ops/s

# Run progress: 46.67% complete, ETA 00:13:22
# Fork: 3 of 5
# Warmup Iteration   1: 771640.313 ops/s
# Warmup Iteration   2: 813819.283 ops/s
# Warmup Iteration   3: 788431.768 ops/s
# Warmup Iteration   4: 776296.862 ops/s
# Warmup Iteration   5: 793072.296 ops/s
Iteration   1: 799230.544 ops/s
Iteration   2: 765614.415 ops/s
Iteration   3: 812068.144 ops/s
Iteration   4: 779449.649 ops/s
Iteration   5: 793035.309 ops/s

# Run progress: 53.33% complete, ETA 00:11:41
# Fork: 4 of 5
# Warmup Iteration   1: 741096.750 ops/s
# Warmup Iteration   2: 785516.359 ops/s
# Warmup Iteration   3: 798222.595 ops/s
# Warmup Iteration   4: 785958.042 ops/s
# Warmup Iteration   5: 784934.896 ops/s
Iteration   1: 811928.704 ops/s
Iteration   2: 811552.818 ops/s
Iteration   3: 828555.554 ops/s
Iteration   4: 807107.693 ops/s
Iteration   5: 789528.634 ops/s

# Run progress: 60.00% complete, ETA 00:10:01
# Fork: 5 of 5
# Warmup Iteration   1: 725128.607 ops/s
# Warmup Iteration   2: 791373.775 ops/s
# Warmup Iteration   3: 822537.479 ops/s
# Warmup Iteration   4: 786637.459 ops/s
# Warmup Iteration   5: 823364.546 ops/s
Iteration   1: 803460.201 ops/s
Iteration   2: 721215.635 ops/s
Iteration   3: 776337.324 ops/s
Iteration   4: 788980.748 ops/s
Iteration   5: 767449.950 ops/s


Result "snorochevskiy.DateParserBenchmark.testDateTimeFormatter2":
  784939.179 ±(99.9%) 19640.862 ops/s [Average]
  (min, avg, max) = (721215.635, 784939.179, 828555.554), stdev = 26219.989
  CI (99.9%): [765298.317, 804580.041] (assumes normal distribution)


# JMH version: 1.25
# VM version: JDK 11.0.8, OpenJDK 64-Bit Server VM, 11.0.8+10-post-Ubuntu-0ubuntu120.04
# VM invoker: /usr/lib/jvm/java-11-openjdk-amd64/bin/java
# VM options: <none>
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: snorochevskiy.DateParserBenchmark.testSimpleDateFormat

# Run progress: 66.67% complete, ETA 00:08:21
# Fork: 1 of 5
# Warmup Iteration   1: 314377.197 ops/s
# Warmup Iteration   2: 348607.780 ops/s
# Warmup Iteration   3: 344339.806 ops/s
# Warmup Iteration   4: 355561.188 ops/s
# Warmup Iteration   5: 345116.098 ops/s
Iteration   1: 333285.307 ops/s
Iteration   2: 346670.324 ops/s
Iteration   3: 343976.617 ops/s
Iteration   4: 354545.092 ops/s
Iteration   5: 341173.854 ops/s

# Run progress: 73.33% complete, ETA 00:06:41
# Fork: 2 of 5
# Warmup Iteration   1: 288779.959 ops/s
# Warmup Iteration   2: 314166.999 ops/s
# Warmup Iteration   3: 321084.858 ops/s
# Warmup Iteration   4: 323316.168 ops/s
# Warmup Iteration   5: 315136.587 ops/s
Iteration   1: 329970.997 ops/s
Iteration   2: 318133.176 ops/s
Iteration   3: 317146.335 ops/s
Iteration   4: 308411.937 ops/s
Iteration   5: 319069.378 ops/s

# Run progress: 80.00% complete, ETA 00:05:00
# Fork: 3 of 5
# Warmup Iteration   1: 299397.569 ops/s
# Warmup Iteration   2: 325290.254 ops/s
# Warmup Iteration   3: 330445.646 ops/s
# Warmup Iteration   4: 331381.980 ops/s
# Warmup Iteration   5: 335754.172 ops/s
Iteration   1: 331150.060 ops/s
Iteration   2: 329574.775 ops/s
Iteration   3: 330252.136 ops/s
Iteration   4: 321635.181 ops/s
Iteration   5: 332970.888 ops/s

# Run progress: 86.67% complete, ETA 00:03:20
# Fork: 4 of 5
# Warmup Iteration   1: 311653.637 ops/s
# Warmup Iteration   2: 331069.033 ops/s
# Warmup Iteration   3: 329818.103 ops/s
# Warmup Iteration   4: 325327.601 ops/s
# Warmup Iteration   5: 330984.353 ops/s
Iteration   1: 318567.269 ops/s
Iteration   2: 328839.247 ops/s
Iteration   3: 338026.844 ops/s
Iteration   4: 327254.742 ops/s
Iteration   5: 326295.982 ops/s

# Run progress: 93.33% complete, ETA 00:01:40
# Fork: 5 of 5
# Warmup Iteration   1: 312439.844 ops/s
# Warmup Iteration   2: 335666.504 ops/s
# Warmup Iteration   3: 331595.170 ops/s
# Warmup Iteration   4: 323330.507 ops/s
# Warmup Iteration   5: 318050.889 ops/s
Iteration   1: 308290.764 ops/s
Iteration   2: 310429.919 ops/s
Iteration   3: 300486.054 ops/s
Iteration   4: 302946.485 ops/s
Iteration   5: 297956.715 ops/s


Result "snorochevskiy.DateParserBenchmark.testSimpleDateFormat":
  324682.403 ±(99.9%) 11002.931 ops/s [Average]
  (min, avg, max) = (297956.715, 324682.403, 354545.092), stdev = 14688.598
  CI (99.9%): [313679.472, 335685.334] (assumes normal distribution)


# Run complete. Total time: 00:25:03

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                                    Mode  Cnt       Score       Error  Units
DateParserBenchmark.testDateTimeFormatter1  thrpt   25  514477.332 ± 24038.406  ops/s
DateParserBenchmark.testDateTimeFormatter2  thrpt   25  784939.179 ± 19640.862  ops/s
DateParserBenchmark.testSimpleDateFormat    thrpt   25  324682.403 ± 11002.931  ops/s
```
