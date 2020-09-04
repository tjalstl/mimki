package com.gura.myapp.shop.service;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.gura.myapp.shop.dao.OrderDao;
import com.gura.myapp.shop.dao.ShopDao;
import com.gura.myapp.shop.dto.OrderDto;
import com.gura.myapp.shop.dto.ShopDto;


@Service
public class ShopServiceImpl implements ShopService{
	@Autowired
	private ShopDao shopDao;
	@Autowired
	private OrderDao orderDao;
	
	@Override
	public void getList(ModelAndView mView) {
		List<ShopDto> list=shopDao.getList();
		mView.addObject("list", list);
	}

	@Transactional
	@Override
	public void buy(HttpServletRequest request, ModelAndView mView) {
		String id=(String)request.getSession().getAttribute("id");
		int num=Integer.parseInt(request.getParameter("num"));
		int price=shopDao.getPrice(num);
		ShopDto dto=new ShopDto();
		dto.setId(id);
		dto.setPrice(price);
		shopDao.minusMoney(dto);
		shopDao.plusPoint(dto);
		shopDao.minusCount(num);
		OrderDto dto2=new OrderDto();
		dto2.setId(id); 
		dto2.setCode(num); 
		dto2.setAddr("강남구 삼원빌딩 5층 502호");
		
	}
	
}










