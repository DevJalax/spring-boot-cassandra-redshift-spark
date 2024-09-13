@Configuration
public class SparkConfig {
    @Bean
    public SparkSession sparkSession() {
        return SparkSession.builder()
                .appName("My Spark App")
                .master("local[2]")
                .getOrCreate();
    }
}
