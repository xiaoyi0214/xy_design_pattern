package com.xiaoyi.facade_pattern;

public class FacadeClient {
    public static void main(String[] args) {
        EncryptFacade encryptFacade = new EncryptFacade();
        encryptFacade.fileEncrypt("src.txt","dest.txt");
    }
}
