package com.jk.service;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value ="SPRING-CLOUD-PROVIDER", fallback = VipServiceError.class)


public interface VipServiceFeign  extends VipService{




}
