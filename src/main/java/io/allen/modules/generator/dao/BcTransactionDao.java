package io.allen.modules.generator.dao;

import org.apache.ibatis.annotations.Mapper;

import io.allen.modules.generator.entity.BcTransactionEntity;
import io.allen.modules.sys.dao.BaseDao;

/**
 * 交易表
 * 
 * @author allen.liu
 * @date 2017-11-13 11:24:46
 */
@Mapper
public interface BcTransactionDao extends BaseDao<BcTransactionEntity> {
	
}
