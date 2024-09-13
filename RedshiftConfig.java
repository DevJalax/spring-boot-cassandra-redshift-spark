@Configuration
public class RedshiftConfig {
    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .driverClassName("com.amazon.redshift.jdbc42.Driver")
                .url("jdbc:redshift://localhost:5439/mydatabase")
                .username("myusername")
                .password("mypassword")
                .build();
    }
}
