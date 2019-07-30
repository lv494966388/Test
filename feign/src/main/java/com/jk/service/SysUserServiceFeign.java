package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "SPRING-CLOUD-USER-PROVIDER" ,

                fallback = SysUserServiceError.class)
public interface SysUserServiceFeign extends SysUserService {



}
