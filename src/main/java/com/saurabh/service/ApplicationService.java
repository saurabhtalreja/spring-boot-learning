package com.saurabh.service;

import com.saurabh.entity.Application;

import java.util.List;

public interface ApplicationService {
    List<Application> listApplications();
    Application findApplication(long id);
}


