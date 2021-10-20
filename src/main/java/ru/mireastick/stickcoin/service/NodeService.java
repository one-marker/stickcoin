package ru.mireastick.stickcoin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mireastick.stickcoin.model.Mesh;
import ru.mireastick.stickcoin.model.Node;

import java.util.Arrays;
import java.util.List;

@Service
public class NodeService {

    private final Mesh mesh;

    @Autowired
    public NodeService(Mesh mesh) {
        this.mesh = mesh;
    }

    public void registerNodes() {

    }

    public List<Node> getNodes() {
        return Arrays.asList(new Node(),new Node());
    }
}
