package io.allen.modules.generator.service;

import io.allen.modules.generator.entity.BizGiftEntity;

import java.util.List;
import java.util.Map;

/**
 * 礼品表
 * 
 * @author allen.liu
 * @date 2017-11-15 09:25:12
 */
public interface BizGiftService {
	
	BizGiftEntity queryObject(Long giftId);
	
	List<BizGiftEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	List<BizGiftEntity> queryExchangeList(Map<String, Object> map);
	
	int queryExchangeTotal(Map<String, Object> map);
	
	void save(BizGiftEntity bizGift);
	
	void update(BizGiftEntity bizGift);
	
	void delete(Long giftId);
	
	void deleteBatch(Long[] giftIds);
}
