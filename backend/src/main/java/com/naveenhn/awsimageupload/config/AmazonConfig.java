package com.naveenhn.awsimageupload.config;

@Configuration
public class AmazonConfig {

    @Bean
    public AmazonS3 s3(){
       AWSCredentials awsCredentials = new BasicAWSCredentials(
        accessKey: 
           secretKey: 
       );
       return AmazonS3ClientBuilder
       .standard()
       .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
       .build();
    }

}
