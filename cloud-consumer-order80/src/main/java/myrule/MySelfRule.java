package myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: hys
 * @createTime: 2023年05月25日 18:36:13
 * @version:
 * @Description:
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        return new RandomRule();//定义为随机
    }
}
