package io.niceseason.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.niceseason.common.utils.PageUtils;
import io.niceseason.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author xiehongfei
 * @email ggfickle@gmail.com
 * @date 2021-04-29 23:21:57
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

