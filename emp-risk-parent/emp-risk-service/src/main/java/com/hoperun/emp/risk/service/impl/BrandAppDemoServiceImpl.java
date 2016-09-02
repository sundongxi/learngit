package com.hoperun.emp.risk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoperun.emp.risk.bean.request.BrandAppDemoRequest;
import com.hoperun.emp.risk.dao.mapper.BrandAppDemoMapper;
import com.hoperun.emp.risk.service.BrandAppDemoService;

@Service
public class BrandAppDemoServiceImpl implements BrandAppDemoService {

	@Autowired
	private BrandAppDemoMapper brandAppDemoMapper;
	/**
	 * 传入参数 test字段，返回参数string
	 */
	@Override
	public String demo(BrandAppDemoRequest brandAppDemoRequest) {
		return brandAppDemoMapper.demo();
	}

}
