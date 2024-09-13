@Repository
public class CassandraRepository {
    @Autowired
    private CassandraTemplate cassandraTemplate;
    
    public List<MyEntity> findAll() {
        return cassandraTemplate.select("SELECT * FROM mytable", MyEntity.class);
    }
}
