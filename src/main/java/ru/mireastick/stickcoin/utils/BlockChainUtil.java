package ru.mireastick.stickcoin.utils;

import ru.mireastick.stickcoin.model.blockchain.Block;
import ru.mireastick.stickcoin.model.blockchain.Blockchain;

import java.util.List;

public class BlockChainUtil {

    public static Blockchain createBlockChain() {
        Blockchain blockchain = new Blockchain();
        blockchain.addBlock(BlockUtil.createBlock());
        blockchain.addBlock(BlockUtil.createBlock());
        return blockchain;
    }
}
