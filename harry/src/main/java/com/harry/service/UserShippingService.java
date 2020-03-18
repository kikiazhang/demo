package com.harry.service;

import com.harry.domain.UserShipping;

public interface UserShippingService {
	
	UserShipping findById(Long id);
	
	void removeById(long parseLong);

}
