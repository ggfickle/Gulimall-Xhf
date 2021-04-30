package io.niceseason.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.niceseason.gulimall.product.entity.BrandEntity;
import io.niceseason.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brand = brandService.getOne(new QueryWrapper<BrandEntity>().eq("brand_id", 1));
        System.out.println(brand);
    }

}
