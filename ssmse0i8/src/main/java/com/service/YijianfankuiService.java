package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YijianfankuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YijianfankuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YijianfankuiView;


/**
 * 意见反馈
 *
 * @author 
 * @email 
 * @date 2022-04-22 18:18:58
 */
public interface YijianfankuiService extends IService<YijianfankuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YijianfankuiVO> selectListVO(Wrapper<YijianfankuiEntity> wrapper);
   	
   	YijianfankuiVO selectVO(@Param("ew") Wrapper<YijianfankuiEntity> wrapper);
   	
   	List<YijianfankuiView> selectListView(Wrapper<YijianfankuiEntity> wrapper);
   	
   	YijianfankuiView selectView(@Param("ew") Wrapper<YijianfankuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YijianfankuiEntity> wrapper);
   	

}

