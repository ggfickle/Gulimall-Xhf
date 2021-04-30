package io.niceseason.gulimall.member.dao;

import io.niceseason.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xiehongfei
 * @email ggfickle@gmail.com
 * @date 2021-04-29 23:13:50
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}