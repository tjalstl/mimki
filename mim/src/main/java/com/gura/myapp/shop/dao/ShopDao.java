package com.gura.myapp.shop.dao;

import java.util.List;

import com.gura.myapp.shop.dto.ShopDto;

public interface ShopDao {
	public List<ShopDto> getList();
	public void minusCount(int num);
	public void minusMoney(ShopDto dto);
	public void plusPoint(ShopDto dto);
	public int getPrice(int num);
}






