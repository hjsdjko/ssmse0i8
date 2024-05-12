package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 座位信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-22 18:18:58
 */
@TableName("zuoweixinxi")
public class ZuoweixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZuoweixinxiEntity() {
		
	}
	
	public ZuoweixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 自习室名称
	 */
					
	private String zixishimingcheng;
	
	/**
	 * 座位号
	 */
					
	private String zuoweihao;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 座位状态
	 */
					
	private String zuoweizhuangtai;
	
	/**
	 * 地点
	 */
					
	private String didian;
	
	/**
	 * 负责人
	 */
					
	private String fuzeren;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：自习室名称
	 */
	public void setZixishimingcheng(String zixishimingcheng) {
		this.zixishimingcheng = zixishimingcheng;
	}
	/**
	 * 获取：自习室名称
	 */
	public String getZixishimingcheng() {
		return zixishimingcheng;
	}
	/**
	 * 设置：座位号
	 */
	public void setZuoweihao(String zuoweihao) {
		this.zuoweihao = zuoweihao;
	}
	/**
	 * 获取：座位号
	 */
	public String getZuoweihao() {
		return zuoweihao;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：座位状态
	 */
	public void setZuoweizhuangtai(String zuoweizhuangtai) {
		this.zuoweizhuangtai = zuoweizhuangtai;
	}
	/**
	 * 获取：座位状态
	 */
	public String getZuoweizhuangtai() {
		return zuoweizhuangtai;
	}
	/**
	 * 设置：地点
	 */
	public void setDidian(String didian) {
		this.didian = didian;
	}
	/**
	 * 获取：地点
	 */
	public String getDidian() {
		return didian;
	}
	/**
	 * 设置：负责人
	 */
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}

}
