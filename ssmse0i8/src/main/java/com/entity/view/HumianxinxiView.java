package com.entity.view;

import com.entity.HumianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 互勉信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-22 18:18:58
 */
@TableName("humianxinxi")
public class HumianxinxiView  extends HumianxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HumianxinxiView(){
	}
 
 	public HumianxinxiView(HumianxinxiEntity humianxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, humianxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
