package com.travel.storyer.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.travel.storyer.dao.accountDao;
import com.travel.storyer.model.accountModel;

@Service
public class accountService {

	@Resource
	accountDao dAccount;

	public accountModel findOneByIntId(Integer intId) {
		return dAccount.findOneByIntId(intId);
	}
}
