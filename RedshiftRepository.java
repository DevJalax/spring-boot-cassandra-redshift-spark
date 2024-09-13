@Repository
public class RedshiftRepository {
    @Autowired
    private DataSource dataSource;
    
    public List<MyEntity> findAll() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate.queryForList("SELECT * FROM mytable");
    }
}
