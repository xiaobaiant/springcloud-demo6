package xiaoxiaobai;

import myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: hys
 * @createTime: 2023年05月23日 10:47:00
 * @version:
 * @Description:
 */
@EnableEurekaClient
@SpringBootApplication
//@RibbonClient(name="cloud-payment-service",configuration = MySelfRule.class)
public class EurekaOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaOrder80.class,args);
    }
}