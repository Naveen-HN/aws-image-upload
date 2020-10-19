package com.naveenhn.awsimageupload.config;

@Configuration
public class AmazonConfig{

    @Bean
    public AmazonS3 s3(){
       AWSCredentials awsCredentials = new BasicAWSCredentials(
        accessKey: "AKIAJGYL6WW7UO6UU2HA",
           secretKey: "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"
       );
       return AmazonS3ClientBuilder
       .standard()
       .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
       .build();
    }

}

