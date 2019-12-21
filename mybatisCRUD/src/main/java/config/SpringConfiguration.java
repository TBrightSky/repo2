package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configurable//指定该类为配置类
@ComponentScan(basePackages = {"cn.sky"})//指定扫描的包
@Import({Config.class})
@PropertySource("classpath:jdbcConfig.properties")
public class SpringConfiguration {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean(name = "runner3")   //用于把当前方法的返回值作为bean对象存入spring的ioc容器中,当不写name时默认值为当前方法名
    @Scope("prototype")
    public QueryRunner createQueryRunner(@Qualifier("ds1") DataSource dataSource3) {
        return new QueryRunner(dataSource3);
    }

    @Bean(name = "ds1")
    public DataSource creatDataSource1() throws PropertyVetoException {
        ComboPooledDataSource ds = new ComboPooledDataSource();
        ds.setDriverClass(driver);
        ds.setJdbcUrl(url);
        ds.setUser(username);
        ds.setPassword(password);
        return ds;
    }

    @Bean(name = "ds2")
    public DataSource creatDataSource2() throws PropertyVetoException {
        ComboPooledDataSource ds = new ComboPooledDataSource();
        ds.setDriverClass(driver);
        ds.setJdbcUrl(url);
        ds.setUser(username);
        ds.setPassword(password);
        return ds;
    }
}
