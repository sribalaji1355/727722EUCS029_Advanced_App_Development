package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Jobs;
import com.example.demo.repository.JobsRepo;

@Service
public class JobsService {

    @Autowired
    public JobsRepo jobsRepo;

    public Jobs postTask(Jobs jobs)
    {
        return jobsRepo.save(jobs);
    }

    public List<Jobs> jobsdata(int staffId)
    {
        return jobsRepo.findByStaffId(staffId);
    }
    
    public void deletejob(int id)
    {
        jobsRepo.deleteById(id);
    }
    
    public List<Jobs> jobsdatabydate(String date) {
        return jobsRepo.findBydate(date);
        
    }
}
