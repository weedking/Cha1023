package pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("database")
public class DataBaseProperties {
//    @Value("${database.driverName}")
    private String driveName = null;

//    @Value("${database.url}")
    private String url = null;

    private String username = null;
    private String password = null;

//    public void setDriverName(String driveName){
//        System.out.println(driveName);
//        this.driveName = driveName;
//    }

    public void setDriveName(String driveName) {
        System.out.println(driveName);
        this.driveName = driveName;
    }

    public void setUrl(String url){
        System.out.println(url);
        this.url = url;
    }

//    @Value("${database.username}")
    public void setUsername(String username) {
        System.out.println(username);
        this.username = username;
    }

//    @Value("${database.password}")
    public void setPassword(String password) {
        System.out.println(password);
        this.password = password;
    }

    public String getDriveName() {
        return driveName;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
