package ru.mireastick.stickcoin.controller;

import org.springframework.web.bind.annotation.*;
import ru.mireastick.stickcoin.model.p2p.Node;

import ru.mireastick.stickcoin.service.NodeService;

import java.util.List;

@RestController
public class NodeController {

    private final NodeService nodeService;

    public NodeController(NodeService nodeService) {
        this.nodeService = nodeService;
    }

    @GetMapping(path = "nodes", produces = "text/plain")
    @ResponseBody
    public List<Node> getNodes() {
        return nodeService.getNodes();
    }

    @PostMapping(path="add")
    @ResponseBody
    public Node registerNode(@RequestBody Node node) {
        return node;
    }

//    @PostMapping(path="transactions/new")
//    @ResponseBody
//    public String newTransaction(@RequestBody Transaction transaction) {
//        return "We'll add a new transaction";
//    }

}