package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YijianfankuiDao;
import com.entity.YijianfankuiEntity;
import com.service.YijianfankuiService;
import com.entity.vo.YijianfankuiVO;
import com.entity.view.YijianfankuiView;

@Service("yijianfankuiService")
public class YijianfankuiServiceImpl extends ServiceImpl<YijianfankuiDao, YijianfankuiEntity> implements YijianfankuiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YijianfankuiEntity> page = this.selectPage(
                new Query<YijianfankuiEntity>(params).getPage(),
                new EntityWrapper<YijianfankuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YijianfankuiEntity> wrapper) {
		  Page<YijianfankuiView> page =new Query<YijianfankuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YijianfankuiVO> selectListVO(Wrapper<YijianfankuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YijianfankuiVO selectVO(Wrapper<YijianfankuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YijianfankuiView> selectListView(Wrapper<YijianfankuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YijianfankuiView selectView(Wrapper<YijianfankuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
