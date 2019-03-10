import com.alibaba.fastjson.JSON;
import com.springMvcDemo.dao.UserMapper;
import com.springMvcDemo.dao1.TestMapper;
import com.springMvcDemo.domain.User;
import com.springMvcDemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"spring-mybatis.xml"})
public class TestMain {

    @Autowired
    private UserService testMapper;
    @Test
    public void test(){
        User t = testMapper.selectByPrimaryKey(1);
        System.out.println(JSON.toJSONString(t));
    }
}
