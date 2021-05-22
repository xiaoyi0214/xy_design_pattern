package com.xiaoyi.facade_pattern;

// 加密外观类
public class EncryptFacade {
    //维持对其他对象的引用
    private Reader reader;
    private CipherMachine cipher;
    private Writer writer;

    public EncryptFacade() {
        reader = new Reader();
        cipher = new CipherMachine();
        writer = new Writer();
    }

    //调用其他对象的业务方法
    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = reader.readFileToStr(fileNameSrc);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(encryptStr, fileNameDes);
    }
}
