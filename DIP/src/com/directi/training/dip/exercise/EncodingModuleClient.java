package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        Encoder encoder = new Base64Encoder();
        Database database = new MyDatabase();
        EncodingModule encodingModule = new EncodingModule(encoder, database);
        encodingModule.encodeWithFiles();
        encodingModule.encodeBasedOnNetworkAndDatabase();
    }
}
