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


import com.dao.HumianxinxiDao;
import com.entity.HumianxinxiEntity;
import com.service.HumianxinxiService;
import com.entity.vo.HumianxinxiVO;
import com.entity.view.HumianxinxiView;

@Service("humianxinxiService")
public class HumianxinxiServiceImpl extends ServiceImpl<HumianxinxiDao, HumianxinxiEntity> implements HumianxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HumianxinxiEntity> page = this.selectPage(
                new Query<HumianxinxiEntity>(params).getPage(),
                new EntityWrapper<HumianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HumianxinxiEntity> wrapper) {
		  Page<HumianxinxiView> page =new Query<HumianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HumianxinxiVO> selectListVO(Wrapper<HumianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HumianxinxiVO selectVO(Wrapper<HumianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HumianxinxiView> selectListView(Wrapper<HumianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HumianxinxiView selectView(Wrapper<HumianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
