package ru.mireastick.stickcoin.utils;

import ru.mireastick.stickcoin.model.blockchain.Block;


import java.util.Date;

public class BlockUtil {

    public static Block createBlock() {
        Block block = new Block();

        block.setIndex(1L);
        block.setProof("12345");
        block.setTimestamp(new Date());
//        block.setTransactions(new Transaction("1sdfsdf32",
//                "23rfssdfs",
//                231L));
        block.setPreviousHash("snbjksdiuwuwujkjds");

        return block;
    }

}
