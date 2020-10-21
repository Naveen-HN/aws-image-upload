package com.naveenhn.awsimageupload.config;

import io.github.cdimascio.dotenv.Dotenv;

@Configuration
public class AmazonConfig {

    @Bean
    public AmazonS3 s3() {
        Dotenv dotenv = Dotenv.load();
        AWSCredentials awsCredentials = new BasicAWSCredentials(dotenv.get("ACCESSKEY"), dotenv.get("SECRETKEY"));
        return AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .build();
    }

}
