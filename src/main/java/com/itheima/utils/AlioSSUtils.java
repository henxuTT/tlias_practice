package com.itheima.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@Component
public class AlioSSUtils {

    @Autowired
    private AliOSSProperties aliOSSProperties;

    public String upload(MultipartFile file) throws IOException {
        String endpoint = aliOSSProperties.getEndpoint();
        String accessKeyId = aliOSSProperties.getAccessKeyId();
        String accessKeySecret = aliOSSProperties.getAccessKeySecret();
        String bucketName = aliOSSProperties.getBucketName();

        InputStream inputStream = file.getInputStream();
        String originalFilename = file.getOriginalFilename();
        int index = originalFilename.lastIndexOf(".");
        String extname = originalFilename.substring(index);
        String newFileName = UUID.randomUUID() + extname;

//        Oss ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//        ossClient.putObject(bucketName, newFileName, inputStream);

        String url = endpoint.split("//")[0] + "//" + bucketName + "." +endpoint.split("//")[1];

        return url;
    }


}
