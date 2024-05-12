package com.dao;

import com.entity.HumianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HumianxinxiVO;
import com.entity.view.HumianxinxiView;


/**
 * 互勉信息
 * 
 * @author 
 * @email 
 * @date 2022-04-22 18:18:58
 */
public interface HumianxinxiDao extends BaseMapper<HumianxinxiEntity> {
	
	List<HumianxinxiVO> selectListVO(@Param("ew") Wrapper<HumianxinxiEntity> wrapper);
	
	HumianxinxiVO selectVO(@Param("ew") Wrapper<HumianxinxiEntity> wrapper);
	
	List<HumianxinxiView> selectListView(@Param("ew") Wrapper<HumianxinxiEntity> wrapper);

	List<HumianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HumianxinxiEntity> wrapper);
	
	HumianxinxiView selectView(@Param("ew") Wrapper<HumianxinxiEntity> wrapper);
	

}
