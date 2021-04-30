package com.javainuse;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Application {

  public static void main(String[] args) throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException {
    //SpringApplication.run(Application.class, args);
    
    String[] springConfig  =  { "/jobConfig.xml" }; 

    // Creating the application context object 
    @SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext(springConfig); 

    // Creating the job launcher
    JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");

    // Creating the job
    Job job = (Job) context.getBean("helloWorldJob");

    // Executing the JOB
    JobExecution execution = jobLauncher.run(job, new JobParameters());

    System.out.println("Exit Status : " + execution.getStatus());
  }
}
