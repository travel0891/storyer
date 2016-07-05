package com.travel.storyer.dao;

import org.springframework.stereotype.Repository;

import com.travel.storyer.model.accountModel;

@Repository
public interface accountDao {

	accountModel findOneByIntId(Integer intId);

}