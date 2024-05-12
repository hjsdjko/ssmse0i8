package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HumianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HumianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HumianxinxiView;


/**
 * 互勉信息
 *
 * @author 
 * @email 
 * @date 2022-04-22 18:18:58
 */
public interface HumianxinxiService extends IService<HumianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HumianxinxiVO> selectListVO(Wrapper<HumianxinxiEntity> wrapper);
   	
   	HumianxinxiVO selectVO(@Param("ew") Wrapper<HumianxinxiEntity> wrapper);
   	
   	List<HumianxinxiView> selectListView(Wrapper<HumianxinxiEntity> wrapper);
   	
   	HumianxinxiView selectView(@Param("ew") Wrapper<HumianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HumianxinxiEntity> wrapper);
   	

}

