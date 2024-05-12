package com.dao;

import com.entity.ZuoweixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuoweixinxiVO;
import com.entity.view.ZuoweixinxiView;


/**
 * 座位信息
 * 
 * @author 
 * @email 
 * @date 2022-04-22 18:18:58
 */
public interface ZuoweixinxiDao extends BaseMapper<ZuoweixinxiEntity> {
	
	List<ZuoweixinxiVO> selectListVO(@Param("ew") Wrapper<ZuoweixinxiEntity> wrapper);
	
	ZuoweixinxiVO selectVO(@Param("ew") Wrapper<ZuoweixinxiEntity> wrapper);
	
	List<ZuoweixinxiView> selectListView(@Param("ew") Wrapper<ZuoweixinxiEntity> wrapper);

	List<ZuoweixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoweixinxiEntity> wrapper);
	
	ZuoweixinxiView selectView(@Param("ew") Wrapper<ZuoweixinxiEntity> wrapper);
	

}
