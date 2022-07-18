package x01_oop.four_features.abstraction;

import java.io.File;
import java.io.FileDescriptor;

public class PictureStorage implements IPictureStorage {
    @Override
    public void savePicture(File picture) {
    }

    @Override
    public File getPicture(String pictureId) {
        return null;
    }

    @Override
    public void deletePicture(String pictureId) {
    }

    @Override
    public void modifyMetaInfo(String pictureId, FileDescriptor metaInfo) {
    }
}
