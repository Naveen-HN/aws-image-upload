package com.naveenhn.awsimageupload.bucket;

public enum BucketName {
    PROFILE_IMAGE("naveen-image-upload-123");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

}