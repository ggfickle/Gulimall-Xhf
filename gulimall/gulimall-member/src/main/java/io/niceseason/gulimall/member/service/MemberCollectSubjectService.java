package io.niceseason.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.niceseason.common.utils.PageUtils;
import io.niceseason.gulimall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author xiehongfei
 * @email ggfickle@gmail.com
 * @date 2021-04-29 23:13:50
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

