package com.hoperun.emp.risk.ws.handler;

import org.springframework.stereotype.Component;

import com.hoperun.emp.common.api.interfaces.ApiParamAnnotation;
import com.hoperun.emp.common.api.model.ApiRespModel;
import com.hoperun.emp.common.services.ServiceFactory;
import com.hoperun.emp.common.utils.Logger;
import com.hoperun.emp.risk.bean.request.BrandAppDemoRequest;
import com.hoperun.emp.risk.service.BrandAppDemoService;
/**
 * 
 * @author sun_dongxi
 *
 */
@Component("risk")
public class BrandAppFohMemberHandler {
	
	private BrandAppDemoService brandAppDemoService = ServiceFactory.getInstance().lookup(BrandAppDemoService.class);
	private static final Logger logger = Logger.getLogger(BrandAppFohMemberHandler.class);
	/**
	 * 
	 * @param request
	 * @return
	 * @author sun_dongxi
	 * @throws Exception 
	 */
	@ApiParamAnnotation(clazz = BrandAppDemoRequest.class)
	public ApiRespModel demo(BrandAppDemoRequest request) throws Exception{
		return ApiRespModel.success(brandAppDemoService.demo(request), "读取成功");
	}
	
	
}
