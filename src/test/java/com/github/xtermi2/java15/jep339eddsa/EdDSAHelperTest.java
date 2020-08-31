package com.github.xtermi2.java15.jep339eddsa;

import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;

import static org.assertj.core.api.Assertions.assertThat;

class EdDSAHelperTest {

    EdDSAHelper underTest = new EdDSAHelper();

    @Test
    void signMsg() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        String msg = "my message";

        KeyPair keyPair = underTest.generateKeyPair();

        final byte[] msgBytes = msg.getBytes(StandardCharsets.UTF_8);
        byte[] signature = underTest.signMsg(keyPair.getPrivate(), msgBytes);

        final boolean valideSignature = underTest.verifySignature(keyPair.getPublic(), signature, msgBytes);

        assertThat(valideSignature)
                .isTrue();
    }
}