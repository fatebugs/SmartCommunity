package com.sc.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author FuXinSha
 * @create 2022/4/22 10:59
 **/
@Controller
public class FileController {

    @RequestMapping("/fileupload")
    public String fileUpload(@RequestParam("file") MultipartFile multipartFile, HttpSession httpSession) throws IOException {
        // 获取上传的文件的文件名
        String filename = multipartFile.getOriginalFilename();
        // 处理文件重名问题
        String hzName = filename.substring(filename.lastIndexOf("."));

        filename = UUID.randomUUID().toString()+hzName;

        // 获取服务器中的文件file目录的路径
        ServletContext servletContext = httpSession.getServletContext();
        String filePath = servletContext.getRealPath("file");
        File file = new File(filePath);
        if(!file.exists()){
            file.mkdir();
        }
        String finalPath=filePath+File.separator+filename;
        // 实现上传功能
        multipartFile.transferTo(new File(finalPath));
        return "forward:/user";
    }

}
