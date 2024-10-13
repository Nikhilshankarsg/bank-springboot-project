@SpringBootApplication
public class DemoBankApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DemoBankApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoBankApplication.class, args);
    }
}