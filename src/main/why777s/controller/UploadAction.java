package controller;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by why777s on 2017/6/18.
 */
public class UploadAction extends ActionSupport {

    //封装上传文件域的成员变量
    private File upload;
    //封装上传文件类型的成员变量
    private String uploadContentType;
    //封装上传文件名的属性
    private String uploadFileName;
    //直接在struts.xml配置值的方法
    private String savePath;

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    //获取上传文件的保存位置
    public String getSavePath() {
        return ServletActionContext.getServletContext()
                .getRealPath(savePath);
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public String upload() throws Exception{
        //以服务器的文件保存地址和原文件名建立上传文件输出流

//      FileOutputStream fos = new FileOutputStream(getSavePath() + "\\" + getUploadFileName());
//      经测试，上面这种写法是错的！

        FileInputStream fis = new FileInputStream(upload);

        FileOutputStream fos = new FileOutputStream(new File(getSavePath(),uploadFileName));


        byte[] buffer = new byte[1024];
        int len = 0 ;

        while ((len = fis.read(buffer)) > 0){
            fos.write(buffer,0,len);
        }

        fos.close();
        fis.close();

        return SUCCESS;
    }
}
