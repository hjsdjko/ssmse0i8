package com.dao;

import com.entity.YijianfankuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YijianfankuiVO;
import com.entity.view.YijianfankuiView;


/**
 * 意见反馈
 * 
 * @author 
 * @email 
 * @date 2022-04-22 18:18:58
 */
public interface YijianfankuiDao extends BaseMapper<YijianfankuiEntity> {
	
	List<YijianfankuiVO> selectListVO(@Param("ew") Wrapper<YijianfankuiEntity> wrapper);
	
	YijianfankuiVO selectVO(@Param("ew") Wrapper<YijianfankuiEntity> wrapper);
	
	List<YijianfankuiView> selectListView(@Param("ew") Wrapper<YijianfankuiEntity> wrapper);

	List<YijianfankuiView> selectListView(Pagination page,@Param("ew") Wrapper<YijianfankuiEntity> wrapper);
	
	YijianfankuiView selectView(@Param("ew") Wrapper<YijianfankuiEntity> wrapper);
	

}
