package com.github.xtermi2.java15.jep339eddsa;

import java.security.*;

public class EdDSAHelper {

    protected static final String ED_DSA_ALGORITHM = "Ed25519";

    public KeyPair generateKeyPair() throws NoSuchAlgorithmException {
        KeyPairGenerator kpg = KeyPairGenerator.getInstance(ED_DSA_ALGORITHM);
        return kpg.generateKeyPair();
    }

    public byte[] signMsg(PrivateKey pk, byte[] msg) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        Signature sig = Signature.getInstance(ED_DSA_ALGORITHM);
        sig.initSign(pk);
        sig.update(msg);
        byte[] s = sig.sign();
        return s;
    }

    public boolean verifySignature(PublicKey pk, byte[] signature, byte[] msg) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        Signature sig = Signature.getInstance(ED_DSA_ALGORITHM);
        sig.initVerify(pk);
        sig.update(msg);
        return sig.verify(signature);
    }
}
