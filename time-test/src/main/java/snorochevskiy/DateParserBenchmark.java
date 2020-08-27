package snorochevskiy;

import org.openjdk.jmh.annotations.Benchmark;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateParserBenchmark {

    static DateTimeFormatter constFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSSX");

    @Benchmark
    public void testDateTimeFormatter1() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSSX");
        LocalDateTime date = LocalDateTime.parse("2020-07-23T18:57:10.829978Z", formatter);
        Timestamp timestamp = java.sql.Timestamp.valueOf(date);
    }

    @Benchmark
    public void testDateTimeFormatter2() {
        LocalDateTime date = LocalDateTime.parse("2020-07-23T18:57:10.829978Z", constFormatter);
        Timestamp timestamp = java.sql.Timestamp.valueOf(date);
    }

    @Benchmark
    public void testSimpleDateFormat() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSX");
        Date date = formatter.parse("2020-07-23T18:57:10.829978Z");
        Timestamp timestamp = new java.sql.Timestamp(date.getTime());
    }
}
