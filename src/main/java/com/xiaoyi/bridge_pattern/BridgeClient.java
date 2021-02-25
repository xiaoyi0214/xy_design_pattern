package com.xiaoyi.bridge_pattern;

/**
 * Created on 2021/2/25.
 *
 * @author 小逸
 * @description
 */
public class BridgeClient {
    public static void main(String[] args) {
        Image image;
        ImageImp imp;
//        image = (Image)XMLUtil.getBean("image");
//        imp = (ImageImp)XMLUtil.getBean("os");
        /*如果需要更换图像文件格式或者更换操作系统，只需修改配置文件即可，在实际使用时，可以通过分析图像文件格式后缀名来确定具体的文件格式，在程序运行时获取操作系统信息来确定操作系统类型，无须使用配置文件。当增加新的图像文件格式或者操作系统时，原有系统无须做任何修改，只需增加一个对应的扩充抽象类或具体实现类即可，系统具有较好的可扩展性，完全符合“开闭原则”。*/
        image = new JPGImage();
        imp = new WindowsImp();
        image.setImageImp(imp);
        image.parseFile("小龙女");
    }
}
