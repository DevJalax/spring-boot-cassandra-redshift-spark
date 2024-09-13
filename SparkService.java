@Service
public class SparkService {
    @Autowired
    private SparkSession sparkSession;
    
    public void process() {
        Dataset<Row> dataset = sparkSession.read().format("json").load("path/to/data.json");
        dataset.createOrReplaceTempView("mytable");
        Dataset<Row> result = sparkSession.sql("SELECT * FROM mytable");
        result.show();
    }
}
