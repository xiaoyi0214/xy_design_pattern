package x01_oop.four_features.abstraction.oss;

import java.io.File;
import java.io.FileDescriptor;

/**
 * 抽象
 *
 * @author XiaoYi
 * Created on 2021/12/16.
 */
// 调用者在使用图片存储功能的时候，只需要了解 IPictureStorage 这个接口类暴露了哪些方法就可以了，不需要去查看 PictureStorage 类里的具体实现逻辑。

public interface IPictureStorage {

    void savePicture(File picture);

    File getPicture(String pictureId);

    void deletePicture(String pictureId);

    void modifyMetaInfo(String pictureId, FileDescriptor metaInfo);

}

