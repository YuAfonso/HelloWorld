package gdbmro.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import gdbmro.model.Brand;
import gdbmro.pageModel.BrandPage;

public interface BrandMapper {

	List<Map<String,Object>>getBrandList();

	int getbrandIdByName(String nameCn);
	
	int countBrandByPage(BrandPage brandPage);
	
	List<BrandPage> getListByPage(BrandPage brandPage);
	
	void deleteByPrimaryKey(@Param("id")int id);
	
	void insertSelective(Brand brand);
	
	void updateByPrimaryKeySelective(Brand brand);
	
	Brand getBrandById(@Param("id")int id);
	
	void deleteById(@Param("id")int id);
	
	List<Brand> getBrandListByName();

	List<Brand> getCateBrand();

	List<Brand> getAllBuyer();
}
