package io.dstore.helper;

import io.grpc.*;

import java.util.concurrent.Executor;

/**
 * Created by bdolkemeier on 30.11.16.
 */
public class DstoreCredentials implements CallCredentials {

    private io.grpc.Metadata metadata = new io.grpc.Metadata();

    public DstoreCredentials() {
        this("default");
    }

    public DstoreCredentials(String accessToken) {
        metadata.put(DstoreMetadata.ACCESS_TOKEN_KEY,accessToken);
    }

    public DstoreCredentials(String username, String password) {
        this("default", username, password);
    }

    public DstoreCredentials(String accessToken, String username, String password) {
        metadata.put(DstoreMetadata.ACCESS_TOKEN_KEY,accessToken);
        metadata.put(DstoreMetadata.USERNAME_KEY,username);
        metadata.put(DstoreMetadata.PASSWORD_KEY,password);
    }

    @Override
    public void applyRequestMetadata(MethodDescriptor<?, ?> method, Attributes attrs, Executor appExecutor, MetadataApplier applier) {
        applier.apply(metadata);
    }
}
