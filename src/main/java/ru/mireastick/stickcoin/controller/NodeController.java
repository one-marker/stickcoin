package ru.mireastick.stickcoin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.mireastick.stickcoin.model.Node;
import ru.mireastick.stickcoin.service.NodeService;

import java.util.List;

@Controller
@RequestMapping("nodes")
public class NodeController {

    private final NodeService nodeService;

    public NodeController(NodeService nodeService) {
        this.nodeService = nodeService;
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public @ResponseBody
    List<Node> getNodes(@PathVariable int id) {
        return nodeService.getNodes();
    }


}