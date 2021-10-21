package ru.mireastick.stickcoin.model.blockchain;

import lombok.Getter;

import java.util.LinkedList;
import java.util.List;

@Getter
public class Blockchain {

    List<Block> blockChain = new LinkedList<>();

    public void addBlock(Block block) {
        blockChain.add(block);
    }
}
